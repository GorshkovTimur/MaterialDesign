package com.timmyg.instaclient;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.timmyg.instaclient.fragments_for_tabActivity.Fragment1;
import com.timmyg.instaclient.fragments_for_tabActivity.Fragment2;
import com.timmyg.instaclient.fragments_for_tabActivity.Fragment3;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

public class TabActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);

        Fragment1 fr1 = Fragment1.newInstance(null);
        Fragment2 fr2 = Fragment2.newInstance(null);
        Fragment3 fr3 = Fragment3.newInstance(null);

        AdapterForTab sectionsPagerAdapter = new AdapterForTab(getSupportFragmentManager());
        sectionsPagerAdapter.addFragment(fr1,"tav1");
        sectionsPagerAdapter.addFragment(fr2,"tav2");
        sectionsPagerAdapter.addFragment(fr3,"tav3");
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
    }
}