package com.example.curd;

import static com.example.curd.R.layout.activity_main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;

public class MainActivity extends AppCompatActivity {


    DatabaseReference databaseReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);
    }
}