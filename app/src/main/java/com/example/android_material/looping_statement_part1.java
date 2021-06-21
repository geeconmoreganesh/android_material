package com.example.android_material;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class looping_statement_part1 extends AppCompatActivity {
    private AppCompatEditText Num1;
    private AppCompatEditText num2;
    private AppCompatButton Check;
    int v1;
    int v2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_looping_statement_part1);

        Log.d("check", "onCreate pass1");

        findviewbyme();
        onclickmethod();
    }
    private void onclickmethod() {
        Check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("check", "ckeck onclick pass");
                v1=Integer.parseInt(Num1.getText().toString());
                v2=Integer.parseInt(num2.getText().toString());

                if (v1>v2) {
                    Log.d("check", "ckeck Num is Greater pass");
                    Toast.makeText(looping_statement_part1.this, v1+"Num is Greater", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(looping_statement_part1.this, v2+"Num is Greater", Toast.LENGTH_SHORT).show();
                } }
        });

    }

    private void findviewbyme() {
        Log.d("check", "findviewbyme pass2");
        Num1 = (AppCompatEditText) findViewById(R.id.Num1);
        num2 = (AppCompatEditText) findViewById(R.id.num2);
        Check = (AppCompatButton) findViewById(R.id.Check);
    }
}