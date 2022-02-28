package com.my.visionbuilder.activities.SavingPlan.Gifts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.my.visionbuilder.R;
import com.my.visionbuilder.activities.SavingPlan.AddPersonActivity;
import com.my.visionbuilder.adapters.SavingPlanAdapters.SavingPlanPersonAdapter;
import com.my.visionbuilder.models.Person;

import java.util.ArrayList;

public class GiftsActivity extends AppCompatActivity {

    RecyclerView recyclerview;
    ArrayList<Person> list;
    SavingPlanPersonAdapter adapter;
    RelativeLayout btn_Add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gifts);
        btn_Add = findViewById(R.id.btn_Add);
        recyclerview = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(GiftsActivity.this));
        recyclerview.setNestedScrollingEnabled(false);
        list = new ArrayList<Person>();
        adapter = new SavingPlanPersonAdapter(GiftsActivity.this, list);
        recyclerview.setAdapter(adapter);
        loadSources();
        btn_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GiftsActivity.this, AddPersonActivity.class);
                intent.putExtra("ADD_PERSON_IN", "GIFTS");
                startActivity(intent);
            }
        });
    }
    public void loadSources() {
        Person s1 = new Person( 1, "SOURCE NAME");
        Person s2 = new Person(1, "SOURCE NAME");
        Person s3 = new Person(1, "SOURCE NAME");
        Person s4 = new Person(1, "SOURCE NAME");
        Person s5 = new Person(1, "SOURCE NAME");
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        adapter.notifyDataSetChanged();
    }
}