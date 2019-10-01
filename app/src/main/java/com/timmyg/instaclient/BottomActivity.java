package com.timmyg.instaclient;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.timmyg.instaclient.fragments_for_tabActivity.Fragment1;
import com.timmyg.instaclient.fragments_for_tabActivity.Fragment2;
import com.timmyg.instaclient.fragments_for_tabActivity.Fragment3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.MenuItem;

public class BottomActivity extends AppCompatActivity {


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    setFragment(Fragment1.newInstance(null));
                    return true;
                case R.id.navigation_dashboard:
                    setFragment(Fragment2.newInstance(null));
                    return true;
                case R.id.navigation_notifications:
                    setFragment(Fragment3.newInstance(null));
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom);
        setFragment(Fragment1.newInstance(null));
        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    private void setFragment (Fragment fragment){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frame_layout_bottom_activity, fragment)
                .commit();
    }

    public static class ButtonActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_button_lesson8);
        }
    }
}
