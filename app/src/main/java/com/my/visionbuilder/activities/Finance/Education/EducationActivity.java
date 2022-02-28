package com.my.visionbuilder.activities.Finance.Education;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.google.android.material.tabs.TabLayout;
import com.my.visionbuilder.R;
import com.my.visionbuilder.activities.Finance.Income.AddSourceActivity;
import com.my.visionbuilder.adapters.BankingAdapters.BankingFragmentsAdapter;
import com.my.visionbuilder.adapters.Education.EducationDetailsFragmentAdapter;
import com.my.visionbuilder.adapters.Education.KidsAdapter;
import com.my.visionbuilder.models.Kid;
import java.util.ArrayList;

public class EducationActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;
    EducationDetailsFragmentAdapter bankingFragmentsAdapter;
    RelativeLayout back_Sign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education);
        back_Sign = findViewById(R.id.back_Sign);
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        tabLayout = (TabLayout) findViewById(R.id.tabbed_layout);
        bankingFragmentsAdapter = new EducationDetailsFragmentAdapter(getSupportFragmentManager(), getApplicationContext());
        viewPager.setAdapter(bankingFragmentsAdapter);
        tabLayout.setupWithViewPager(viewPager);
        back_Sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}