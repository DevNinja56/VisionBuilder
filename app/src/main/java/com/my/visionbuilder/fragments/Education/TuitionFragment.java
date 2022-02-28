package com.my.visionbuilder.fragments.Education;

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
import com.my.visionbuilder.activities.Finance.Education.School.AddSchoolActivity;
import com.my.visionbuilder.activities.Finance.Education.Tuition.AddTuitionActivity;
import com.my.visionbuilder.adapters.Education.School.SchoolAdapter;
import com.my.visionbuilder.adapters.Education.TuitionAdapter;
import com.my.visionbuilder.models.School;
import com.my.visionbuilder.models.Tuition;

import java.util.ArrayList;

public class TuitionFragment extends Fragment {

    RecyclerView recyclerview;
    ArrayList<Tuition> list;
    TuitionAdapter adapter;
    RelativeLayout btn_Add;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tuition, container, false);
        btn_Add = view.findViewById(R.id.btn_Add);
        recyclerview = (RecyclerView) view.findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerview.setNestedScrollingEnabled(false);
        list = new ArrayList<Tuition>();
        adapter = new TuitionAdapter(getActivity(), list);
        recyclerview.setAdapter(adapter);
        loadCableBills();
        btn_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AddTuitionActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }
    public void loadCableBills() {
        Tuition s1 = new Tuition(1, "", "", "");
        list.add(s1);
        adapter.notifyDataSetChanged();
    }

}