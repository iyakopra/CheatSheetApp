package com.example.cheatsheetapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvTitle;
    Button  btnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTitle = findViewById(R.id.tvTitle);
        btnOk = findViewById(R.id.btnOk);

        Toast.makeText(getApplicationContext(), "onCreate", Toast.LENGTH_LONG).show();

    }

    public void onBtnOkClick(View view) {
        tvTitle.append("\n Button clicked.");

    }


}