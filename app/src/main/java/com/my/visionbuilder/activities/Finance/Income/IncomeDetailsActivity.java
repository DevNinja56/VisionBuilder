package com.my.visionbuilder.activities.Finance.Income;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.my.visionbuilder.R;

public class IncomeDetailsActivity extends AppCompatActivity {

    String income_Type;
    TextView txt_Details;
    RelativeLayout back_Sign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_income_details);

        income_Type = getIntent().getStringExtra("INCOME_TYPE");
        txt_Details = findViewById(R.id.txt_Details);
        back_Sign = findViewById(R.id.back_Sign);
        txt_Details.setText("Transaction Details");
        back_Sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}