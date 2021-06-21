package com.example.android_material;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class Master_array extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_master_array);

        // Here are my integer numbers
        int[] myintegernum={1,2,3,4,5,6,7,8,9,20};
        // Android how to convert int to String?
//        String demo= String.valueOf(myintegernum);
//        Log.i("list",demo);

//        int firstnumofarray=myintegernum[9];
//        Log.i("Tag",firstnumofarray+"");
//        Log.i("Tag","total elements off arry"+myintegernum.length);
//        Log.i("Tag","arry"+myintegernum);
//        Log.i("Tag","last elements off arry"+myintegernum[myintegernum.length-1]);
//        Toast.makeText(this, ""+firstnumofarray, Toast.LENGTH_SHORT).show();


        ArrayList myFavAnimals=new ArrayList();

        myFavAnimals.add("Lion");
        myFavAnimals.add("Tiger");
        myFavAnimals.add("Leopard");
        myFavAnimals.add("Fish");
        myFavAnimals.add(4);

        Log.i("Tag", (String) myFavAnimals.get(3));
        Log.i("Tag",myFavAnimals.toString());


        //When we decler array as a string its not accept int value
//        ArrayList<String> mobilenames=new ArrayList<>();
//        mobilenames.add(4);

        //Hash Map

        HashMap computer=new HashMap();
        computer.put(4,"Galaxy s7");
        computer.put("demo1","Galaxy s1");
        computer.put("demo2","Galaxy s2");
        computer.put("demo3","Galaxy s3");
        computer.put("demo4","Galaxy s4");
        computer.put("demo5","Galaxy s5");
        computer.put("demo6","Galaxy s6");
        computer.remove("demo6");

        Log.i("mytag",computer.toString()); // to display all the list

        Log.i("mytag",computer.size()+""); // find the toatl num of data in thr array

        Log.i("mytag",computer.get(2)+""); //  in hash map cant find the values

        String[] sportname=new String[5];

        sportname[0]="Boxing";
        sportname[1]="Boday bilding";
        sportname[2]="Sweimming";
        sportname[3]="Judo";
        sportname[4]="Boxing";

        Log.i("demo",sportname[4]);






    }
}