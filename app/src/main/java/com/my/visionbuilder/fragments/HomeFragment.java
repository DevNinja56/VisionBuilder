package com.my.visionbuilder.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.my.visionbuilder.R;
import com.my.visionbuilder.adapters.Home.HomeAdapter;
import com.my.visionbuilder.models.NavigationHome;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    RecyclerView navigation_Recyclerview;
    ArrayList<NavigationHome> list;
    HomeAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        navigation_Recyclerview = (RecyclerView) view.findViewById(R.id.navigation_Recyclerview);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL);
        navigation_Recyclerview.setLayoutManager(staggeredGridLayoutManager);
        navigation_Recyclerview.setNestedScrollingEnabled(false);
        list = new ArrayList<NavigationHome>();
        adapter = new HomeAdapter(getActivity(), list);
        navigation_Recyclerview.setAdapter(adapter);
        loadNavigationViews();
        return view;
    }

    public void loadNavigationViews() {
        NavigationHome meetings = new NavigationHome(R.drawable.meeting_ic, "Meetings", "2");
        NavigationHome todoList = new NavigationHome(R.drawable.to_do_list_ic, "Todo List", "2");
        NavigationHome finance = new NavigationHome(R.drawable.finance_ic, "Finance", "");
        NavigationHome goals = new NavigationHome(R.drawable.goal_ic, "Goals", "");
        NavigationHome business = new NavigationHome(R.drawable.business_ic, "Business", "2");
        NavigationHome trips = new NavigationHome(R.drawable.trips_ic, "Trips", "5");
        NavigationHome contacts = new NavigationHome(R.drawable.contacts_ic, "Contacts", "2");
        NavigationHome vision_Platform = new NavigationHome(R.drawable.vision_platform_ic, "Vision Platform", "");
        list.add(meetings);
        list.add(todoList);
        list.add(finance);
        list.add(goals);
        list.add(business);
        list.add(trips);
        list.add(contacts);
        list.add(vision_Platform);
        adapter.notifyDataSetChanged();
    }
}