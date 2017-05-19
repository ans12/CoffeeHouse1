package com.example.amit.coffeehouse;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.security.Key;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by amit on 4/24/2017.
 */
public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private static String[] mDataset;
    private final List<String> mList;
    List<String> mList1;
    List<Integer> mList2;
    private Context context;

    Adapter(Context context,List<String> mList,List<String>mList1,List<Integer> mList2)
    {
        this.context=context;
        this.mList=mList;
        this.mList1=mList1;
        this.mList2=mList2;
    }



    public Adapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.cccc,parent,false);
        return new MyViewHolder(view);





    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

        holder.textView.setText(mList.get(position));
        holder.t1.setText(mList1.get(position));




        holder.imageView.setImageResource(mList2.get(position));

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o1 = new Intent(context,Main8Activity.class);
                o1.putExtra("img",mList2.get(position));
                o1.putExtra("name",mList.get(position));
                context.startActivity(o1);



            }
        });
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView textView,t1;
        ImageView imageView;
        CardView cardView;
        public MyViewHolder(View itemView) {
            super(itemView);
            cardView=(CardView)itemView.findViewById(R.id.cardview);
            t1=(TextView)itemView.findViewById(R.id.textView2);
            textView=(TextView)itemView.findViewById(R.id.textView);
            imageView=(ImageView)itemView.findViewById(R.id.imageView);
            cardView.setMinimumHeight(200);
            cardView.setMinimumWidth(itemView.getWidth()/2);


        }
    }


}


