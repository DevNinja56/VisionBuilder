package com.my.visionbuilder.activities.Business.BusinessContacts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.my.visionbuilder.R;
import com.my.visionbuilder.activities.Contact.AddContactActivity;
import com.my.visionbuilder.activities.Contact.ContactsActivity;

public class BusinessContactsActivity extends AppCompatActivity {

    RelativeLayout back_Sign;
    RelativeLayout btn_Add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_contacts);
        btn_Add = findViewById(R.id.btn_Add);
        back_Sign = findViewById(R.id.back_Sign);
        back_Sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btn_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BusinessContactsActivity.this, AddBusinessContactsActivity.class);
                startActivity(intent);
            }
        });
    }
}