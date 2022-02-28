package com.my.visionbuilder.activities.Calender;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.my.visionbuilder.R;
import com.my.visionbuilder.adapters.Home.HomeAdapter;
import com.my.visionbuilder.models.NavigationHome;

import java.util.ArrayList;

public class CalendarActivity extends AppCompatActivity {

    RecyclerView navigation_Recyclerview;
    RelativeLayout back_Sign;
    ArrayList<NavigationHome> list;
    HomeAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        back_Sign = findViewById(R.id.back_Sign);
        navigation_Recyclerview = findViewById(R.id.navigation_Recyclerview);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL);
        navigation_Recyclerview.setLayoutManager(staggeredGridLayoutManager);
        navigation_Recyclerview.setNestedScrollingEnabled(false);
        list = new ArrayList<NavigationHome>();
        adapter = new HomeAdapter(CalendarActivity.this, list);
        navigation_Recyclerview.setAdapter(adapter);
        loadNavigationViews();
        back_Sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    public void loadNavigationViews() {
        NavigationHome meetings = new NavigationHome(R.drawable.meeting_ic, "Meetings", "2");
        NavigationHome todoList = new NavigationHome(R.drawable.to_do_list_ic, "Todo List", "2");
        NavigationHome goals = new NavigationHome(R.drawable.goal_ic, "Goals", "");
        list.add(meetings);
        list.add(todoList);
        list.add(goals);
        adapter.notifyDataSetChanged();
    }
}