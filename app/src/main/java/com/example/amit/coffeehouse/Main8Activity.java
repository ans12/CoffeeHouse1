package com.example.amit.coffeehouse;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class Main8Activity extends AppCompatActivity {
    ImageView iv;
    String name;
    int imgid;
    HashMap<String, String> map;
    TextView tt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        map = new HashMap<>();
        initMap();
        Intent intent = getIntent();
        imgid = intent.getIntExtra("img", R.drawable.coffee);
        iv = (ImageView) findViewById(R.id.imageView);
        tt=(TextView)findViewById(R.id.textView1);
        iv.setImageResource(imgid);
        String name = intent.getStringExtra("name").toLowerCase();
        tt.setText(map.get(name));

    }

    private void initMap() {
        map.put("LATTE",getString(R.string.LATTE));
       map.put("BLACK COFFEE",getString(R.string.BLACKCOFFEE));
        map.put("FEBRICCE",getString(R.string.FEBRICCE));
        map.put("CAPPUCCINO",getString(R.string.CAPPUCCINO));
        map.put("COLD COFFEE",getString(R.string.COLDCOFFEE));
        map.put("HOT COFFEE",getString(R.string.HOTCOFFEE));
        map.put("SNACKS",getString(R.string.SNACKS));
        map.put("TEA",getString(R.string.TEA));

    }

}

