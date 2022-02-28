package com.my.visionbuilder.activities.Business;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.my.visionbuilder.R;
import com.my.visionbuilder.activities.Finance.Banking.AddEditBankingTransactionsActivity;
import com.my.visionbuilder.adapters.BankingAdapters.BankingTransactionAdapter;
import com.my.visionbuilder.adapters.Business.BusinessListAdapter;
import com.my.visionbuilder.models.BankingTransaction;
import com.my.visionbuilder.models.Business;

import java.util.ArrayList;

public class BusinessActivity extends AppCompatActivity {

    RecyclerView credit_Recyclerview;
    ArrayList<Business> list;
    BusinessListAdapter adapter;
    RelativeLayout btn_Add, back_Sign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business);

        back_Sign = findViewById(R.id.back_Sign);
        btn_Add = findViewById(R.id.btn_Add);
        credit_Recyclerview = (RecyclerView) findViewById(R.id.recyclerview);
        credit_Recyclerview.setLayoutManager(new LinearLayoutManager(BusinessActivity.this));
        credit_Recyclerview.setNestedScrollingEnabled(false);
        list = new ArrayList<Business>();
        adapter = new BusinessListAdapter(BusinessActivity.this, list);
        credit_Recyclerview.setAdapter(adapter);
        loadBusiness();
        btn_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BusinessActivity.this, AddBusinessActivity.class);
                startActivity(intent);
            }
        });
        back_Sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    public void loadBusiness() {
        Business b1 = new Business(1, "Business Name");
        list.add(b1);
        list.add(b1);
        list.add(b1);
        adapter.notifyDataSetChanged();
    }
}