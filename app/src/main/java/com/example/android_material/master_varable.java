package com.example.android_material;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class master_varable extends AppCompatActivity {

    int age = 3165;   //Semicolon ; = Aiignment oprater
    float price = 16.5f;  // Float ,double    double data type acupyd more spance in memory but the float occupayd the less
    double userScore = 4.1253648;
    byte computerRam = 1; // Assignvalues is very limited
    long computerRams = 3165465461216546l;
    boolean isdead = true;
    String name = "165465465";
    char latter = 'A';


    int a = 30;
    int b;

    private AppCompatEditText Num1;
    private AppCompatEditText num2;
    private TextView Check;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_master_varable);
        Num1 = (AppCompatEditText) findViewById(R.id.Num1);
        num2 = (AppCompatEditText) findViewById(R.id.num2);
        Check = (TextView) findViewById(R.id.Check);


        if (name.contains("G")){
            Toast.makeText(this, ""+a, Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, b + "", Toast.LENGTH_SHORT).show();
        }

            Check.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
//                int result=Integer.parseInt(Num1.getText().toString()) * Integer.parseInt(num2.getText().toString());
//                Toast.makeText(master_varable.this, ""+result, Toast.LENGTH_SHORT).show();

                    float rResult = Float.parseFloat(Num1.getText().toString()) % Float.parseFloat(num2.getText().toString());
                    Check.setText(rResult + "");
                }
            });
    }
}