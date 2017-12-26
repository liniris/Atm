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

public class CityActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private static final String TAG =CityActivity.class.getCanonicalName() ;
    private String[] cities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);
        ListView lvCity = (ListView) findViewById(R.id.city);
        cities = new String[]{"新北市","基隆市","台北市"};
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1, cities);
        lvCity.setAdapter(adapter);
        lvCity.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        Log.d(TAG,"onltemclick:"+position+"/" + cities[position] );
        TextView tv = (TextView) view;
        tv.setText(tv.getText()+"*");
        if (position==0){
            
            startActivity(new Intent(this,AreaActivity.class));
            ListView lvArea = (ListView) findViewById(R.id.area);
            String[] areas = new String[]{"永和","",""};
            ArrayAdapter adapter2 = new ArrayAdapter(this,android.R.layout.simple_list_item_1, areas);
        }
    }
}
