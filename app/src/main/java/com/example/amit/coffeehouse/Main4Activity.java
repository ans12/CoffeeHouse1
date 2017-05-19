package com.example.amit.coffeehouse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class Main4Activity extends AppCompatActivity {
    RecyclerView rc;
    Adapter adapter;
   // ArrayList<String>arrayList;
     List<String> mList;
    List<String> mList1;
    List<Integer> mList2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        mList=new ArrayList<>();
        mList.add("LATTE");


        mList.add("BLACK COFFEE");

        mList.add("FEBRICCE");
        mList.add("CAPPUCCINO");
        mList.add("COLD COFFEE");
        mList.add("HOT COFFEE");
        mList.add("SNACKS");
        mList.add("TEA");
        mList1=new ArrayList<>();
        mList1.add("Rs 100");
        mList1.add("Rs 150");
        mList1.add("Rs 180");
        mList1.add("Rs 200");
        mList1.add("Rs 50");
        mList1.add("Rs 50");
        mList1.add("Rs 100");
        mList1.add("Rs 20");
        mList2=new ArrayList<>();
        mList2.add(R.drawable.laten);
        mList2.add(R.drawable.black);
        mList2.add(R.drawable.feb);
        mList2.add(R.drawable.capi);
        mList2.add( R.drawable.amit);

        mList2.add(R.drawable.htc);
        mList2.add(R.drawable.snacks);
        mList2.add(R.drawable.tea);
        rc=(RecyclerView)findViewById(R.id.rcv);
        LinearLayoutManager llm=new GridLayoutManager(this,2);//LayoutManager(this,2);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rc.setLayoutManager(llm);
        adapter=new Adapter(Main4Activity.this,mList,mList1,mList2);

        rc.setAdapter(adapter);

    }
}
