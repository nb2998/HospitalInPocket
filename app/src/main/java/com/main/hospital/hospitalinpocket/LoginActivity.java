package com.main.hospital.hospitalinpocket;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_signup,btn_login;
    String loginBy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_signup = (Button) findViewById(R.id.btn_signup);
        btn_login = (Button) findViewById(R.id.btn_login);

        Intent i = getIntent();
        loginBy = i.getStringExtra("login");

        btn_login.setOnClickListener(this);
        btn_signup.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_signup) {
            if (loginBy.equals("Dr")) {
                Intent signUpIntent = new Intent(LoginActivity.this, SignUpActivityDr.class);
                startActivity(signUpIntent);
            }
            if (loginBy.equals("patient")) {
                Intent signUpIntent = new Intent(LoginActivity.this, SignUpActivityPatient.class);
                startActivity(signUpIntent);
            }
        }
        if(v.getId()== R.id.btn_login){
            if (loginBy.equals("Dr")) {
                Intent signUpIntent = new Intent(LoginActivity.this, Main3Activity.class);
                signUpIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(signUpIntent);
            }
            if (loginBy.equals("patient")) {
                Intent signUpIntent = new Intent(LoginActivity.this, Main2Activity.class);
                signUpIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(signUpIntent);
            }
        }
    }
}
