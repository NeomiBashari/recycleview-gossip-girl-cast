package com.example.gossipgirlid;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Adapter adapter;
    ArrayList<ModelData> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        items = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        for(int i = 0 ; i<AllData.drawableArr.length; i++){
            items.add(new ModelData(
                    AllData.namesArr[i],
                    AllData.versionArr[i],AllData.drawableArr[i]
            ));
        }

        adapter = new Adapter(items);
        recyclerView.setAdapter(adapter);

    }
}