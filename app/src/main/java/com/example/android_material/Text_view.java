package com.example.android_material;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Text_view extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
        TextView textView=findViewById(R.id.tv);
        textView.setText("Ganesh@gmail.com");
    }

    public void text_view(View view) {

    }
}