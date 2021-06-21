package com.example.android_material;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class multiple_array_api extends AppCompatActivity {
    ImageView api_multiple_array;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple_array_api);

        api_multiple_array=findViewById(R.id.api_multiple_array);

        api_multiple_array.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(multiple_array_api.this,api_one.class);
                startActivity(intent);
            }
        });

    }
}