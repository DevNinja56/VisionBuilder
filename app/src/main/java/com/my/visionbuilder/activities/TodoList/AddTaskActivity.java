package com.my.visionbuilder.activities.TodoList;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.google.android.material.textfield.TextInputEditText;
import com.my.visionbuilder.R;

public class AddTaskActivity extends AppCompatActivity {

    TextInputEditText task_EditText, selected_DateEditText, selected_TimeEditText;
    RelativeLayout back_Sign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);

        back_Sign = findViewById(R.id.back_Sign);
        task_EditText = findViewById(R.id.selected_TimeEditText);
        selected_DateEditText = findViewById(R.id.selected_DateEditText);
        selected_TimeEditText = findViewById(R.id.selected_TimeEditText);

        back_Sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}