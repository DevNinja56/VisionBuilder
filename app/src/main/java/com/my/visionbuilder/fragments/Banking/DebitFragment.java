package com.my.visionbuilder.fragments.Banking;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.my.visionbuilder.R;
import com.my.visionbuilder.activities.Finance.Banking.AddEditBankingTransactionsActivity;
import com.my.visionbuilder.adapters.BankingAdapters.BankingTransactionAdapter;
import com.my.visionbuilder.models.BankingTransaction;

import java.util.ArrayList;

public class DebitFragment extends Fragment {

    RecyclerView debit_Recyclerview;
    ArrayList<BankingTransaction> list;
    BankingTransactionAdapter adapter;
    RelativeLayout btn_Add;
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_debit, container, false);
        btn_Add = view.findViewById(R.id.btn_Add);
        debit_Recyclerview = (RecyclerView) view.findViewById(R.id.debit_Recyclerview);
        debit_Recyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        debit_Recyclerview.setNestedScrollingEnabled(false);
        list = new ArrayList<BankingTransaction>();
        adapter = new BankingTransactionAdapter(getActivity(), list);
        debit_Recyclerview.setAdapter(adapter);
        loadDebitTransactions();
        btn_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AddEditBankingTransactionsActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }
    public void loadDebitTransactions() {
        BankingTransaction b1 = new BankingTransaction(1, "Credit", "Title", "Name", "Name", "$4500", "24 Jan 2020", "10");
        list.add(b1);
        list.add(b1);
        list.add(b1);
        adapter.notifyDataSetChanged();
    }
}