package com.my.visionbuilder.activities.Medical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.my.visionbuilder.R;

public class AddEditMedicalActivity extends AppCompatActivity {

    TextView family_MemberNameTitle;
    TextInputEditText family_MemberName;
    String purpose;
    RelativeLayout back_Sign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_medical);

        purpose = getIntent().getStringExtra("PURPOSE");
        family_MemberNameTitle = findViewById(R.id.family_MemberNameTitle);
        family_MemberName = findViewById(R.id.family_MemberName);
        if(purpose.equals("ADD_PERSONAL")){
            family_MemberNameTitle.setVisibility(View.GONE);
            family_MemberName.setVisibility(View.GONE);
        }
        back_Sign = findViewById(R.id.back_Sign);
        back_Sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}