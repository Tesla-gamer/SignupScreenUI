package com.abhishek.signupscreen.firstsignupscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.abhishek.signupscreen.R;

public class LoginActivity extends AppCompatActivity {
    TextView createnewAccount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        createnewAccount = findViewById(R.id.textView12);
        createnewAccount.setOnClickListener(v -> startActivity(new Intent(LoginActivity.this, SignupActivity.class)));


    }
}