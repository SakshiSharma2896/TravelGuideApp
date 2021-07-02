package com.example.travelguide;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.io.File;

public class NavigationPage extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

   // private AppBarConfiguration mAppBarConfiguration;

    FirebaseAuth firebaseAuth;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_page);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);

        firebaseAuth= FirebaseAuth.getInstance();

        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
      /*  mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);*/
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

    }


    private void checkUserStatus(){
        FirebaseUser user= firebaseAuth.getCurrentUser();
        if (user!=null){
            //user is signed in stay here
        }else{
            // user is not signed in go to homepage activity
            startActivity(new Intent(NavigationPage.this,HomePage.class));
            finish();
        }
    }

    @Override
    protected void onStart() {
        //on start of app
        checkUserStatus();
        super.onStart();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigation_page, menu);
        return true;
    }

    /*@Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }*/

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            firebaseAuth.signOut();
            checkUserStatus();
            //startActivity(new Intent(this, Login.class));
            //DrawerLayout drawer = findViewById(R.id.drawer_layout);
            //drawer.closeDrawer(GravityCompat.START);
            //return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            //super.onBackPressed();
            final AlertDialog.Builder builder = new AlertDialog.Builder(NavigationPage.this);
            builder.setMessage("Are you sure want to exit?");
            builder.setCancelable(true);
            builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    NavigationPage.super.finish();
                }
            }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
        }

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.nav_home) {
            startActivity(new Intent(NavigationPage.this,RecyclerActivity.class));
        }else if (id == R.id.nav_slideshow) {
            startActivity(new Intent(NavigationPage.this, TempRecommendation.class));
        }else if (id == R.id.nav_map) {
            startActivity(new Intent(NavigationPage.this,GoogleMap.class));//mapview
        }else if(id== R.id.nav_nearby){
           /* intent = new Intent();
            intent.setComponent(new ComponentName("com.example.nearbyplacemap","com.example.nearbyplacemap.MapsActivity"));
            startActivity(intent);*/
            startActivity(new Intent(NavigationPage.this,MapsActivity.class));

        }
        else if (id == R.id.nav_gallery) {
            startActivity(new Intent(NavigationPage.this,Feedback.class));
        }else if (id == R.id.nav_rate) {
            startActivity(new Intent(NavigationPage.this, RateUs.class));
        } else if (id == R.id.action_share) {
            ApplicationInfo api = getApplicationContext().getApplicationInfo();
            String apkpatch = api.sourceDir;
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("application/vnd.android.package-archive");
            intent.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(new File(apkpatch)));
            startActivity(Intent.createChooser(intent, "Share Via"));
        } else if (id == R.id.action_send) {
            Intent sharingintent = new Intent(Intent.ACTION_SEND);
            sharingintent.setType("text/plain");
            String sharebody = "link of the app";
            String sharesubjet = "your subject here";
            sharingintent.putExtra(Intent.EXTRA_TEXT, sharebody);
            sharingintent.putExtra(Intent.EXTRA_SUBJECT, sharesubjet);
            startActivity(Intent.createChooser(sharingintent, "Send To"));
        } else if (id == R.id.action_settings) {
            startActivity(new Intent(NavigationPage.this, Login.class));}
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

