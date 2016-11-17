package com.example.kasper.material.logic;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextClock;
import android.widget.TextView;

import com.example.kasper.material.MainActivity;
import com.example.kasper.material.R;

import java.util.ArrayList;

/**
 * Created by kasper on 17.11.16.
 */

public class MyCustomAdapter extends RecyclerView.Adapter<MyCustomAdapter.MyViewHolder> {

    Context context;
    ArrayList<Song> data;
    LayoutInflater inflater;

    public MyCustomAdapter(Context context, ArrayList<Song> data) {

        this.context = context;
        this.data = data;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.list_item_view, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.titleTextView.setText(data.get(position).title);
        holder.lengthTextView.setText(""+data.get(position).length);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView titleTextView;
        TextView lengthTextView;

        public MyViewHolder(View itemView) {
            super(itemView);

            titleTextView = (TextView) itemView.findViewById(R.id.title_row);
            lengthTextView = (TextView) itemView.findViewById(R.id.length_row);
        }
    }
}
