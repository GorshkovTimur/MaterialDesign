package com.timmyg.instaclient;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;

public class TextActivity extends AppCompatActivity {

    EditText editText;
    TextInputLayout til;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_activity);
        til = findViewById(R.id.inputLayout);
        editText = findViewById(R.id.editText);
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (editText.getText().length() == 0) {
                    til.setErrorEnabled(true);
                    til.setError("String need to be at least 1 symbol");
                } else {
                    til.setError(null);
                    til.setErrorEnabled(false);
                }
                return true;
            }
        });
    }
}

