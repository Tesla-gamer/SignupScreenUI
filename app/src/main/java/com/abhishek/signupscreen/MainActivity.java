package com.abhishek.signupscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.abhishek.signupscreen.custom.AnotherActivity;
import com.abhishek.signupscreen.custom.NavActivity;
import com.abhishek.signupscreen.custom.USerActivity;
import com.abhishek.signupscreen.firstsignupscreen.LoginActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn_example1, btn_example2, btn_example3, btn_example4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_example1 = findViewById(R.id.btn_example1);
        btn_example2 = findViewById(R.id.btn_example2);
        btn_example3 = findViewById(R.id.btn_example3);
        btn_example4 = findViewById(R.id.btn_example4);

        btn_example1.setOnClickListener(this);
        btn_example2.setOnClickListener(this);
        btn_example3.setOnClickListener(this);
        btn_example4.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_example1:
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
                break;
            case R.id.btn_example2:
                startActivity(new Intent(MainActivity.this, USerActivity.class));
                break;
            case R.id.btn_example3:
                startActivity(new Intent(MainActivity.this, NavActivity.class));
                break;
            case R.id.btn_example4:
                startActivity(new Intent(MainActivity.this, AnotherActivity.class));
                break;
        }
    }
}