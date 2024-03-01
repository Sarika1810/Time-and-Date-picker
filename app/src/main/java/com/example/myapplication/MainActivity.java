package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


        import androidx.appcompat.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.*;
public class MainActivity extends AppCompatActivity
{
    TimePicker tp;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tp=(TimePicker)findViewById(R.id.time24) ;
        tp.setIs24HourView(true);
    }
}
