package com.example.android_material;

import androidx.annotation.LongDef;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv_YoutubeVideo, Looping_Statement,api;
    int number;
    private TextView tvVarabale;
    private TextView tvMasterArrey;
    private TextView tv_calculater;
    private TextView android_ui_control;
    TextView for_loop;
    Boolean demo = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    findview_me();
            onclick_list();

    }

    private void onclick_list() {
        tv_YoutubeVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Youtube_Video.class);
                startActivity(intent);
            }
        });

        Looping_Statement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, looping_statement_part1.class);
                startActivity(intent);
            }
        });

        tvVarabale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, master_varable.class);
                startActivity(intent);
            }
        });

        tvMasterArrey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Master_array.class);
                startActivity(intent);
            }
        });

        tv_calculater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, program.class);
                startActivity(intent);
            }
        });
        api.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, multiple_array_api.class);
                startActivity(intent);
            }
        });

        android_ui_control.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Android_widget.class);
                startActivity(intent);
            }
        });
    }

    private void findview_me() {
        tv_YoutubeVideo = findViewById(R.id.tv_YoutubeVideo);
        Looping_Statement = findViewById(R.id.Looping_Statement);
        tvVarabale = (TextView) findViewById(R.id.tv_varabale);
        tvMasterArrey = (TextView) findViewById(R.id.tv_master_arrey);
        tv_calculater = (TextView) findViewById(R.id.tv_calculater);
        for_loop = (TextView) findViewById(R.id.for_loop);
        api = (TextView) findViewById(R.id.api);
        android_ui_control = (TextView) findViewById(R.id.android_ui_control);
    }


}