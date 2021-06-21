package com.example.android_material;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Toggle_Button extends AppCompatActivity {
    ToggleButton toggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle__button);

         toggle = (ToggleButton) findViewById(R.id.togglebutton);
         String demo= toggle.getText().toString();

        Log.d("pass", "onCreate: "+demo);

//        toggle.setTextOff("wifi off");
//        toggle.setTextOn("wifi on");
//        toggle.setChecked(true);


        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    Toast.makeText(Toggle_Button.this, "Wifi On", Toast.LENGTH_SHORT).show();
                } else{
                    Toast.makeText(Toggle_Button.this, "Wifi Off", Toast.LENGTH_SHORT).show();
                }
            }
        });

 //       ToggleButton Attributes

//        android:id	        :It is used to uniquely identify the control
//        android:checked	    :It is used to specify the current state of toggle button
//        android:gravity	    :It is used to specify how to align the text like left, right, center, top, etc.
//        android:text	        :It is used to set the text.
//        android:textOn	    :It is used to set the text when the toggle button is in the ON / Checked state.
//        android:textOff	    :It is used to set the text when the toggle button is in the OFF / Unchecked state.
//        android:textColor	    :It is used to change the color of text.
//        android:textSize	    :It is used to specify the size of text.
//        android:textStyle	    :It is used to change the style (bold, italic, bolditalic) of text.
//        android:background	:It is used to set the background color for toggle button control.
//        android:padding	    :It is used to set the padding from left, right, top and bottom.
//        android:drawableBottom :It’s drawable to be drawn to the below text.
//        android:drawableRight	:It’s drawable to be drawn to the right of the text.
//        android:drawableLeft	:It’s drawable to be drawn to the left of text.

        AppCompatButton btnGet=findViewById(R.id.btnGet);
        btnGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Toggle Button1 -  " + toggle.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}