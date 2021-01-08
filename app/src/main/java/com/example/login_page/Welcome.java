package com.example.login_page;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Welcome extends AppCompatActivity {

    private TextView Name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Name = findViewById(R.id.textView2);
        String Username =getIntent().getStringExtra("Username");

        Name.setText(Username);
    }
}