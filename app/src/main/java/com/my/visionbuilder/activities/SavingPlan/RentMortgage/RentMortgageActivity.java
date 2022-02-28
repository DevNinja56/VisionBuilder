package com.my.visionbuilder.activities.SavingPlan.RentMortgage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import com.my.visionbuilder.R;
import com.my.visionbuilder.activities.SavingPlan.AddPersonActivity;
import com.my.visionbuilder.adapters.SavingPlanAdapters.RentMortage.HomeAdapter;
import com.my.visionbuilder.adapters.SavingPlanAdapters.SavingPlanPersonAdapter;
import com.my.visionbuilder.models.Home;
import com.my.visionbuilder.models.Person;
import java.util.ArrayList;

public class RentMortgageActivity extends AppCompatActivity {

    RecyclerView recyclerview;
    ArrayList<Home> list;
    HomeAdapter adapter;
    RelativeLayout btn_Add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rent_mortgage);
        btn_Add = findViewById(R.id.btn_Add);
        recyclerview = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(RentMortgageActivity.this));
        recyclerview.setNestedScrollingEnabled(false);
        list = new ArrayList<Home>();
        adapter = new HomeAdapter(RentMortgageActivity.this, list);
        recyclerview.setAdapter(adapter);
        loadSources();
        btn_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RentMortgageActivity.this, AddHomeActivity.class);
                startActivity(intent);
            }
        });
    }
    public void loadSources() {
        Home s1 = new Home( 1, "Home NAME", "");
        Home s2 = new Home(1, "HOME NAME", "");
        Home s3 = new Home(1, "SOURCE NAME", "");
        list.add(s1);
        list.add(s2);
        list.add(s3);
        adapter.notifyDataSetChanged();
    }
}