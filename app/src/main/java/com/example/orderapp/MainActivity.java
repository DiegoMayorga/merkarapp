package com.example.orderapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Model> modelList;
    RecyclerView recyclerView;
    OrderAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // creating an arraylist

        modelList = new ArrayList<>();
        modelList.add(new Model("Pan Bimbo", getString(R.string.panbimbo), R.drawable.panbimbo ));
        modelList.add(new Model("Milo", getString(R.string.milo), R.drawable.milo));
        modelList.add(new Model("Froot Loops", getString(R.string.loops), R.drawable.loops));
        modelList.add(new Model("Ponqué Ramo", getString(R.string.ramo), R.drawable.ramo));
        modelList.add(new Model("Leche condensada", getString(R.string.condensada), R.drawable.condensada));
        modelList.add(new Model("Avena Alpina", getString(R.string.avena), R.drawable.avena));
        modelList.add(new Model("Jabón Rey", getString(R.string.rey), R.drawable.rey));
        modelList.add(new Model("Bolsas de basura x6", getString(R.string.basura), R.drawable.basura));
        modelList.add(new Model("Colcafé", getString(R.string.colcafe), R.drawable.colcafe));

        // recyclerview
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(null));
        // adapter
        mAdapter = new OrderAdapter(this, modelList);
        recyclerView.setAdapter(mAdapter);




    }
}