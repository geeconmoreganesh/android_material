package com.example.android_material.adapter;

import android.content.Context;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android_material.R;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.HashMap;
public class Adapter_one extends RecyclerView.Adapter<Adapter_one.myviewholder> {
    ArrayList<HashMap<String, String>> list_titles;
    JSONArray data;
    Context context;
    private ViewGroup tContainer;
    public Adapter_one(Context context, JSONArray records) {
        this.data = records;
        this.context = context;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.single_api_one, parent, false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final myviewholder holder, int position) {
        try {
            holder.one.setText(this.data.getJSONObject(position).getString("NAME"));
//            String topics = this.data.getJSONObject(position).getString("topics");
//            JSONArray topics_array = new JSONArray(topics);

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int getItemCount() {
        return this.data.length();
    }

    public class myviewholder extends RecyclerView.ViewHolder {

        private TextView one;
        private TextView two;
        private TextView three;


        public myviewholder(@NonNull View itemView) {
            super(itemView);

            one = (TextView) itemView.findViewById(R.id.one);
            two = (TextView) itemView.findViewById(R.id.two);
            three = (TextView) itemView.findViewById(R.id.three);
        }
    }
}
