package com.teknar.teknarscrum;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class WeeklyScrumActivity extends AppCompatActivity {

    private Toolbar actionbar;
    private ViewPager vpScrum;
    private TabLayout tabScrum;
    private TabsAdapter tabsAdapter;


    public void init(){


        actionbar = (Toolbar) findViewById(R.id.actionBar);
        getSupportActionBar().setTitle(R.string.app_name);

        vpScrum = (ViewPager) findViewById(R.id.vpScrum);
        tabsAdapter = new  TabsAdapter(getSupportFragmentManager());
        vpScrum.setAdapter(tabsAdapter);



        tabScrum = (TabLayout) findViewById(R.id.tabsScrum);
        tabScrum.setupWithViewPager(vpScrum);



    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weekly_scrum);
        init();

    }
}
