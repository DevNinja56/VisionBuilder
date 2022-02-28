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
import com.my.visionbuilder.activities.AddEditRentActivity;
import com.my.visionbuilder.activities.AddMaintainanceActivity;
import com.my.visionbuilder.adapters.FinanceAdapter.RentBillAdapter;
import com.my.visionbuilder.models.RentBills;
import com.my.visionbuilder.models.RentBills;

import java.util.ArrayList;

public class RentBillsFragment extends Fragment {

    RecyclerView recyclerview;
    ArrayList<RentBills> list;
    RentBillAdapter adapter;
    RelativeLayout btn_Add;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_rent_bills, container, false);
        btn_Add = view.findViewById(R.id.btn_Add);
        recyclerview = (RecyclerView) view.findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerview.setNestedScrollingEnabled(false);
        list = new ArrayList<RentBills>();
        adapter = new RentBillAdapter(getActivity(), list);
        recyclerview.setAdapter(adapter);
        loadRentBills();
        btn_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AddEditRentActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }
    public void loadRentBills() {
        RentBills rentBills = new RentBills(1, "", "GOAL FOR", "Lorem ipsum");
        RentBills rentBills1 = new RentBills(1, "", "GOAL FOR", "Lorem ipsum");
        RentBills rentBills2 = new RentBills(1, "", "GOAL FOR", "Lorem ipsum");
        RentBills rentBills3 = new RentBills(1, "", "GOAL FOR", "Lorem ipsum");
        RentBills rentBills4 = new RentBills(1, "", "GOAL FOR", "Lorem ipsum");
        list.add(rentBills);
        list.add(rentBills1);
        list.add(rentBills2);
        list.add(rentBills3);
        list.add(rentBills4);
        adapter.notifyDataSetChanged();
    }
}