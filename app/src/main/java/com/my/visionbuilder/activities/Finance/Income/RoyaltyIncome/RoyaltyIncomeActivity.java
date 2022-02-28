package com.my.visionbuilder.activities.Finance.Income.RoyaltyIncome;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.my.visionbuilder.R;
import com.my.visionbuilder.activities.Finance.Income.AddSourceActivity;
import com.my.visionbuilder.adapters.FinanceAdapters.IncomeAdapters.SourceNameAdapter;
import com.my.visionbuilder.models.Source;

import java.util.ArrayList;

public class RoyaltyIncomeActivity extends AppCompatActivity {

    RecyclerView recyclerview;
    ArrayList<Source> list;
    SourceNameAdapter adapter;
    RelativeLayout btn_Add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_royalty_income);
        btn_Add = findViewById(R.id.btn_Add);
        recyclerview = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(RoyaltyIncomeActivity.this));
        recyclerview.setNestedScrollingEnabled(false);
        list = new ArrayList<Source>();
        adapter = new SourceNameAdapter(RoyaltyIncomeActivity.this, list, "ROYALTY INCOME");
        recyclerview.setAdapter(adapter);
        loadSources();
        btn_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RoyaltyIncomeActivity.this, AddSourceActivity.class);
                intent.putExtra("ADD_SOURCE_FOR", "ROYALTY INCOME");
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