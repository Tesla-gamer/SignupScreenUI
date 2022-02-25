package com.abhishek.signupscreen.firstsignupscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.abhishek.signupscreen.R;

public class SignupActivity extends AppCompatActivity {
    TextView Alreadhaveaccount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);Alreadhaveaccount = findViewById(R.id.textView12);
        Alreadhaveaccount.setOnClickListener(v -> startActivity(new Intent(SignupActivity.this, LoginActivity.class)));

    }
}