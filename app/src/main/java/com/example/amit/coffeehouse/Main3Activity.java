package com.example.amit.coffeehouse;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener{
    CheckBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8;
    TextView t1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        cb1=(CheckBox)findViewById(R.id.checkBox1);
        cb2=(CheckBox)findViewById(R.id.checkBox2);
        cb3=(CheckBox)findViewById(R.id.checkBox3);
        cb4=(CheckBox)findViewById(R.id.checkBox4);
        cb5=(CheckBox)findViewById(R.id.checkBox5);
        cb6=(CheckBox)findViewById(R.id.checkBox6);
        cb7=(CheckBox)findViewById(R.id.checkBox7);
        cb8=(CheckBox)findViewById(R.id.checkBox8);

        t1=(TextView)findViewById(R.id.textView1);
        t1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int totalamount=0;
        StringBuilder result=new StringBuilder();
        result.append("Selected item:");
        if(cb6.isChecked())
        {
            result.append("\nLatte 100Rs");
            totalamount+=100;
        }
        if(cb1.isChecked())
        {
            result.append("\nBlack Coffee 150Rs");
            totalamount+=150;
        }
        if(cb2.isChecked())
        {
            result.append("\nCappuccino 200Rs");
            totalamount+=200;
        }
        if(cb3.isChecked())
        {
            result.append("\nFebrice 180Rs");
            totalamount+=180;
        }
        if(cb4.isChecked())
        {
            result.append("\nHot Coffee 50Rs");
            totalamount+=50;
        }
        if(cb5.isChecked())
        {
            result.append("\nCold Coffee 50Rs");
            totalamount+=50;
        }
        if(cb7.isChecked())
        {
            result.append("\nSnackes 100Rs");
            totalamount+=100;
        }
        if(cb8.isChecked())
        {
            result.append("\nTea 20Rs");
            totalamount+=20;
        }
        result.append("\nTotal: "+totalamount+"Rs");



        Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();


    }
}
