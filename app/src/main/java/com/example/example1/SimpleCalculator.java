package com.example.example1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SimpleCalculator extends AppCompatActivity implements View.OnClickListener {

    Button button;
    EditText num1, num2;
    float number1 = 0, number2 = 0;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_calculator);
        button = findViewById(R.id.divide);
        num1 = findViewById(R.id.number_one_edit_text);
        num2 = findViewById(R.id.number_two_edit_text);
        result = findViewById(R.id.result);

        button.setOnClickListener(this);
    }

    public void addNumbers(View view) {

        if (num1.getText().toString().equals("")){
            num1.setError("Please enter a valid value");
            return;
        }

        if (num2.getText().toString().equals("")){
            num2.setError("Please enter a valid value");
            return;
        }
        try{
            number1 = Float.parseFloat(num1.getText().toString());
            number2 = Float.parseFloat(num2.getText().toString());

            result.setText("The Sum is: " + Float.toString(number1+number2));
        }catch (Exception e){
            Toast.makeText(this, "Please enter a number", Toast.LENGTH_SHORT).show();
        }
       
    }
    public void subNumbers(View view) {
        if (num1.getText().toString().equals("")){
            num1.setError("Please enter a valid value");
            return;
        }

        if (num2.getText().toString().equals("")){
            num2.setError("Please enter a valid value");
            return;
        }
        number1 = Float.parseFloat(num1.getText().toString());
        number2 = Float.parseFloat(num2.getText().toString());
        result.setText("The Difference is: " + Float.toString(number1-number2));
    }
    public void mulNumbers(View view) {
        if (num1.getText().toString().equals("")){
            num1.setError("Please enter a valid value");
            return;
        }

        if (num2.getText().toString().equals("")){
            num2.setError("Please enter a valid value");
            return;
        }
        number1 = Float.parseFloat(num1.getText().toString());
        number2 = Float.parseFloat(num2.getText().toString());
        result.setText("The Product is: " + Float.toString(number1 * number2));
    }

    @Override
    public void onClick(View v) {

        if (num1.getText().toString().equals("")){
            num1.setError("Please enter a valid value");
            return;
        }

        if (num2.getText().toString().equals("")){
            num2.setError("Please enter a valid value");
            return;
        }
        number1 = Float.parseFloat(num1.getText().toString());
        number2 = Float.parseFloat(num2.getText().toString());
        if (number2 == 0){
            result.setText("Division by zero is not possible");

        }else {
            result.setText("The Value is: " + Float.toString(number1/number2));

        }
    }

    public void clear(View view) {
        num1.setText("");
        num2.setText("");
        result.setText("");
    }
}