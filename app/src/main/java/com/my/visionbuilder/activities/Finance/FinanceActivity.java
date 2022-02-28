package com.my.visionbuilder.activities.Finance;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.my.visionbuilder.R;
import com.my.visionbuilder.adapters.FinanceAdapter.FinanceAdapter;
import com.my.visionbuilder.models.FinanceNavigation;

import java.util.ArrayList;

public class FinanceActivity extends AppCompatActivity {

    RecyclerView navigation_Recyclerview;
    RelativeLayout back_Sign;
    ArrayList<FinanceNavigation> list;
    FinanceAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finance);
        back_Sign = findViewById(R.id.back_Sign);
        navigation_Recyclerview = (RecyclerView) findViewById(R.id.navigation_Recyclerview);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL);
        navigation_Recyclerview.setLayoutManager(staggeredGridLayoutManager);
        navigation_Recyclerview.setNestedScrollingEnabled(false);
        list = new ArrayList<FinanceNavigation>();
        adapter = new FinanceAdapter(FinanceActivity.this, list);
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
        FinanceNavigation houseFinance = new FinanceNavigation(R.drawable.house_finance_ic, "House Finance", "Maintenance Bill\n" +
                "Cable Bill\n" +
                "Rent Billi");
        FinanceNavigation banking = new FinanceNavigation(R.drawable.bank_ic, "Banking", "Transactions");
        FinanceNavigation shopping = new FinanceNavigation(R.drawable.shopping_ic, "Shopping", "");
        FinanceNavigation medical = new FinanceNavigation(R.drawable.medical_ic, "Medical", "");
        FinanceNavigation loans = new FinanceNavigation(R.drawable.loan_ic, "Loans", "");
        FinanceNavigation transport = new FinanceNavigation(R.drawable.transport_ic, "Transport", "Gas\n" +
                "Public Transport");
        FinanceNavigation savingPlan = new FinanceNavigation(R.drawable.saving_plan_ic, "Saving \n" +
                "Plan", "Weekly\n" +
                "Monthly");
        FinanceNavigation education = new FinanceNavigation(R.drawable.education_ic, "Education", "");
        FinanceNavigation insurance = new FinanceNavigation(R.drawable.insurance_ic, "Insurance", "");
        FinanceNavigation stockAndBond  = new FinanceNavigation(R.drawable.stock_and_bond_ic, "Stock And\n" +
                "Bond", "");
        FinanceNavigation income = new FinanceNavigation(R.drawable.salary_ic, "Income", "");
        list.add(houseFinance);
        list.add(banking);
        list.add(shopping);
        list.add(medical);
        list.add(loans);
        list.add(transport);
        list.add(savingPlan);
        list.add(education);
        list.add(insurance);
        list.add(stockAndBond);
        list.add(income);
        adapter.notifyDataSetChanged();
    }
}