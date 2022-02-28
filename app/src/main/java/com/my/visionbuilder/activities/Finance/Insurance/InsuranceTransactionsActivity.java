package com.my.visionbuilder.activities.Finance.Insurance;

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
import com.my.visionbuilder.activities.Finance.StockAndBond.StockAndBondActivity;
import com.my.visionbuilder.adapters.FinanceAdapters.IncomeAdapters.SourceNameAdapter;
import com.my.visionbuilder.adapters.InsuranceAdapters.InsuranceTransactionsAdapter;
import com.my.visionbuilder.models.InsuranceTransaction;
import com.my.visionbuilder.models.Source;

import java.util.ArrayList;

public class InsuranceTransactionsActivity extends AppCompatActivity {

    RecyclerView recyclerview;
    ArrayList<InsuranceTransaction> list;
    InsuranceTransactionsAdapter adapter;
    RelativeLayout btn_Add;
    String insurance_Type;
    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insurance_transactions);
        insurance_Type = getIntent().getStringExtra("INSURANCE_TYPE");
        title = findViewById(R.id.title);
        btn_Add = findViewById(R.id.btn_Add);
        recyclerview = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(InsuranceTransactionsActivity.this));
        recyclerview.setNestedScrollingEnabled(false);
        list = new ArrayList<InsuranceTransaction>();
        adapter = new InsuranceTransactionsAdapter(InsuranceTransactionsActivity.this, list);
        recyclerview.setAdapter(adapter);
        loadSources();
        setTitle();
        btn_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(insurance_Type.equals("LIFE_INSURANCE")) {
                    Intent intent = new Intent(InsuranceTransactionsActivity.this, AddLifeInsuranceActivity.class);
                    startActivity(intent);
                } else if(insurance_Type.equals("HOUSE_INSURANCE")) {
                    Intent intent = new Intent(InsuranceTransactionsActivity.this, AddHomeInsuranceActivity.class);
                    startActivity(intent);
                } else if(insurance_Type.equals("CAR_INSURANCE")) {
                    Intent intent = new Intent(InsuranceTransactionsActivity.this, AddCarInsuranceActivity.class);
                    startActivity(intent);
                } else if(insurance_Type.equals("OTHER_INSURANCE")) {
                    Intent intent = new Intent(InsuranceTransactionsActivity.this, AddOtherInsuranceActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
    public void loadSources() {
        InsuranceTransaction s1 = new InsuranceTransaction( 1, "LIFE", "", "");
        InsuranceTransaction s2 = new InsuranceTransaction( 1, "LIFE", "", "");
        InsuranceTransaction s3 = new InsuranceTransaction( 1, "LIFE", "", "");
        InsuranceTransaction s4 = new InsuranceTransaction( 1, "LIFE", "", "");
        InsuranceTransaction s5 = new InsuranceTransaction( 1, "LIFE", "", "");
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        adapter.notifyDataSetChanged();
    }
    public void setTitle() {
        if(insurance_Type.equals("LIFE_INSURANCE")) {
            title.setText("Life Insurance Transactions - Company");
        } else if(insurance_Type.equals("HOUSE_INSURANCE")) {
            title.setText("House Insurance Transactions - Company");
        } else if(insurance_Type.equals("CAR_INSURANCE")) {
            title.setText("Car Insurance Transactions - Company");
        } else if(insurance_Type.equals("OTHER_INSURANCE")) {
            title.setText("Other Insurance Transactions - Company");
        }
    }
}