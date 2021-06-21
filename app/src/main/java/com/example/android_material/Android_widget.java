package com.example.android_material;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

public class Android_widget extends AppCompatActivity {
    private TextView tvTextView;
    private TextView RadioButton;
    private TextView ivImageView;
    private TextView tpTimePicker;
    private TextView dpDatePicker;
    private TextView ed_edit_text;
    private TextView btn_Button;
    private TextView tp_time_picker;
    TextView ed_ToggleButton;
    TextView CheckBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_widget);

        tvTextView = (TextView) findViewById(R.id.tv_text_view);
        ivImageView = (TextView) findViewById(R.id.iv_image_view);
        tpTimePicker = (TextView) findViewById(R.id.tp_time_picker);
        dpDatePicker = (TextView) findViewById(R.id.dp_date_picker);
        ed_edit_text = (TextView) findViewById(R.id.ed_edit_text);
        btn_Button = (TextView) findViewById(R.id.btn_Button);
        tp_time_picker = (TextView) findViewById(R.id.tp_time_picker);
        RadioButton = (TextView) findViewById(R.id.RadioButton);
        ed_ToggleButton = findViewById(R.id.ed_ToggleButton);
        CheckBox = findViewById(R.id.CheckBox);

        ed_edit_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Android_widget.this,Edit_text.class);
                startActivity(intent);
            }
        });

        btn_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Android_widget.this,Edit_text.class);
                startActivity(intent);
            }
        });

        tp_time_picker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Android_widget.this,time_picker.class);
                startActivity(intent);
            }
        });

        ed_ToggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Android_widget.this,Toggle_Button.class);
                startActivity(intent);
            }
        });

        CheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Android_widget.this,CheckBox.class);
                startActivity(intent);
            }
        });

        RadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Android_widget.this,RadioButton.class);
                startActivity(intent);
            }
        });

    }
}