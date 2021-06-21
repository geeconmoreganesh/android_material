package com.example.android_material;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatRadioButton;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RadioButton extends AppCompatActivity {
    AppCompatRadioButton android, java, angular, python;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);
        android = (AppCompatRadioButton)findViewById(R.id.rdbAndroid);
        angular = (AppCompatRadioButton)findViewById(R.id.rdbAngular);
        java = (AppCompatRadioButton)findViewById(R.id.rdbJava);
        python = (AppCompatRadioButton)findViewById(R.id.rdbPython);
        AppCompatButton btn = (AppCompatButton) findViewById(R.id.getBtn);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result = "Selected Course: ";
                result+= (android.isChecked())?"Android":(angular.isChecked())?"AngularJS":(java.isChecked())?"Java":(python.isChecked())?"Python":"";
                Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((AppCompatRadioButton) view).isChecked();
        String str="";
        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.rdbAndroid:
                if(checked)
                    str = "Android Selected";
                break;
            case R.id.rdbAngular:
                if(checked)
                    str = "AngularJS Selected";
                break;
            case R.id.rdbJava:
                if(checked)
                    str = "Java Selected";
                break;
            case R.id.rdbPython:
                if(checked)
                    str = "Python Selected";
                break;
        }
        Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
    }
}

