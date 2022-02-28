package com.my.visionbuilder.activities.SavingPlan.HomeMaintenance;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.my.visionbuilder.R;
import com.my.visionbuilder.activities.SavingPlan.AddSavingTransactionActivity;
import com.my.visionbuilder.adapters.SavingPlanAdapters.SavingPlanTransactionAdapter;
import com.my.visionbuilder.models.SavingPlanTransaction;

import java.util.ArrayList;

public class HomeMaintenanceActivity extends AppCompatActivity {

    RecyclerView recyclerview;
    ArrayList<SavingPlanTransaction> list;
    SavingPlanTransactionAdapter adapter;
    RelativeLayout btn_Add;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_maintenance);
        btn_Add = findViewById(R.id.btn_Add);
        recyclerview = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(HomeMaintenanceActivity.this));
        recyclerview.setNestedScrollingEnabled(false);
        list = new ArrayList<SavingPlanTransaction>();
        adapter = new SavingPlanTransactionAdapter(HomeMaintenanceActivity.this, list, "EMERGENCY_FUND");
        recyclerview.setAdapter(adapter);
        loadSources();
        btn_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeMaintenanceActivity.this, AddSavingTransactionActivity.class);
                intent.putExtra("ADD_SAVING_FOR", "EMERGENCY_FUND");
                startActivity(intent);
            }
        });
    }
    public void loadSources() {
        SavingPlanTransaction s1 = new SavingPlanTransaction(1,  "SOURCE NAME", "", "", "");
        SavingPlanTransaction s2 = new SavingPlanTransaction(1,  "SOURCE NAME", "", "", "");
        SavingPlanTransaction s3 = new SavingPlanTransaction(1,  "SOURCE NAME", "", "", "");
        list.add(s1);
        list.add(s2);
        list.add(s3);
        adapter.notifyDataSetChanged();
    }
}