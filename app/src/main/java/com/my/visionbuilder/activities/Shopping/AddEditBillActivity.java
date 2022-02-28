package com.my.visionbuilder.activities.Shopping;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.my.visionbuilder.R;

public class AddEditBillActivity extends AppCompatActivity {

    TextView shopping_TypeName;
    String purpose;
    TextInputEditText shopping_Desc;
    RelativeLayout back_Sign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_bill);

        shopping_TypeName = findViewById(R.id.shopping_TypeName);
        shopping_Desc = findViewById(R.id.shopping_Desc);
        purpose = getIntent().getStringExtra("PURPOSE");
        if(purpose.equals("ADD_CLOTHING")) {
            shopping_TypeName.setText(getResources().getString(R.string.title_ShopName));
            shopping_Desc.setHint(getResources().getString(R.string.hint_ClothingDescHint));
        } else if(purpose.equals("ADD_GROCERIES")) {
            shopping_TypeName.setText(getResources().getString(R.string.title_StoreName));
            shopping_Desc.setHint(getResources().getString(R.string.hint_GroceriesDescHint));
        } else if(purpose.equals("ADD_HE")) {
            shopping_TypeName.setText(getResources().getString(R.string.title_HE));
            shopping_Desc.setHint(getResources().getString(R.string.hint_HE));
        } else if(purpose.equals("ADD_DINNING_OUT")) {
            shopping_TypeName.setText(getResources().getString(R.string.title_DinningOut));
            shopping_Desc.setHint(getResources().getString(R.string.hint_DinningOutHint));
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