package com.my.visionbuilder.fragments.Meetings;

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
import com.my.visionbuilder.activities.Meetings.AddMeetingActivity;
import com.my.visionbuilder.activities.Shopping.AddEditBillActivity;
import com.my.visionbuilder.activities.TodoList.AddTaskActivity;
import com.my.visionbuilder.adapters.Meetings.MeetingsAdapter;
import com.my.visionbuilder.models.Meeting;

import java.util.ArrayList;

public class TodayFragment extends Fragment {

    RecyclerView recyclerview;
    ArrayList<Meeting> list;
    MeetingsAdapter adapter;
    RelativeLayout btn_Add;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_today, container, false);
        btn_Add = view.findViewById(R.id.btn_Add);
        recyclerview = (RecyclerView) view.findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerview.setNestedScrollingEnabled(false);
        list = new ArrayList<Meeting>();
        adapter = new MeetingsAdapter(getActivity(), list);
        recyclerview.setAdapter(adapter);
        loadData();
        btn_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AddTaskActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }

    public void loadData() {
        Meeting meeting = new Meeting(1, "", "", "", "", "", "", "", "");
        list.add(meeting);
        adapter.notifyDataSetChanged();
    }
}