package com.my.visionbuilder.fragments.Goals;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.my.visionbuilder.R;
import com.my.visionbuilder.adapters.GoalsAdapters.GoalsAdapter;
import com.my.visionbuilder.models.Goal;

import java.util.ArrayList;

public class WeeklyGoalsFragment extends Fragment {

    RecyclerView ten_YearsGoalsRecyclerview;
    ArrayList<Goal> list;
    GoalsAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_weekly_goals, container, false);
        ten_YearsGoalsRecyclerview = view.findViewById(R.id.weekly_GoalsRecyclerview);
        ten_YearsGoalsRecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        ten_YearsGoalsRecyclerview.setNestedScrollingEnabled(false);
        list = new ArrayList<Goal>();
        adapter = new GoalsAdapter(getActivity(), list);
        ten_YearsGoalsRecyclerview.setAdapter(adapter);
        loadGoals();
        return view;
    }
    public void loadGoals() {
        Goal goal = new Goal(1, "", "GOAL FOR", "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed");
        Goal goal1 = new Goal(2, "", "GOAL FOR", "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed");
        Goal goal2 = new Goal(3, "", "GOAL FOR", "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed");
        Goal goal3 = new Goal(4, "", "GOAL FOR", "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed");
        Goal goal4 = new Goal(5, "", "GOAL FOR", "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed");
        Goal goal5 = new Goal(6, "", "GOAL FOR", "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed");
        list.add(goal);
        list.add(goal1);
        list.add(goal2);
        list.add(goal3);
        list.add(goal4);
        list.add(goal5);
        adapter.notifyDataSetChanged();
    }
}