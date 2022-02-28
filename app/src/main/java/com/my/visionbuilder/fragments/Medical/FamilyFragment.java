package com.my.visionbuilder.fragments.Medical;

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
import com.my.visionbuilder.activities.Shopping.AddEditBillActivity;
import com.my.visionbuilder.adapters.MedicalAdapters.MedicalAdapter;
import com.my.visionbuilder.models.Medical;

import java.util.ArrayList;

public class FamilyFragment extends Fragment {

    RecyclerView recyclerview;
    ArrayList<Medical> list;
    MedicalAdapter adapter;
    RelativeLayout btn_Add;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_family, container, false);
        btn_Add = view.findViewById(R.id.btn_Add);
        recyclerview = (RecyclerView) view.findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerview.setNestedScrollingEnabled(false);
        list = new ArrayList<Medical>();
        adapter = new MedicalAdapter(getActivity(), list);
        recyclerview.setAdapter(adapter);
        loadMedical();
        btn_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AddEditBillActivity.class);
                intent.putExtra("PURPOSE", "ADD_PERSONAL");
                startActivity(intent);
            }
        });
        return view;
    }
    public void loadMedical() {
        Medical medical = new Medical(1,   "", "", "", "", "", "");
        list.add(medical);
        adapter.notifyDataSetChanged();
    }
}