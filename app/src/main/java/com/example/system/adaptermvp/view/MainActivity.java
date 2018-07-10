package com.example.system.adaptermvp.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.system.adaptermvp.R;
import com.example.system.adaptermvp.model.Data;
import com.example.system.adaptermvp.model.Model;
import com.example.system.adaptermvp.model.MvpAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MvpAdapter adapter;
    private LinearLayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecycler();
    }

    private void initRecycler() {
        recyclerView = findViewById(R.id.view);
        adapter = new MvpAdapter(this, getData());
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private ArrayList<Model> getData() {
        return Data.getList();
    }
}
