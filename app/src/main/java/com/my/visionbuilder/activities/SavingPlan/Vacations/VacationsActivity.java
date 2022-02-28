package com.my.visionbuilder.activities.SavingPlan.Vacations;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.my.visionbuilder.R;
import com.my.visionbuilder.activities.SavingPlan.AddSavingTransactionActivity;
import com.my.visionbuilder.adapters.SavingPlanAdapters.Vacations.VacationAdapter;
import com.my.visionbuilder.models.SavingPlanTransaction;
import com.my.visionbuilder.models.Vacation;

import java.util.ArrayList;

public class VacationsActivity extends AppCompatActivity {

    RecyclerView recyclerview;
    ArrayList<Vacation> list;
    VacationAdapter adapter;
    RelativeLayout btn_Add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vacations);
        btn_Add = findViewById(R.id.btn_Add);
        recyclerview = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(VacationsActivity.this));
        recyclerview.setNestedScrollingEnabled(false);
        list = new ArrayList<Vacation>();
        adapter = new VacationAdapter(VacationsActivity.this, list);
        recyclerview.setAdapter(adapter);
        loadSources();
        btn_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VacationsActivity.this, AddSavingTransactionActivity.class);
                intent.putExtra("ADD_SAVING_FOR", "EMERGENCY_FUND");
                startActivity(intent);
            }
        });
    }

    public void loadSources() {
        Vacation s1 = new Vacation(1, "SOURCE NAME",  "");
        Vacation s2 = new Vacation(1, "SOURCE NAME",  "");
        Vacation s3 = new Vacation(1, "SOURCE NAME",  "");
        list.add(s1);
        list.add(s2);
        list.add(s3);
        adapter.notifyDataSetChanged();
    }
}