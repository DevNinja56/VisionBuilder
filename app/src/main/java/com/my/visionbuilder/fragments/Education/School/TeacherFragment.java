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
import com.my.visionbuilder.activities.Finance.Education.School.AddTeacherActivity;
import com.my.visionbuilder.activities.Finance.HouseFinance.AddCableBillActivity;
import com.my.visionbuilder.adapters.Education.School.ClassAdapter;
import com.my.visionbuilder.adapters.Education.School.TeacherAdapter;
import com.my.visionbuilder.models.SchoolClass;
import com.my.visionbuilder.models.Teacher;

import java.util.ArrayList;

public class TeacherFragment extends Fragment {

    RecyclerView recyclerview;
    ArrayList<Teacher> list;
    TeacherAdapter adapter;
    RelativeLayout btn_Add;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_teacher, container, false);
        btn_Add = view.findViewById(R.id.btn_Add);
        recyclerview = (RecyclerView) view.findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerview.setNestedScrollingEnabled(false);
        list = new ArrayList<Teacher>();
        adapter = new TeacherAdapter(getActivity(), list);
        recyclerview.setAdapter(adapter);
        loadData();
        btn_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AddTeacherActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }
    public void loadData() {
        Teacher c1 = new Teacher(1, "", "", "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed");
        list.add(c1);
        adapter.notifyDataSetChanged();
    }
}