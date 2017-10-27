package com.main.hospital.hospitalinpocket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    EditText et1;
    TextView t1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
         et1= (EditText)findViewById(R.id.editText1);
          t1= (TextView)findViewById(R.id.textView1);
          b1=  (Button) findViewById(R.id.button1);

        b1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                Intent i= new Intent(Main3Activity.this, Main5Activity.class);

                startActivity(i);
            }


        });
    }
}
