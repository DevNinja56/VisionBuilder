package com.my.visionbuilder.fragments.Loans;

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
import com.my.visionbuilder.activities.Loans.AddLoanActivity;
import com.my.visionbuilder.adapters.LoansAdapters.LoansAdapter;
import com.my.visionbuilder.models.Loan;

import java.util.ArrayList;

public class StudiesFragment extends Fragment {

    RecyclerView recyclerview;
    ArrayList<Loan> list;
    LoansAdapter adapter;
    RelativeLayout btn_Add;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_studies, container, false);
        btn_Add = view.findViewById(R.id.btn_Add);
        recyclerview = (RecyclerView) view.findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerview.setNestedScrollingEnabled(false);
        list = new ArrayList<Loan>();
        adapter = new LoansAdapter(getActivity(), list);
        recyclerview.setAdapter(adapter);
        loadData();
        btn_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AddLoanActivity.class);
                intent.putExtra("PURPOSE", "ADD_STUDIES");
                startActivity(intent);
            }
        });
        return view;
    }
    public void loadData() {
        Loan loan = new Loan(1,   "", "", "", "", "", "", "");
        list.add(loan);
        adapter.notifyDataSetChanged();
    }
}
