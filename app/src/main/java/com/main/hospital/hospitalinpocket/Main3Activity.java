package com.main.hospital.hospitalinpocket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    TextView t, t1;
    Button b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        t = (TextView)findViewById(R.id.textView);
        t1 = (TextView)findViewById(R.id.textView1);
//        b1 = (Button)findViewById(R.id.button1);       not showing profile

        Intent j = getIntent();
        Bundle b2 = j.getExtras();

        String v1 = b2.getString("Name");

        t.setText(v1);


//        b1.setOnClickListener(new View.OnClickListener(){
//
//            @Override
//            public void onClick(View arg0) {
//                // TODO Auto-generated method stub
//
//                Intent i= new Intent(Main3Activity.this, Main5Activity.class);
//
//                startActivity(i);
//            }
//
//
//        });
    }
}

