package com.my.visionbuilder.activities.Medical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.my.visionbuilder.R;

public class MedicalDetailsActivity extends AppCompatActivity {

    RelativeLayout back_Sign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical_details);
        back_Sign = findViewById(R.id.back_Sign);
        back_Sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}