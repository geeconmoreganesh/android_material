package com.example.android_material;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class CheckBox extends AppCompatActivity {
    private AppCompatCheckBox android, java, angular, python;
    AppCompatButton getBtn;
    AppCompatCheckBox chk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        android = (AppCompatCheckBox) findViewById(R.id.chkPython);
        java = (AppCompatCheckBox) findViewById(R.id.chkAndroid);
        angular = (AppCompatCheckBox) findViewById(R.id.chkAngular);
        python = (AppCompatCheckBox) findViewById(R.id.chkPython);
        python.setEnabled(false);
        chk = (AppCompatCheckBox) findViewById(R.id.chk1);
        getBtn = (AppCompatButton) findViewById(R.id.btn);

            getBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (android.isChecked()||java.isChecked()||python.isChecked()){
                    String result1="";
                    String result = "Selected Courses";
                    if (android.isChecked()) {
                        result1=android.getText().toString();
                    }
                    if (angular.isChecked()) {
                        result += "AngularJS";
                    }
                    if (java.isChecked()) {
                        result += "\nJava";
                    }
                    if (python.isChecked()) {
                        result += "\nPython";
                    }
                    Toast.makeText(CheckBox.this,result1, Toast.LENGTH_SHORT).show();

                    }
                    else {
                        Toast.makeText(CheckBox.this,"Please select all Courses", Toast.LENGTH_SHORT).show();
                    }
                }
            });




    }


}