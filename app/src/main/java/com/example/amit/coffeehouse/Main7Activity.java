package com.example.amit.coffeehouse;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main7Activity extends AppCompatActivity implements View.OnClickListener {
    Button b1, b2, b3, b4;
    TextView t1, t2;
    EditText et1, et2, et3, et4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        t1 = (TextView) findViewById(R.id.textView1);
        t2 = (TextView) findViewById(R.id.textView2);

        et1 = (EditText) findViewById(R.id.editText);
        et2 = (EditText) findViewById(R.id.editText1);
        et3 = (EditText) findViewById(R.id.editText2);
        et4 = (EditText) findViewById(R.id.editText3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Your message has sent", Toast.LENGTH_SHORT).show();
            }
        });
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        t1.setOnClickListener(this);
        t2.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button5: {
                Intent o1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com"));
                startActivity(o1);
                break;
            }
            case R.id.button4: {
                Intent o2 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.twitter.com"));
                startActivity(o2);
                break;
            }
            case R.id.button3: {
                Intent o3 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.instagram.com"));
                startActivity(o3);
                break;
            }
            case R.id.textView1: {
                Intent o4 = new Intent(Main7Activity.this, LoginActivity.class);
                startActivity(o4);
                break;
            }
            case R.id.textView2: {
                Intent o5=new Intent(Main7Activity.this, SignupActivity.class);
                startActivity(o5);
                break;
            }
        }
    }
}