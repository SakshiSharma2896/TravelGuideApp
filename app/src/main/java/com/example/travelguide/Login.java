package com.example.travelguide;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.InputType;
import android.text.TextUtils;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.firebase.client.AuthData;
import com.firebase.client.Firebase;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FacebookAuthProvider;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

//import com.facebook.appevents.AppEventsLogger;

public class Login extends AppCompatActivity {

    EditText txtEmail, txtPassword;
    Button btn_login;
    ProgressDialog progressDialog;
    private FirebaseAuth Auth;
    private Firebase.AuthStateListener authStateListener;
    private SignInButton signInButton;
    private GoogleSignInClient mGoogleSignInClient;
    //private String TAG="LoginActivity";
    private static final int RC_SIGN_IN=100;
    private LoginButton fbloginbtn;

    private static final String TAg="FacebookAuthentication";
    TextView forgetPassword;

    private CallbackManager callbackManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        TextView register = findViewById(R.id.register);

        forgetPassword= findViewById(R.id.forgetPassword);

        //register button click
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login.this, Registration.class));
                finish();
            }
        });

        //forget password button click
        forgetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showRecoverPasswordDialog();
            }
        });

        progressDialog= new ProgressDialog(this);


        // Configure Google Sign In
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(getString(R.string.default_web_client_id))
                .requestEmail()
                .build();

        mGoogleSignInClient= GoogleSignIn.getClient(this,gso);
        Auth = FirebaseAuth.getInstance();
        txtEmail = findViewById(R.id.email1);
        txtPassword = findViewById(R.id.password1);
        btn_login = findViewById(R.id.login);
        signInButton = findViewById(R.id.googleLoginBtn);

       // FacebookSdk.sdkInitialize(getApplicationContext());
        //fbloginbtn= findViewById(R.id.fblogin_button);
        //callbackManager= CallbackManager.Factory.create();
        //fbloginbtn.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
          /*  @Override
            public void onSuccess(LoginResult loginResult) {
                Log.d(TAg,"onSuccess" + loginResult);
                //handleFacebookToken(loginResult.getAccessToken());

            }

            @Override
            public void onCancel() {
                Log.d(TAg,"onCancel");
            }

            @Override
            public void onError(FacebookException error) {
                Log.d(TAg,"onError" + error);
            }
        });
*/


        //login button click
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = txtEmail.getText().toString().trim();
                String password = txtPassword.getText().toString().trim();

                if (TextUtils.isEmpty(email)) {
                    Toast.makeText(Login.this, "Enter Email", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (TextUtils.isEmpty(password)) {
                    Toast.makeText(Login.this, "Enter Password", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                    txtEmail.setError("Invalid Email");
                    txtEmail.setFocusable(true);
                }

                /*if (password.length() < 6) {
                    Toast.makeText(Login.this, "Password too short", Toast.LENGTH_SHORT).show();
                }*/
            else {
                progressDialog.setMessage("Logging In......");
                progressDialog.show();
                Auth.signInWithEmailAndPassword(email, password)
                        .addOnCompleteListener(Login.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    progressDialog.dismiss();
                                    FirebaseUser user= Auth.getCurrentUser();

                                    startActivity(new Intent(getApplicationContext(), NavigationPage.class));
                                    finish();
                                } else {
                                    progressDialog.dismiss();
                                    Toast.makeText(Login.this, "Authentication Failed", Toast.LENGTH_SHORT).show();
                                    //updateUI(null);
                                }

                            }
                        }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        progressDialog.dismiss();
                        Toast.makeText(Login.this,""+e.getMessage(),Toast.LENGTH_SHORT).show();
                    }
                });
            }
            }
        });

        //handle google login

        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signInIntent = mGoogleSignInClient.getSignInIntent();

                startActivityForResult(signInIntent,RC_SIGN_IN);
            }
        });
    }

    /*private void handleFacebookToken(AccessToken accessToken) {
        Log.d(TAg,"handleFacebookToken" + accessToken);
        AuthCredential credential= FacebookAuthProvider.getCredential(accessToken.getToken());
        Auth.signInWithCredential(credential).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    Log.d(TAg,"Sign in with credential: successful");
                    FirebaseUser user= Auth.getCurrentUser();
                    startActivity(new Intent(Login.this,NavigationPage.class));
                   // updateUI(user);
                }else {
                    Log.d(TAg,"Sign in with credential: failure",task.getException());
                    Toast.makeText(Login.this,"Authentication Failed",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }*/


    private void showRecoverPasswordDialog() {

        AlertDialog.Builder builder= new AlertDialog.Builder(this);
        builder.setTitle("Recover Password");
        LinearLayout linearLayout= new LinearLayout(this);
        final EditText emailEt= new EditText(this);

        emailEt.setHint("Enter Email");
        emailEt.setInputType(InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS);

        emailEt.setMinEms(16);

        linearLayout.addView(emailEt);
        linearLayout.setPadding(10,10,10,10);
        builder.setView(linearLayout);


        builder.setPositiveButton("Recover", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String email= emailEt.getText().toString().trim();
                beginRecovery(email);
            }
        });

        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        builder.create().show();
    }

    private void beginRecovery(String email) {

        progressDialog.show();
        progressDialog.setMessage("Sending Email......");

        Auth.sendPasswordResetEmail(email).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                progressDialog.dismiss();
                if (task.isSuccessful()){
                    Toast.makeText(Login.this,"Email Sent",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(Login.this,"Failed.....",Toast.LENGTH_SHORT).show();
                }
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                progressDialog.dismiss();
                Toast.makeText(Login.this,""+e.getMessage(),Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {

        super.onActivityResult(requestCode, resultCode, data);

        // Result returned from launching the Intent from GoogleSignInApi.getSignInIntent(...);
        if (requestCode == RC_SIGN_IN) {
            Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);

            try {
                // Google Sign In was successful, authenticate with Firebase
                GoogleSignInAccount account = task.getResult(ApiException.class);
                firebaseAuthWithGoogle(account);
            } catch (ApiException e) {
                // Google Sign In failed, update UI appropriately
                Toast.makeText(this,""+e.getMessage(),Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void firebaseAuthWithGoogle(GoogleSignInAccount acct) {
        AuthCredential credential = GoogleAuthProvider.getCredential(acct.getIdToken(), null);
        Auth.signInWithCredential(credential)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            FirebaseUser user = Auth.getCurrentUser();
                            //Toast.makeText(this,""+user.getEmail(),Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(), NavigationPage.class));
                            finish();
                            //updateUI(user);
                        } else {
                            // If sign in fails, display a message to the user.
                            Toast.makeText(Login.this,"Login Failed......",Toast.LENGTH_SHORT).show();
                            //updateUI(null);
                        }
                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(Login.this,""+e.getMessage(),Toast.LENGTH_SHORT).show();
            }
        });
    }


    private  void handleSignInResult( Task<GoogleSignInAccount> completedTask){
        try {
            GoogleSignInAccount acc=completedTask.getResult(ApiException.class);
            Toast.makeText(Login.this,"Signed In Successfully",Toast.LENGTH_SHORT).show();
            FirebaseGoogleAuth(acc);
        }catch (ApiException e){
            Toast.makeText(Login.this,"Sign In Fail",Toast.LENGTH_SHORT).show();
            FirebaseGoogleAuth(null);
        }

    }

    private void FirebaseGoogleAuth(GoogleSignInAccount acct){
        AuthCredential authCredential= GoogleAuthProvider.getCredential(acct.getIdToken(),null);
        Auth.signInWithCredential(authCredential).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Toast.makeText(Login.this,"Successful ",Toast.LENGTH_SHORT).show();
                    FirebaseUser firebaseUser= Auth.getCurrentUser();
                    updateUI(firebaseUser);
                }else {
                    Toast.makeText(Login.this,"Failed",Toast.LENGTH_SHORT).show();
                    updateUI(null);
                }
            }
        });
    }

    private void updateUI(FirebaseUser user){
        GoogleSignInAccount account = GoogleSignIn.getLastSignedInAccount(this);
        //updateUI(account);
        if(account!=null){
            String personName= account.getDisplayName();
            String personGivenName= account.getGivenName();
            String personFamilyName= account.getFamilyName();
            String personEmail= account.getEmail();
            String personId= account.getId();
            Uri personPhoto= account.getPhotoUrl();
            Toast.makeText(Login.this,personName + personEmail,Toast.LENGTH_SHORT).show();

        }
    }


 }

