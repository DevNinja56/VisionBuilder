package com.my.visionbuilder.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;
import com.my.visionbuilder.R;
import com.my.visionbuilder.adapters.LoginSignupAdapter;

import de.hdodenhof.circleimageview.CircleImageView;

public class LoginSignupActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_signup);

        viewPager = findViewById(R.id.view_pager);
        tabLayout = findViewById(R.id.tabbed_layout);
        LoginSignupAdapter loginSignupAdapter = new LoginSignupAdapter(getSupportFragmentManager());
        viewPager.setAdapter(loginSignupAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}