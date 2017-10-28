package com.main.hospital.hospitalinpocket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUpActivityDr extends AppCompatActivity {

    EditText n1;
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_dr);

        n1 = (EditText)findViewById(R.id.input_name);
        bt = (Button)findViewById(R.id.btn_login);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = n1.getText().toString();

                Intent i =  new Intent(SignUpActivityDr.this, Main3Activity.class);

                Bundle b1 = new Bundle();
                b1.putString("Name", name);

                i.putExtras(b1);
                startActivity(i);
            }
        });
    }
}

