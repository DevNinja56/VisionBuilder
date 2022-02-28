package com.my.visionbuilder.activities.SavingPlan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import com.my.visionbuilder.R;
import com.my.visionbuilder.adapters.SavingPlanAdapters.SavingPlanTransactionAdapter;
import com.my.visionbuilder.models.SavingPlanTransaction;
import java.util.ArrayList;

public class SavingPlanListActivity extends AppCompatActivity {

    RecyclerView recyclerview;
    ArrayList<SavingPlanTransaction> list;
    SavingPlanTransactionAdapter adapter;
    RelativeLayout btn_Add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saving_plan_list);
        btn_Add = findViewById(R.id.btn_Add);
        recyclerview = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(SavingPlanListActivity.this));
        recyclerview.setNestedScrollingEnabled(false);
        list = new ArrayList<SavingPlanTransaction>();
        adapter = new SavingPlanTransactionAdapter(SavingPlanListActivity.this, list, "AUTO");
        recyclerview.setAdapter(adapter);
        loadSources();
        btn_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SavingPlanListActivity.this, AddSavingTransactionActivity.class);
                intent.putExtra("ADD_SAVING_FOR", "AUTO");
                startActivity(intent);
            }
        });
    }
    public void loadSources() {
        SavingPlanTransaction s1 = new SavingPlanTransaction(1,  "SOURCE NAME", "", "", "");
        SavingPlanTransaction s2 = new SavingPlanTransaction(1,  "SOURCE NAME", "", "", "");
        SavingPlanTransaction s3 = new SavingPlanTransaction(1,  "SOURCE NAME", "", "", "");
        SavingPlanTransaction s4 = new SavingPlanTransaction(1,  "SOURCE NAME", "", "", "");
        SavingPlanTransaction s5 = new SavingPlanTransaction(1,  "SOURCE NAME", "", "", "");
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        adapter.notifyDataSetChanged();
    }
}