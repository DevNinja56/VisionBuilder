package com.my.visionbuilder.activities.Trips;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import com.my.visionbuilder.R;
import com.my.visionbuilder.adapters.TripAdapters.TripLayoversAdapter;
import com.my.visionbuilder.models.TripLayover;
import java.util.ArrayList;

public class TripLayoversActivity extends AppCompatActivity {

    RecyclerView recyclerview;
    ArrayList<TripLayover> list;
    TripLayoversAdapter adapter;
    RelativeLayout btn_Add;
    RelativeLayout back_Sign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trip_layovers);
        back_Sign = findViewById(R.id.back_Sign);
        btn_Add = findViewById(R.id.btn_Add);
        recyclerview = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(TripLayoversActivity.this));
        recyclerview.setNestedScrollingEnabled(false);
        list = new ArrayList<TripLayover>();
        adapter = new TripLayoversAdapter(TripLayoversActivity.this, list);
        recyclerview.setAdapter(adapter);
        loadSources();
        back_Sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btn_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TripLayoversActivity.this, AddTripLayoverActivity.class);
                startActivity(intent);
            }
        });
    }
    public void loadSources() {
        TripLayover s1 = new TripLayover( 1, "", "", "", "", "", "");
        TripLayover s2 = new TripLayover( 1, "", "", "", "", "", "");
        list.add(s1);
        list.add(s2);
        adapter.notifyDataSetChanged();
    }
}