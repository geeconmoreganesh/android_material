package com.example.android_material;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.android_material.adapter.Adapter_one;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

import static java.security.AccessController.getContext;

public class api_one extends AppCompatActivity {
String URL_demo="http://geecon.co.uk/dev/signIt/rest/SIGNITServices.php";
    Adapter_one adapter_one;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_api_one);

        recyclerView=findViewById(R.id.recycler_view);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);

        getchapter();
    }

    private void getchapter() {
        Log.d("subject_log","api call");
        RequestQueue requestQueue = Volley.newRequestQueue(getApplicationContext());
        StringRequest request = new StringRequest(Request.Method.POST, URL_demo, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    Log.d("subject_log","test response");

                    JSONObject JsonObject= new JSONObject(response);
                    String scucess=JsonObject.getString("success");
                    String data=JsonObject.getString("data");
                    JSONObject JsonObject1= new JSONObject(data);
                    String templateList=JsonObject1.getString("templateList");
                    JSONArray Jsonarry=new JSONArray(templateList);
                    for (int i = 0; i <Jsonarry.length(); i++) {
                        JSONObject content_list=Jsonarry.getJSONObject(i); }
                    adapter_one=new Adapter_one(getApplicationContext(),Jsonarry);
                    recyclerView.setAdapter(adapter_one);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(), error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                HashMap<String,String> hashMap = new HashMap<>();
                hashMap.put("view", "getTemplateList");
                hashMap.put("oa_brand_id", "1288");
                hashMap.put("user_id", "3784");
                return hashMap;
            }
        };
        requestQueue.add(request);
    }
}