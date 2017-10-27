package com.main.hospital.hospitalinpocket;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.firebase.ui.auth.AuthUI;
import com.google.firebase.auth.FirebaseAuth;

import java.util.Arrays;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnLoginPatient, btnLoginDr;
    FirebaseAuth fbAuth;
    FirebaseAuth.AuthStateListener authStateListener;
    public static final int SIGNINRQ=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLoginDr= (Button) findViewById(R.id.btnLoginDr);
        btnLoginPatient= (Button) findViewById(R.id.btnLoginPatient);


    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.btnLoginDr){
            signIn();
        } else if(view.getId()==R.id.btnLoginPatient){
            signIn();
        }
    }

    public void signIn(){
        fbAuth = FirebaseAuth.getInstance();
        authStateListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                if (firebaseAuth.getCurrentUser() != null) {

                } else {
                    Intent signInIntent = AuthUI.getInstance()
                            .createSignInIntentBuilder()
                            .setIsSmartLockEnabled(false)
                            .setTheme(R.style.Theme_Design)
                            .setAvailableProviders(Arrays.asList(
                                    new AuthUI.IdpConfig.Builder(AuthUI.EMAIL_PROVIDER).build(),
                                    new AuthUI.IdpConfig.Builder(AuthUI.GOOGLE_PROVIDER).build(),
                                    new AuthUI.IdpConfig.Builder(AuthUI.PHONE_VERIFICATION_PROVIDER).build()
                            ))
                            .build();
                    startActivityForResult(signInIntent, SIGNINRQ);
                }
            }
        };
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == SIGNINRQ) {
            if (resultCode == RESULT_OK) {
                Toast.makeText(MainActivity.this, "Welcome " + fbAuth.getCurrentUser().getDisplayName(), Toast.LENGTH_LONG).show();

            } else {
                Toast.makeText(MainActivity.this, "Sign in failed", Toast.LENGTH_LONG).show();
                finish();
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}
