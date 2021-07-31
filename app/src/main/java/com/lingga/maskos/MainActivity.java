package com.lingga.maskos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView myRecyclerView;
    RecyclerViewAdapter myAdapter;

    List<Reseps> reseps1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        reseps1 = new ArrayList<>();
        reseps1.add(new Reseps("Bakso Manis Pedas", "PPPPPP", "PPPPP", "PPPPPPPPP", R.drawable.bakso_manis_pedas));


        myRecyclerView = (RecyclerView) findViewById(R.id.recyclerView_id);

        myAdapter = new RecyclerViewAdapter(this, reseps1);

        myRecyclerView.setLayoutManager(new GridLayoutManager(this, 1));

        myRecyclerView.setAdapter(myAdapter);

    }
}