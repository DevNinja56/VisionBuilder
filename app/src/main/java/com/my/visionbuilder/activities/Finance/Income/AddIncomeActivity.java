package com.my.visionbuilder.activities.Finance.Income;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.my.visionbuilder.R;

public class AddIncomeActivity extends AppCompatActivity {

    RelativeLayout back_Sign;
    TextView txt_Heading;
    String income_Type;
    String source_Name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_income);

        income_Type = getIntent().getStringExtra("INCOME_TYPE");
        source_Name = getIntent().getStringExtra("SOURCE_NAME");
        txt_Heading = findViewById(R.id.txt_Heading);
        back_Sign = findViewById(R.id.back_Sign);
        txt_Heading.setText("Add "+income_Type+" from "+source_Name);
        back_Sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}