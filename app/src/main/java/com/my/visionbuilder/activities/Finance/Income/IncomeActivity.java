package com.my.visionbuilder.activities.Finance.Income;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.my.visionbuilder.R;
import com.my.visionbuilder.adapters.FinanceAdapters.IncomeAdapters.IncomeItemAdapter;
import com.my.visionbuilder.adapters.FinanceAdapters.IncomeAdapters.IncomeTypeAdapter;
import com.my.visionbuilder.adapters.FinanceAdapters.IncomeAdapters.SourceNameAdapter;
import com.my.visionbuilder.models.IncomeType;
import com.my.visionbuilder.models.Source;

import java.util.ArrayList;

public class IncomeActivity extends AppCompatActivity {

    RecyclerView recyclerview;
    ArrayList<IncomeType> list;
    IncomeTypeAdapter adapter;
    RelativeLayout btn_Add;
    String income_Type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_income);
        recyclerview = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(IncomeActivity.this));
        recyclerview.setNestedScrollingEnabled(false);
        list = new ArrayList<IncomeType>();
        adapter = new IncomeTypeAdapter(IncomeActivity.this, list);
        recyclerview.setAdapter(adapter);
        loadIncomeTypes();
    }
    public void loadIncomeTypes() {
        IncomeType i1 = new IncomeType( 1, "Earned Income");
        IncomeType i2 = new IncomeType( 2, "Profit Income");
        IncomeType i3 = new IncomeType( 3, "Interests Income");
        IncomeType i4 = new IncomeType( 4, "Dividend Income");
        IncomeType i5 = new IncomeType( 5, "Rental Income");
        IncomeType i6 = new IncomeType( 6, "Capital Gains Income");
        IncomeType i7 = new IncomeType( 7, "Royalty Income");
        list.add(i1);
        list.add(i2);
        list.add(i3);
        list.add(i4);
        list.add(i5);
        list.add(i6);
        list.add(i7);
        adapter.notifyDataSetChanged();
    }
}