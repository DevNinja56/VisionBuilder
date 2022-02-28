package com.my.visionbuilder.fragments.Transportation;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.my.visionbuilder.R;
import com.my.visionbuilder.adapters.TodoListAdapters.TodoListAdapter;
import com.my.visionbuilder.adapters.Transportation.TransportationAdapter;
import com.my.visionbuilder.models.TodoList;
import com.my.visionbuilder.models.Transportation;

import java.util.ArrayList;

public class GasFragment extends Fragment {

    RecyclerView recyclerview;
    ArrayList<Transportation> list;
    TransportationAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_gas, container, false);
        recyclerview = (RecyclerView) view.findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerview.setNestedScrollingEnabled(false);
        list = new ArrayList<Transportation>();
        adapter = new TransportationAdapter(getActivity(), list, "GAS");
        recyclerview.setAdapter(adapter);
        loadData();
        return view;
    }
    public void loadData() {
        Transportation transportation = new Transportation(1, "make breakfast", "24 Jan 2020",
                "03:49AM", "PENDING", "", "", "", "");
        list.add(transportation);
        adapter.notifyDataSetChanged();
    }
}