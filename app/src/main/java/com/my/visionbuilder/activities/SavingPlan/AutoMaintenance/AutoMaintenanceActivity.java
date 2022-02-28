package com.my.visionbuilder.activities.SavingPlan.AutoMaintenance;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import com.my.visionbuilder.R;
import com.my.visionbuilder.adapters.SavingPlanAdapters.Auto.AutoListAdapter;
import com.my.visionbuilder.models.Auto;
import java.util.ArrayList;

public class AutoMaintenanceActivity extends AppCompatActivity {

    RecyclerView recyclerview;
    ArrayList<Auto> list;
    AutoListAdapter adapter;
    RelativeLayout btn_Add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_maintenance);
        btn_Add = findViewById(R.id.btn_Add);
        recyclerview = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(AutoMaintenanceActivity.this));
        recyclerview.setNestedScrollingEnabled(false);
        list = new ArrayList<Auto>();
        adapter = new AutoListAdapter(AutoMaintenanceActivity.this, list);
        recyclerview.setAdapter(adapter);
        loadSources();
        btn_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AutoMaintenanceActivity.this, AddAutoActivity.class);
                startActivity(intent);
            }
        });
    }
    public void loadSources() {
        Auto s1 = new Auto( 1, "SOURCE NAME");
        Auto s2 = new Auto(1, "SOURCE NAME");
        Auto s3 = new Auto(1, "SOURCE NAME");
        Auto s4 = new Auto(1, "SOURCE NAME");
        Auto s5 = new Auto(1, "SOURCE NAME");
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        adapter.notifyDataSetChanged();
    }
}