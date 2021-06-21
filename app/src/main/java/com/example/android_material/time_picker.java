package com.example.android_material;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

public class time_picker extends AppCompatActivity {
    TimePicker timePicker;
    DatePicker date_picker_actions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker);
        timePicker = (TimePicker) findViewById(R.id.tp_time_picker);
        date_picker_actions = (DatePicker) findViewById(R.id.date_picker_actions);
        timePicker.setCurrentHour(5);
        timePicker.setCurrentMinute(35);

        int Current_hours = timePicker.getCurrentHour();
        int Current_min = timePicker.getCurrentMinute();

        Toast.makeText(this, "" + Current_hours + Current_min, Toast.LENGTH_SHORT).show();

        int dat = date_picker_actions.getMonth();
        int year = date_picker_actions.getYear();
        int date = date_picker_actions.getDayOfMonth();


    }
}