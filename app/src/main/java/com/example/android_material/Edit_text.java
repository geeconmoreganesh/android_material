package com.example.android_material;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class Edit_text extends AppCompatActivity {
    private EditText userName;
    private EditText userLastName;
    private EditText userEmailName;
    AppCompatButton Submit;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);

        userName = (EditText) findViewById(R.id.user_name);
        userLastName = (EditText) findViewById(R.id.user_last_name);
        userEmailName = (EditText) findViewById(R.id.user_email_name);
        Submit = findViewById(R.id.Submit);

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (userName.getText().toString().isEmpty()||userLastName.getText().toString().isEmpty()||userEmailName.getText().toString().isEmpty()){
                    Toasty.warning(getApplicationContext(), "Please Enter all data", Toast.LENGTH_SHORT, true).show();
                }
                else {
                    String username=userName.getText().toString();
                    String lastname=userLastName.getText().toString();
                    String email=userEmailName.getText().toString();
                    Toasty.success(getApplicationContext(),"User Details" +username+"\n"+lastname+"\n"+email , Toast.LENGTH_SHORT, true).show();

                    userName.setText("");
                    userLastName.setText("");
                    userEmailName.setText("");
                }


            }
        });


    }
}