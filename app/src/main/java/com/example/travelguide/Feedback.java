package com.example.travelguide;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.rengwuxian.materialedittext.MaterialEditText;

//import com.half.smilerating.BaseRating;
//import com.half.smilerating.SmileRating;

public class Feedback extends AppCompatActivity {


    //private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sendfeedback);
        showDialog();
       // setContentView(R.layout.activity_feedback);

      /*  btn= findViewById(R.id.sendfeedback);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog();
            }
        });*/

    }
    private void showDialog(){
        final AlertDialog.Builder dialog= new AlertDialog.Builder(this);
        dialog.setTitle("Feedback Form");
        dialog.setMessage("Provide us your valuable feedback");
        LayoutInflater inflater = LayoutInflater.from(this);
        View reg_layout = inflater.inflate(R.layout.sendfeedback,null);
        final MaterialEditText editEmail = reg_layout.findViewById(R.id.edtEmail);
        final MaterialEditText editName = reg_layout.findViewById(R.id.edtName);
        final MaterialEditText editFeedback = reg_layout.findViewById(R.id.edtFeedback);
        dialog.setView(reg_layout);

        //set button

        dialog.setPositiveButton("SEND", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                //check validation
                if (TextUtils.isEmpty(editEmail.getText().toString())){
                    Toast.makeText(Feedback.this,"Please type your Email..",Toast.LENGTH_SHORT).show();
                    return;
                }

                if (TextUtils.isEmpty(editName.getText().toString())){
                    Toast.makeText(Feedback.this,"Please Enter your Name",Toast.LENGTH_SHORT).show();
                    return;
                }

                if (TextUtils.isEmpty(editFeedback.getText().toString())){
                    Toast.makeText(Feedback.this,"Feedback field cannot be empty",Toast.LENGTH_SHORT).show();
                    return;
                }

                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference();
                myRef.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull @org.jetbrains.annotations.NotNull DataSnapshot snapshot) {
                        Object value = snapshot.getValue();

                    }

                    @Override
                    public void onCancelled(@NonNull @org.jetbrains.annotations.NotNull DatabaseError error) {
                        Toast.makeText(Feedback.this,"Failed to read value..",Toast.LENGTH_SHORT).show();
                    }
                });

                myRef.child("Users").child(editName.getText().toString()).child("Email").setValue(editEmail.getText().toString());
                myRef.child("Users").child(editName.getText().toString()).child("Feedback").setValue(editFeedback.getText().toString());
                myRef.child("Users").child(editName.getText().toString()).child("Name").setValue(editName.getText().toString());

                Toast.makeText(Feedback.this,"Thanks for your feedback....",Toast.LENGTH_SHORT).show();
            }


        });

        dialog.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }
}

