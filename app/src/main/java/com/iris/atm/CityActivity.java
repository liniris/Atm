package com.iris.atm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class CityActivity extends AppCompatActivity implements View.OnLongClickListener, AdapterView.OnItemClickListener {

    private static final String TAG =CityActivity.class.getCanonicalName() ;
    public String[] cities;
    private ListView lvCity;
    public int n;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);
        lvCity = (ListView) findViewById(R.id.city);
        cities = new String[]{"新北市","基隆市","台北市"};
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1, cities);
        lvCity.setAdapter(adapter);
        lvCity.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Log.d(TAG, "onltemclick:" + i + "/" + cities[i]);
        TextView tv = (TextView) view;
        tv.setText(tv.getText() + "*");
        if (i == 0) {
            n = 0;
            startActivity(new Intent(this,AreaActivity.class));
//            ListView lvArea = (ListView) findViewById(R.id.city);
//            String[] cities = new String[]{"永和", "板橋", "新莊"};
//            ArrayAdapter adapter2 = new ArrayAdapter(this, android.R.layout.simple_list_item_1, cities);
//            lvArea.setAdapter(adapter2);
//            lvArea.setOnLongClickListener(this);
        }
        if (i == 1) {
            n = 1;
            startActivity(new Intent(this,AreaActivity.class));
            //startActivity(new Intent(this,AreaActivity.class));
//            ListView lvArea = (ListView) findViewById(R.id.city);
//            String[] cities = new String[]{"暖暖", "仁愛", "八堵"};
//            ArrayAdapter adapter3 = new ArrayAdapter(this, android.R.layout.simple_list_item_1, cities);
//            lvArea.setAdapter(adapter3);
//            lvArea.setOnLongClickListener(this);
        }
        if (i == 2) {
            n = 2;
            startActivity(new Intent(this,AreaActivity.class));
//            ListView lvArea = (ListView) findViewById(R.id.city);
//            String[] cities = new String[]{"信義", "萬華", "士林"};
//            ArrayAdapter adapter4 = new ArrayAdapter(this, android.R.layout.simple_list_item_1, cities);
//            lvArea.setAdapter(adapter4);
//            lvArea.setOnLongClickListener(this);
        }

    }

    @Override
    public boolean onLongClick(View v) {
        return false;
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
