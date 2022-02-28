package com.my.visionbuilder.activities.Finance.Education.School;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.google.android.material.tabs.TabLayout;
import com.my.visionbuilder.R;
import com.my.visionbuilder.adapters.Education.EducationDetailsFragmentAdapter;
import com.my.visionbuilder.adapters.Education.KidsAdapter;
import com.my.visionbuilder.adapters.Education.School.SchoolFragmentAdapter;
import com.my.visionbuilder.models.Kid;

import java.util.ArrayList;

public class SchoolActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;
    SchoolFragmentAdapter adapter;
    RelativeLayout back_Sign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school);
        back_Sign = findViewById(R.id.back_Sign);
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        tabLayout = (TabLayout) findViewById(R.id.tabbed_layout);
        adapter = new SchoolFragmentAdapter(getSupportFragmentManager(), getApplicationContext());
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        back_Sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}