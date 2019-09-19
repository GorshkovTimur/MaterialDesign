package com.timmyg.instaclient;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class ToolbarActivity extends AppCompatActivity {

    private Button buttonShow;
    private Button buttonHide;
    private ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        progressBar = findViewById(R.id.progress_bar);
        buttonShow = findViewById(R.id.button_show);
        buttonHide = findViewById(R.id.button_hide);

        buttonShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (view.getVisibility()!=View.VISIBLE) {
                    progressBar.setVisibility(View.VISIBLE);
                }
            }
        });

        buttonHide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.getVisibility()!=View.INVISIBLE){
                    progressBar.setVisibility(View.INVISIBLE);
                }
            }
        });


    }



    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        switch (id){
            case android.R.id.home:
                Log.i("Timur","Back is pressed");
                return true;

                default:
                    return super.onOptionsItemSelected(item);
        }
        
    }
}
