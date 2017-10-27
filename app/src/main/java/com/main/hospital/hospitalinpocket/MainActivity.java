package com.main.hospital.hospitalinpocket;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

//import com.firebase.ui.auth.AuthUI;
//import com.google.firebase.auth.FirebaseAuth;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnLoginPatient, btnLoginDr;
    public static final int SIGNINRQ=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLoginDr= (Button) findViewById(R.id.btnLoginDr);
        btnLoginPatient= (Button) findViewById(R.id.btnLoginPatient);
        btnLoginDr.setOnClickListener(this);
        btnLoginPatient.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.btnLoginDr){
            Intent i=new Intent(MainActivity.this,LoginActivity.class);
            i.putExtra("login", "Dr");
            startActivity(i);

        } else if(view.getId()==R.id.btnLoginPatient){
            Intent i=new Intent(MainActivity.this,LoginActivity.class);
            i.putExtra("login","patient");
            startActivity(i);
        }
    }
}
