package com.example.example1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CounterActivity extends AppCompatActivity {
    TextView number;
    EditText incrementValue;
    int num = 0;
    int stepValue = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);
        number = findViewById(R.id.number_text_view);
        incrementValue = findViewById(R.id.increment_step_edit_text);
    }

    public void add(View view) {
        if (incrementValue.getText().toString().equals("")){
            stepValue = 0;
        }else {
            stepValue = Integer.parseInt(incrementValue.getText().toString());
        }
        num = num + stepValue;
        number.setText(Integer.toString(num));
    }

    public void sub(View view) {
        if (incrementValue.getText().toString().equals("")){
            stepValue = 0;
        }else {
            stepValue = Integer.parseInt(incrementValue.getText().toString());
        }
        num = num - stepValue;
        number.setText(Integer.toString(num));
    }

    public void reset(View view) {
        incrementValue.setText("");
        stepValue = 0;
        num = 0;
        number.setText("0");
    }
}