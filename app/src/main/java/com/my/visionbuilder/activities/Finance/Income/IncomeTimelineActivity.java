package com.my.visionbuilder.activities.Finance.Income;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.my.visionbuilder.R;
import com.my.visionbuilder.activities.Goals.AddGoalActivity;
import com.my.visionbuilder.adapters.FinanceAdapters.IncomeAdapters.IncomeItemAdapter;
import com.my.visionbuilder.adapters.StockAndBondAdapters.StockAndBondAdapter;
import com.my.visionbuilder.models.Income;
import com.my.visionbuilder.models.StockAndBond;

import java.util.ArrayList;

public class IncomeTimelineActivity extends AppCompatActivity {

    RecyclerView recyclerview;
    ArrayList<Income> list;
    IncomeItemAdapter adapter;
    RelativeLayout btn_Add;
    String income_Type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_income_timeline);

        income_Type = getIntent().getStringExtra("INCOME_TYPE");
        btn_Add = findViewById(R.id.btn_Add);
        recyclerview = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(IncomeTimelineActivity.this));
        recyclerview.setNestedScrollingEnabled(false);
        list = new ArrayList<Income>();
        adapter = new IncomeItemAdapter(IncomeTimelineActivity.this, list, income_Type);
        recyclerview.setAdapter(adapter);
        loadIncome();
        btn_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IncomeTimelineActivity.this, AddIncomeActivity.class);
                intent.putExtra("INCOME_TYPE", income_Type);
                intent.putExtra("SOURCE_NAME", "Source Name");
                startActivity(intent);
            }
        });
    }
    public void loadIncome() {
        Income s1 = new Income(1, "SOURCE NAME", "24-1-2021", "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed", "1500", "1000", "500");
        Income s2 = new Income(1, "SOURCE NAME", "24-1-2021", "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed", "1500", "1000", "500");
        Income s3 = new Income(1, "SOURCE NAME", "24-1-2021", "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed", "1500", "1000", "500");
        list.add(s1);
        list.add(s2);
        list.add(s3);
        adapter.notifyDataSetChanged();
    }
}