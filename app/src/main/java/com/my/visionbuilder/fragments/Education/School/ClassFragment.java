package com.my.visionbuilder.fragments.Education.School;

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
import com.my.visionbuilder.activities.Finance.Education.School.AddClassActivity;
import com.my.visionbuilder.activities.Finance.HouseFinance.AddCableBillActivity;
import com.my.visionbuilder.adapters.Education.School.ClassAdapter;
import com.my.visionbuilder.adapters.FinanceAdapter.CableBillsAdapter;
import com.my.visionbuilder.models.CableBills;
import com.my.visionbuilder.models.SchoolClass;

import java.util.ArrayList;

public class ClassFragment extends Fragment {

    RecyclerView recyclerview;
    ArrayList<SchoolClass> list;
    ClassAdapter adapter;
    RelativeLayout btn_Add;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_class, container, false);
        btn_Add = view.findViewById(R.id.btn_Add);
        recyclerview = (RecyclerView) view.findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerview.setNestedScrollingEnabled(false);
        list = new ArrayList<SchoolClass>();
        adapter = new ClassAdapter(getActivity(), list);
        recyclerview.setAdapter(adapter);
        loadData();
        btn_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AddClassActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }
    public void loadData() {
        SchoolClass c1 = new SchoolClass(1, "", "", "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed");
        list.add(c1);
        adapter.notifyDataSetChanged();
    }
}