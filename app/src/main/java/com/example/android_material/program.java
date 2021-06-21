package com.example.android_material;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class program extends AppCompatActivity {
    private AppCompatEditText Num1;
    private AppCompatEditText num2;
    private TextView plus;
    private TextView min;
    private TextView mul;
    private TextView dev;
    TextView result;
    AppCompatEditText checkeven_odd;
    Button submit;
     String c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program);

        checkeven_odd=findViewById(R.id.check_even_odd);
        result=findViewById(R.id.result);
        submit=findViewById(R.id.submit);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int Number= Integer.parseInt(checkeven_odd.getText().toString());
                //Check if the number is divisible by 2 or not
                if(Number%2==0){
                    result.setText("even number"+Number);
                }else{
                    result.setText("odd number"+Number);
                }
            }
        });



















        Num1 = (AppCompatEditText) findViewById(R.id.Num1);
        num2 = (AppCompatEditText) findViewById(R.id.num2);
        plus = (TextView) findViewById(R.id.plus);
        min = (TextView) findViewById(R.id.min);
        mul = (TextView) findViewById(R.id.mul);
        dev = (TextView) findViewById(R.id.dev);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c="plus";
                Texting();
            }
        });

        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c="min";
                Texting();
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c="mul";
                Texting();
            }
        });

        dev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Texting();
            }
        });
    }
   String DEMO="min";
    String name="plus";
    private void Texting() {

        switch(DEMO)
        {
            case "plus":
                int result=Integer.parseInt(Num1.getText().toString()) + Integer.parseInt(num2.getText().toString());
                Toast.makeText(this, ""+result, Toast.LENGTH_SHORT).show();
                break;

            case "min":
                int result1=Integer.parseInt(Num1.getText().toString()) - Integer.parseInt(num2.getText().toString());
                Toast.makeText(this, ""+result1, Toast.LENGTH_SHORT).show();
                break;

            case "mul":
                int result2=Integer.parseInt(Num1.getText().toString()) * Integer.parseInt(num2.getText().toString());
                Toast.makeText(this, ""+result2, Toast.LENGTH_SHORT).show();
                break;

            case "dev":
                int result3=Integer.parseInt(Num1.getText().toString()) / Integer.parseInt(num2.getText().toString());
                Toast.makeText(this, ""+result3, Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
}