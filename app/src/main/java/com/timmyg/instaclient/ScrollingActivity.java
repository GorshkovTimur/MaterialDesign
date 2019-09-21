package com.timmyg.instaclient;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class ScrollingActivity extends AppCompatActivity {

    private List<HumanityEndModel> model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        initModel();

        RecyclerView rv = findViewById(R.id.recycler_view);
        rv.setLayoutManager(new GridLayoutManager(this,2));
        ScrollingAdapter scrollingAdapter = new ScrollingAdapter(this, model);
        rv.setAdapter(scrollingAdapter);

    }



    private void initModel() {
        model = new ArrayList<>();
        for (int i=0; i<100; i++){
            switch (i%4) {
                case (0):
                    model.add(new HumanityEndModel(R.drawable.biohazard));
                    break;
                case (1):
                    model.add(new HumanityEndModel(R.drawable.meteor));
                    break;
                case (2):
                    model.add(new HumanityEndModel(R.drawable.nuclear));
                    break;
                case (3):
                    model.add(new HumanityEndModel(R.drawable.war_machine));
                    break;
            }
        }
    }
}
