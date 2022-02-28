package com.my.visionbuilder.activities.SavingPlan.Holiday;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import com.my.visionbuilder.R;
import com.my.visionbuilder.activities.SavingPlan.AddSavingTransactionActivity;
import com.my.visionbuilder.adapters.SavingPlanAdapters.Holiday.SavingPlanHolidayAdapter;
import com.my.visionbuilder.models.Holiday;

import java.util.ArrayList;

public class HolidayActivity extends AppCompatActivity {

    RecyclerView recyclerview;
    ArrayList<Holiday> list;
    SavingPlanHolidayAdapter adapter;
    RelativeLayout btn_Add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_holiday);
        btn_Add = findViewById(R.id.btn_Add);
        recyclerview = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(HolidayActivity.this));
        recyclerview.setNestedScrollingEnabled(false);
        list = new ArrayList<Holiday>();
        adapter = new SavingPlanHolidayAdapter(HolidayActivity.this, list);
        recyclerview.setAdapter(adapter);
        loadSources();
        btn_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HolidayActivity.this, AddHolidayActivity.class);
                intent.putExtra("ADD_SAVING_FOR", "AUTO");
                startActivity(intent);
            }
        });
    }
    public void loadSources() {
        Holiday s1 = new Holiday(1,   "");
        list.add(s1);
        adapter.notifyDataSetChanged();
    }
}