
package com.main.hospital.hospitalinpocket;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

public class Main6Activity extends AppCompatActivity
{
    TextView  t1,t2,t3;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        t1=(TextView)findViewById(R.id.textView1);
        t2=(TextView)findViewById(R.id.textView2);
        t3=(TextView)findViewById(R.id.textView3);
        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);

    }
}