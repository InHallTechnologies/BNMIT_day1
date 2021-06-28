package com.example.example1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.example1.Samples.SampleUsers;

import java.util.List;

public class PsudoAuth extends AppCompatActivity {

    SampleUsers sampleUsers;
    EditText email, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psudo_auth);
        sampleUsers = new SampleUsers();
        
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
    }

    public void verify(View view) {
        if (email.getText().toString().equals("")){
            email.setError("Please enter a valid email id");
            email.requestFocus();
            return;
        }

        if (password.getText().toString().equals("")){
            password.setError("Please a valid password");
            password.requestFocus();
            return;
        }
        String emailId = email.getText().toString();
        String pass = password.getText().toString();

        for (int i = 0; i < sampleUsers.getUserClasses().size(); i++) {
            if(sampleUsers.getUserClasses().get(i).getEmailId().equals(emailId) && sampleUsers.getUserClasses().get(i).getPassword().equals(pass)){
                Toast.makeText(this, "Valid User found!", Toast.LENGTH_SHORT).show();
            }
        }
    }
}

/*
* One Edit text for Email
* One Edit text for Password
* One Button to verify if the information is valid
*
* */