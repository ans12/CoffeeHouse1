package com.example.amit.coffeehouse;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{
    Button b1,b2,b3,b4,b5,b6,b7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b5=(Button)findViewById(R.id.button5);
        b6=(Button)findViewById(R.id.button7);
        b7=(Button)findViewById(R.id.button8);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
    }
    public void onClick(View v)
    {
     switch (v.getId())
        {
            case R.id.button:
            {
                Intent o1=new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(o1);
                break;
            }

            case R.id.button2:
            {
                 Intent o2=new Intent(Main2Activity.this,Main4Activity.class);
                startActivity(o2);
                break;
            }

            case R.id.button3:
            {
                Intent o3=new Intent(Main2Activity.this,Main5Activity.class);
                startActivity(o3);
                break;
            }

            case R.id.button4:
            {
                Dialog dialog=new Dialog(this);
                dialog.setCancelable(true);
                dialog.setContentView(R.layout.activity_main6);
                dialog.show();
                //dialog.findViewById(R.id.button4).setOnClickListener();
                break;
            }

            case  R.id.button5:
            {
                Intent o5=new Intent(Main2Activity.this,Main7Activity.class);
                startActivity(o5);
                break;
            }
            case R.id.button7:
            {
                Intent o6=new Intent(Main2Activity.this,LoginActivity.class);
                startActivity(o6);
                break;
            }
            case R.id.button8:
            {
                Intent o7=new Intent(Main2Activity.this,SignupActivity.class);
                startActivity(o7);
                break;
            }

        }

    }
}
