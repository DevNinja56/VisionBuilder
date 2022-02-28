package com.my.visionbuilder.activities.SavingPlan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.my.visionbuilder.R;
import com.my.visionbuilder.activities.Finance.FinanceActivity;
import com.my.visionbuilder.adapters.FinanceAdapter.FinanceAdapter;
import com.my.visionbuilder.adapters.SavingPlanAdapters.SavingPlanNavigationAdapter;
import com.my.visionbuilder.models.FinanceNavigation;
import com.my.visionbuilder.models.SavingPlanNavigation;

import java.util.ArrayList;

public class SavingPlanActivity extends AppCompatActivity {

    RecyclerView navigation_Recyclerview;
    RelativeLayout back_Sign;
    ArrayList<SavingPlanNavigation> list;
    SavingPlanNavigationAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saving_plan);
        back_Sign = findViewById(R.id.back_Sign);
        navigation_Recyclerview = (RecyclerView) findViewById(R.id.navigation_Recyclerview);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL);
        navigation_Recyclerview.setLayoutManager(staggeredGridLayoutManager);
        navigation_Recyclerview.setNestedScrollingEnabled(false);
        list = new ArrayList<SavingPlanNavigation>();
        adapter = new SavingPlanNavigationAdapter(SavingPlanActivity.this, list);
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
        SavingPlanNavigation s1 = new SavingPlanNavigation(R.drawable.finance_ic, "Person Saving");
        SavingPlanNavigation s2 = new SavingPlanNavigation(R.drawable.finance_ic, "Emergency Fund");
        SavingPlanNavigation s3 = new SavingPlanNavigation(R.drawable.finance_ic, "Rent/Mortgage");
        SavingPlanNavigation s4 = new SavingPlanNavigation(R.drawable.finance_ic, "Auto Payment");
        SavingPlanNavigation s5 = new SavingPlanNavigation(R.drawable.finance_ic, "Groceries");
        SavingPlanNavigation s6 = new SavingPlanNavigation(R.drawable.finance_ic, "Gas");
        SavingPlanNavigation s7 = new SavingPlanNavigation(R.drawable.finance_ic, "Clothing");
        SavingPlanNavigation s8 = new SavingPlanNavigation(R.drawable.finance_ic, "Spending");
        SavingPlanNavigation s9 = new SavingPlanNavigation(R.drawable.finance_ic, "Home Remodel");
        SavingPlanNavigation s10 = new SavingPlanNavigation(R.drawable.finance_ic, "Home Maintenance");
        SavingPlanNavigation s11 = new SavingPlanNavigation(R.drawable.finance_ic, "Auto Maintenance");
        SavingPlanNavigation s12 = new SavingPlanNavigation(R.drawable.finance_ic, "Health");
        SavingPlanNavigation s13 = new SavingPlanNavigation(R.drawable.finance_ic, "Family");
        SavingPlanNavigation s14 = new SavingPlanNavigation(R.drawable.finance_ic, "Vacations");
        SavingPlanNavigation s15 = new SavingPlanNavigation(R.drawable.finance_ic, "Giving/Charities");
        SavingPlanNavigation s16 = new SavingPlanNavigation(R.drawable.finance_ic, "Holiday");
        SavingPlanNavigation s17 = new SavingPlanNavigation(R.drawable.finance_ic, "Back To School");
        SavingPlanNavigation s18 = new SavingPlanNavigation(R.drawable.finance_ic, "Gifts");
        SavingPlanNavigation s19 = new SavingPlanNavigation(R.drawable.finance_ic, "Work");
        SavingPlanNavigation s20 = new SavingPlanNavigation(R.drawable.finance_ic, "Other");
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s6);
        list.add(s7);
        list.add(s8);
        list.add(s9);
        list.add(s10);
        list.add(s11);
        list.add(s12);
        list.add(s13);
        list.add(s14);
        list.add(s15);
        list.add(s16);
        list.add(s17);
        list.add(s18);
        list.add(s19);
        list.add(s20);
        adapter.notifyDataSetChanged();
    }
}