package com.my.visionbuilder.activities.VisionPlatform;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.google.android.material.tabs.TabLayout;
import com.my.visionbuilder.R;
import com.my.visionbuilder.adapters.VisionBuilder.ProfileFragmentAdapter;

public class UserProfileActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;
    ProfileFragmentAdapter profileFragmentAdapter;
    RelativeLayout back_Sign;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        back_Sign = findViewById(R.id.back_Sign);
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        tabLayout = (TabLayout) findViewById(R.id.tabbed_layout);
        profileFragmentAdapter = new ProfileFragmentAdapter(getSupportFragmentManager(), getApplicationContext());
        viewPager.setAdapter(profileFragmentAdapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        back_Sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}