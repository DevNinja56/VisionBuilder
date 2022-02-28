package com.my.visionbuilder.fragments.Finance.HouseFinance;

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
import com.my.visionbuilder.activities.Finance.HouseFinance.AddCableBillActivity;
import com.my.visionbuilder.adapters.FinanceAdapter.CableBillsAdapter;
import com.my.visionbuilder.adapters.GoalsAdapters.GoalsAdapter;
import com.my.visionbuilder.models.CableBills;
import com.my.visionbuilder.models.Goal;

import java.util.ArrayList;

public class CableBillsFragment extends Fragment {

    RecyclerView recyclerview;
    ArrayList<CableBills> list;
    CableBillsAdapter adapter;
    RelativeLayout btn_Add;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cable_bills, container, false);
        btn_Add = view.findViewById(R.id.btn_Add);
        recyclerview = (RecyclerView) view.findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerview.setNestedScrollingEnabled(false);
        list = new ArrayList<CableBills>();
        adapter = new CableBillsAdapter(getActivity(), list);
        recyclerview.setAdapter(adapter);
        loadCableBills();
        btn_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AddCableBillActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }
    public void loadCableBills() {
        CableBills bills = new CableBills(1, "", "GOAL FOR", "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed");
        CableBills bills1 = new CableBills(1, "", "GOAL FOR", "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed");
        CableBills bills2 = new CableBills(1, "", "GOAL FOR", "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed");
        CableBills bills3 = new CableBills(1, "", "GOAL FOR", "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed");
        CableBills bills4 = new CableBills(1, "", "GOAL FOR", "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed");
        list.add(bills);
        list.add(bills1);
        list.add(bills2);
        list.add(bills3);
        list.add(bills4);
        adapter.notifyDataSetChanged();
    }
}