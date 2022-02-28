package com.my.visionbuilder.activities.Business;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.my.visionbuilder.R;
import com.my.visionbuilder.activities.Finance.FinanceActivity;
import com.my.visionbuilder.adapters.Business.BusinessDetailsAdapter;
import com.my.visionbuilder.adapters.FinanceAdapter.FinanceAdapter;
import com.my.visionbuilder.models.BusinessNavigation;
import com.my.visionbuilder.models.FinanceNavigation;

import java.util.ArrayList;

public class BusinessDetailsActivity extends AppCompatActivity {

    RecyclerView navigation_Recyclerview;
    RelativeLayout back_Sign;
    ArrayList<BusinessNavigation> list;
    BusinessDetailsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_details);

        back_Sign = findViewById(R.id.back_Sign);
        navigation_Recyclerview = (RecyclerView) findViewById(R.id.navigation_Recyclerview);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL);
        navigation_Recyclerview.setLayoutManager(staggeredGridLayoutManager);
        navigation_Recyclerview.setNestedScrollingEnabled(false);
        list = new ArrayList<BusinessNavigation>();
        adapter = new BusinessDetailsAdapter(BusinessDetailsActivity.this, list);
        navigation_Recyclerview.setAdapter(adapter);
        loadNavigationViews();
        back_Sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    public void loadNavigationViews() {
        BusinessNavigation monthlyBills = new BusinessNavigation(R.drawable.finance_ic, "Monthly Bills", "");
        BusinessNavigation businessBio = new BusinessNavigation(R.drawable.finance_ic, "Business Bio", "");
        BusinessNavigation businessGoals = new BusinessNavigation(R.drawable.finance_ic, "Business Goals", "");
        BusinessNavigation businessPlans = new BusinessNavigation(R.drawable.finance_ic, "Business Plans", "");
        BusinessNavigation businessContacts = new BusinessNavigation(R.drawable.finance_ic, "Business Contacts", "");
        BusinessNavigation businessSpreadsheetTemplates = new BusinessNavigation(R.drawable.finance_ic, "Business Spreadsheet\n Templates", "");
        BusinessNavigation businessMeetings = new BusinessNavigation(R.drawable.finance_ic, "Business Meetings", "");
        BusinessNavigation businessTravel = new BusinessNavigation(R.drawable.finance_ic, "Business Travel", "");
        BusinessNavigation businessIncomeTaker = new BusinessNavigation(R.drawable.finance_ic, "Business Income\n Taker", "");
        BusinessNavigation businessInvestments = new BusinessNavigation(R.drawable.finance_ic, "Business Investments", "");
        BusinessNavigation businessTraining = new BusinessNavigation(R.drawable.finance_ic, "Business Training", "");
        list.add(monthlyBills);
        list.add(businessBio);
        list.add(businessGoals);
        list.add(businessPlans);
        list.add(businessContacts);
        list.add(businessSpreadsheetTemplates);
        list.add(businessMeetings);
        list.add(businessMeetings);
        list.add(businessTravel);
        list.add(businessIncomeTaker);
        list.add(businessInvestments);
        list.add(businessTraining);
        adapter.notifyDataSetChanged();
    }
}