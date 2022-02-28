package com.my.visionbuilder.fragments.SavingPlan.Grocery;

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
import com.my.visionbuilder.activities.SavingPlan.AddSavingTransactionActivity;
import com.my.visionbuilder.adapters.SavingPlanAdapters.SavingPlanTransactionAdapter;
import com.my.visionbuilder.models.SavingPlanTransaction;

import java.util.ArrayList;

public class WeeklyFragment extends Fragment {

    RecyclerView recyclerview;
    ArrayList<SavingPlanTransaction> list;
    SavingPlanTransactionAdapter adapter;
    RelativeLayout btn_Add;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_weekly2, container, false);
        btn_Add = view.findViewById(R.id.btn_Add);
        recyclerview = (RecyclerView) view.findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerview.setNestedScrollingEnabled(false);
        list = new ArrayList<SavingPlanTransaction>();
        adapter = new SavingPlanTransactionAdapter(getActivity(), list, "GAS");
        recyclerview.setAdapter(adapter);
        loadData();
        btn_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AddSavingTransactionActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }

    public void loadData() {
        SavingPlanTransaction s1 = new SavingPlanTransaction(1, "", "", "", "");
        SavingPlanTransaction s2 = new SavingPlanTransaction(1, "", "", "", "");
        list.add(s1);
        list.add(s2);
        adapter.notifyDataSetChanged();
    }
}