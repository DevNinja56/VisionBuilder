package com.my.visionbuilder.activities.SavingPlan.Work;

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
import com.my.visionbuilder.adapters.SavingPlanAdapters.Work.WorkAdapter;
import com.my.visionbuilder.models.Vacation;
import com.my.visionbuilder.models.Work;

import java.util.ArrayList;

public class WorkActivity extends AppCompatActivity {

    RecyclerView recyclerview;
    ArrayList<Work> list;
    WorkAdapter adapter;
    RelativeLayout btn_Add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work);

        btn_Add = findViewById(R.id.btn_Add);
        recyclerview = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(WorkActivity.this));
        recyclerview.setNestedScrollingEnabled(false);
        list = new ArrayList<Work>();
        adapter = new WorkAdapter(WorkActivity.this, list);
        recyclerview.setAdapter(adapter);
        loadSources();
        btn_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WorkActivity.this, AddWorkActivity.class);
                intent.putExtra("ADD_SAVING_FOR", "WORK");
                startActivity(intent);
            }
        });
    }

    public void loadSources() {
        Work s1 = new Work(1, "SOURCE NAME",  "");
        Work s2 = new Work(1, "SOURCE NAME",  "");
        Work s3 = new Work(1, "SOURCE NAME",  "");
        list.add(s1);
        list.add(s2);
        list.add(s3);
        adapter.notifyDataSetChanged();
    }
}