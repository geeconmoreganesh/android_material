package com.example.android_material;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class home_screen extends AppCompatActivity {
    private TextView userName;
    ImageView back_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        userName = (TextView) findViewById(R.id.user_name);
        back_btn = (ImageView) findViewById(R.id.back_btn);

        Intent intent = getIntent();
        String user_name = intent.getStringExtra("user_f_name");
        userName.setText(user_name);

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(home_screen.this,login.class);
                startActivity(intent1);
            }
        });
    }
}