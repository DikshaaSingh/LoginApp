package com.example.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText et;
    private EditText ety;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = findViewById(R.id.et1);
        ety = findViewById(R.id.et2);
        b = findViewById(R.id.bt);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           check(et.getText().toString(),ety.getText().toString());



            }
        });


    }

    private void check(String userName, String userPassword) {
        if ((userName.equals("Admin")) && (userPassword.equals("1233"))) {

            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        } else {
            Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
            startActivity(intent);
        }



    }
}