package com.my.visionbuilder.activities.Finance.Banking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.google.android.material.tabs.TabLayout;
import com.my.visionbuilder.R;
import com.my.visionbuilder.adapters.BankingAdapters.BankingFragmentsAdapter;

public class BankingTransactionsActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;
    BankingFragmentsAdapter bankingFragmentsAdapter;
    RelativeLayout back_Sign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banking_transactions);

        back_Sign = findViewById(R.id.back_Sign);
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        tabLayout = (TabLayout) findViewById(R.id.tabbed_layout);
        bankingFragmentsAdapter = new BankingFragmentsAdapter(getSupportFragmentManager(), getApplicationContext());
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