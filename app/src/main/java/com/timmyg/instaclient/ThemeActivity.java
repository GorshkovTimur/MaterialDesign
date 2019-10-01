package com.timmyg.instaclient;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThemeActivity extends AppCompatActivity {

    private Button buttonPurple;
    private Button buttonGreen;
    private int themeNumber;
    private final String THEME_ID = "THEME_ID";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (savedInstanceState != null) {
            iniTheme(savedInstanceState.getInt(THEME_ID));
        }

        setContentView(R.layout.activity_theme);

        buttonPurple = findViewById(R.id.purple_theme_button);
        buttonPurple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                themeNumber = 0;
                recreate();
            }
        });


        buttonGreen = findViewById(R.id.green_theme_button);
        buttonGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                themeNumber = 1;
                recreate();
            }
        });


    }


    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(THEME_ID,themeNumber);
    }

    private void iniTheme(int themeNumber) {
    switch (themeNumber){
        case(0):
            setTheme(R.style.AppTheme);
            break;
        case(1):
            setTheme(R.style.AppThemeGreen);
            break;
    }

    }

}
