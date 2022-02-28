package com.my.visionbuilder.activities.Finance.Income;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.my.visionbuilder.R;

public class AddSourceActivity extends AppCompatActivity {

    TextView txt_Heading;
    String add_SourceFor;
    RelativeLayout back_Sign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_source);

        add_SourceFor = getIntent().getStringExtra("ADD_SOURCE_FOR");
        txt_Heading = findViewById(R.id.txt_Heading);
        txt_Heading.setText("Add source for "+add_SourceFor);
        back_Sign = findViewById(R.id.back_Sign);
        back_Sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}