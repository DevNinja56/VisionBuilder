package com.my.visionbuilder.activities.Finance.Income.EarnedIncome;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.my.visionbuilder.R;
import com.my.visionbuilder.activities.Finance.Income.AddSourceActivity;
import com.my.visionbuilder.activities.Goals.AddGoalActivity;
import com.my.visionbuilder.adapters.FinanceAdapters.IncomeAdapters.SourceNameAdapter;
import com.my.visionbuilder.adapters.StockAndBondAdapters.StockAndBondAdapter;
import com.my.visionbuilder.models.Source;
import com.my.visionbuilder.models.StockAndBond;

import java.util.ArrayList;

public class EarnedIncomeActivity extends AppCompatActivity {

    RecyclerView recyclerview;
    ArrayList<Source> list;
    SourceNameAdapter adapter;
    RelativeLayout btn_Add;
    String income_Type;
    TextView income_TypeTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earned_income);
        income_Type = getIntent().getStringExtra("INCOME_TYPE");
        btn_Add = findViewById(R.id.btn_Add);
        income_TypeTitle = findViewById(R.id.income_TypeTitle);
        recyclerview = (RecyclerView) findViewById(R.id.recyclerview);
        income_TypeTitle.setText(income_Type);
        recyclerview.setLayoutManager(new LinearLayoutManager(EarnedIncomeActivity.this));
        recyclerview.setNestedScrollingEnabled(false);
        list = new ArrayList<Source>();
        adapter = new SourceNameAdapter(EarnedIncomeActivity.this, list, "EARNED INCOME");
        recyclerview.setAdapter(adapter);
        loadSources();
        btn_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EarnedIncomeActivity.this, AddSourceActivity.class);
                intent.putExtra("ADD_SOURCE_FOR", "EARNED INCOME");
                startActivity(intent);
            }
        });
    }
    public void loadSources() {
        Source s1 = new Source( "SOURCE NAME", "");
        Source s2 = new Source( "SOURCE NAME", "");
        Source s3 = new Source( "SOURCE NAME", "");
        Source s4 = new Source( "SOURCE NAME", "");
        Source s5 = new Source( "SOURCE NAME", "");
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        adapter.notifyDataSetChanged();
    }
}