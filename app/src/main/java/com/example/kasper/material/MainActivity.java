package com.example.kasper.material;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.kasper.material.logic.Data;
import com.example.kasper.material.logic.MyCustomAdapter;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    MyCustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycleView);
        adapter = new MyCustomAdapter(this, Data.getData());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        //Check if Android 5.0 or higher
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){

        }else{

        }

    }
}
