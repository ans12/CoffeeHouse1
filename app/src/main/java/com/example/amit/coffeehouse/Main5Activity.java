package com.example.amit.coffeehouse;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import static android.content.Intent.ACTION_CALL;

public class Main5Activity extends AppCompatActivity implements View.OnClickListener {
    Button b1, b2, b3, b4, b5, b6;
    TextView t1, t2, t3, t4, t5, t6, t7, t8 ,t9 ,t10 ,t11 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);
        t1 = (TextView) findViewById(R.id.textView1);
        t2 = (TextView) findViewById(R.id.textView2);
        t3 = (TextView) findViewById(R.id.textView3);
        t4 = (TextView) findViewById(R.id.textView4);
        t5 = (TextView) findViewById(R.id.textView5);
        t6 = (TextView) findViewById(R.id.textView6);
        t7 = (TextView) findViewById(R.id.textView7);
        t8 = (TextView) findViewById(R.id.textView8);
        t9 = (TextView) findViewById(R.id.textView);
        t10 = (TextView) findViewById(R.id.textView9);
        t11 = (TextView) findViewById(R.id.textView10);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1: {
                Intent o1 = new Intent(Intent.ACTION_CALL, Uri.parse("tel:+917417717718"));
                if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(o1);
                break;
            }
            case R.id.button2:
            {
                Intent o2=new Intent(Intent.ACTION_SENDTO,Uri.parse("smsto:+917417717718"));
                startActivity(o2);
                break;
            }
            case R.id.button4:
            {
                Intent o3=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.facebook.com"));
                startActivity(o3);
                break;
            }
            case R.id.button3:
            {
                Intent o4=new Intent(Intent.ACTION_SENDTO,Uri.fromParts("mailto","amitpandeyap12345@gmail.com",null));
                startActivity(Intent.createChooser(o4,"Choose an Email account:"));
                break;
            }
            case R.id.button5:
            {
                Intent o5=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.instagram.com"));
                startActivity(o5);
                break;
            }
            case R.id.button6:
            {
                Intent o6=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.twitter.com"));
                startActivity(o6);
                break;
            }
        }
    }
}
