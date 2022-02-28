package com.my.visionbuilder.fragments.Shopping;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.my.visionbuilder.R;
import com.my.visionbuilder.adapters.ShoppingAdapters.ShoppingAdapter;
import com.my.visionbuilder.models.Shopping;

import java.util.ArrayList;

public class DinningOutFragment extends Fragment {

    RecyclerView recyclerview;
    ArrayList<Shopping> list;
    ShoppingAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dinning_out, container, false);
        recyclerview = (RecyclerView) view.findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerview.setNestedScrollingEnabled(false);
        list = new ArrayList<Shopping>();
        adapter = new ShoppingAdapter(getActivity(), list);
        recyclerview.setAdapter(adapter);
        loadShopping();
        return view;
    }
    public void loadShopping() {
        Shopping shop = new Shopping(1, "", "GOAL FOR", "", "", "", "", "", "");
        Shopping shop1 = new Shopping(1, "", "GOAL FOR", "", "", "", "", "", "");
        Shopping shop2 = new Shopping(1, "", "GOAL FOR", "", "", "", "", "", "");
        Shopping shop3 = new Shopping(1, "", "GOAL FOR", "", "", "", "", "", "");
        Shopping shop4 = new Shopping(1, "", "GOAL FOR", "", "", "", "", "", "");
        Shopping shop5 = new Shopping(1, "", "GOAL FOR", "", "", "", "", "", "");
        list.add(shop);
        list.add(shop1);
        list.add(shop2);
        list.add(shop3);
        list.add(shop4);
        list.add(shop5);
        adapter.notifyDataSetChanged();
    }
}