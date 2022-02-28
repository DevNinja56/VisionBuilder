package com.my.visionbuilder.fragments.Trips;

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
import com.my.visionbuilder.activities.Trips.AddTripActivity;
import com.my.visionbuilder.adapters.TripAdapters.TripAdapter;
import com.my.visionbuilder.models.Trip;

import java.util.ArrayList;

public class UpcomingTripsFragment extends Fragment {

    RecyclerView recyclerview;
    ArrayList<Trip> list;
    TripAdapter adapter;
    RelativeLayout btn_Add;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_upcoming_trips, container, false);
        btn_Add = view.findViewById(R.id.btn_Add);
        recyclerview = (RecyclerView) view.findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerview.setNestedScrollingEnabled(false);
        list = new ArrayList<Trip>();
        adapter = new TripAdapter(getActivity(), list);
        recyclerview.setAdapter(adapter);
        loadData();
        btn_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AddTripActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }
    public void loadData() {
        Trip trip = new Trip(1,    "", "", "", "", "", "");
        list.add(trip);
        adapter.notifyDataSetChanged();
    }
}