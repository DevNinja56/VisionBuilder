package com.my.visionbuilder.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.google.android.material.tabs.TabLayout;
import com.my.visionbuilder.R;
import com.my.visionbuilder.adapters.TodoListAdapters.TodoListFragmentAdapter;
import com.my.visionbuilder.adapters.TransportationFragmentAdadpter;
import com.my.visionbuilder.fragments.Transportation.GasFragment;
import com.my.visionbuilder.fragments.Transportation.MaintenanceFragment;
import com.my.visionbuilder.fragments.Transportation.PublicTransportFragment;

public class TranportationActivity extends AppCompatActivity {

    RelativeLayout back_Sign;
    private ViewPager viewPager;
    private TabLayout tabLayout;
    TransportationFragmentAdadpter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tranportation);

        viewPager = (ViewPager) findViewById(R.id.view_pager);
        tabLayout = (TabLayout) findViewById(R.id.tabbed_layout);
        adapter = new TransportationFragmentAdadpter(getSupportFragmentManager(), getApplicationContext());
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        back_Sign = findViewById(R.id.back_Sign);
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        back_Sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}