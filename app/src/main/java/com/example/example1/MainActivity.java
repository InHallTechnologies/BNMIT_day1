package com.example.example1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button, button1;
    TextView food;
    EditText toastContent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button1 = findViewById(R.id.button_one);
        toastContent = findViewById(R.id.toast_input_edit_text);

        food = findViewById(R.id.food_text_view);
        food.setText("Curd Rice");
        button.setText("Press Me!");

        Intent intent = new Intent(MainActivity.this, PsudoAuth.class);
        startActivity(intent);
        finish();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // I am a callback for button with ID "button"

            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GalleryActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    public void popToast(View view) {
        String content = toastContent.getText().toString();
        if (content.equals("")) {
            Toast.makeText(this, "Empty content", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, content, Toast.LENGTH_SHORT).show();
        }
        toastContent.setText("");
    }
}

//1. Create an edit text
//2. Create a button
//3. Add a listener to the button
//4. Pop a toast with the contents of edit text on button click