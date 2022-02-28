package com.my.visionbuilder.activities.Shopping;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.my.visionbuilder.R;

public class ShoppingDetailsActivity extends AppCompatActivity {

    TextView purpose_NameHeading;
    String purpose;
    RelativeLayout back_Sign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_details);

        back_Sign = findViewById(R.id.back_Sign);
        back_Sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        purpose_NameHeading = findViewById(R.id.purpose_NameHeading);
        if(purpose.equals("ADD_CLOTHING")) {
            purpose_NameHeading.setText(getResources().getString(R.string.title_ShopName));
        } else if(purpose.equals("ADD_GROCERIES")) {
            purpose_NameHeading.setText(getResources().getString(R.string.title_StoreName));
        } else if(purpose.equals("ADD_HE")) {
            purpose_NameHeading.setText(getResources().getString(R.string.title_HE));
        } else if(purpose.equals("ADD_DINNING_OUT")) {
            purpose_NameHeading.setText(getResources().getString(R.string.title_DinningOut));
        }
    }
}