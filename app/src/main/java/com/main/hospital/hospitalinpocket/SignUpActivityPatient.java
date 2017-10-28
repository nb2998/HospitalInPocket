package com.main.hospital.hospitalinpocket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUpActivityPatient extends AppCompatActivity {

    EditText n1;
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_patient);
        n1 = (EditText)findViewById(R.id.input_name_p);
        bt = (Button)findViewById(R.id.btn_login_p);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = n1.getText().toString();

                Intent i =  new Intent(SignUpActivityPatient.this, Main2Activity.class);

                Bundle b1 = new Bundle();
                b1.putString("Name", name);

                i.putExtras(b1);
                startActivity(i);
            }
        });
    }
}
