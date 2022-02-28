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
import com.my.visionbuilder.activities.AddMaintainanceActivity;
import com.my.visionbuilder.activities.Finance.HouseFinance.AddCableBillActivity;
import com.my.visionbuilder.adapters.FinanceAdapter.MaintenanceAdapter;
import com.my.visionbuilder.adapters.FinanceAdapter.MaintenanceAdapter;
import com.my.visionbuilder.models.Maintenance;
import com.my.visionbuilder.models.Maintenance;

import java.util.ArrayList;

import kotlin.Triple;

public class MaintenanceFragment extends Fragment {

    RecyclerView recyclerview;
    ArrayList<Maintenance> list;
    MaintenanceAdapter adapter;
    RelativeLayout btn_Add;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_maintenance, container, false);
        btn_Add = view.findViewById(R.id.btn_Add);
        recyclerview = (RecyclerView) view.findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerview.setNestedScrollingEnabled(false);
        list = new ArrayList<Maintenance>();
        adapter = new MaintenanceAdapter(getActivity(), list);
        recyclerview.setAdapter(adapter);
        loadMaintenanceBills();
        btn_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AddMaintainanceActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }
    public void loadMaintenanceBills() {
        Maintenance maintenance = new Maintenance(1, "", "GOAL FOR", "Lorem ipsum", "");
        Maintenance maintenance1 = new Maintenance(1, "", "GOAL FOR", "Lorem ipsum", "");
        Maintenance maintenance2 = new Maintenance(1, "", "GOAL FOR", "Lorem ipsum", "");
        Maintenance maintenance3 = new Maintenance(1, "", "GOAL FOR", "Lorem ipsum", "");
        Maintenance maintenance4 = new Maintenance(1, "", "GOAL FOR", "Lorem ipsum", "");
        list.add(maintenance);
        list.add(maintenance1);
        list.add(maintenance2);
        list.add(maintenance3);
        list.add(maintenance4);
        adapter.notifyDataSetChanged();
    }
}