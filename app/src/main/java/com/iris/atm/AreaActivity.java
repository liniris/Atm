package com.iris.atm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AreaActivity extends CityActivity {

    private static final String TAG = AreaActivity.class.getCanonicalName();
    private ListView lvArea;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);
        lvArea = (ListView) findViewById(R.id.area);
        String s = Integer.toString(n);
        Log.d(TAG,s+"這個");

       if (n == 0) {
           String[] cities1 = new String[]{"永和", "板橋", "新莊"};
           ArrayAdapter adapter1 = new ArrayAdapter(this, android.R.layout.simple_list_item_1, cities1);
           lvArea.setAdapter(adapter1);
           lvArea.setOnLongClickListener(this);
       }if (n == 1) {
            String[] cities2 = new String[]{"暖暖", "仁愛", "八堵"};
            ArrayAdapter adapter2 = new ArrayAdapter(this, android.R.layout.simple_list_item_1, cities2);
            lvArea.setAdapter(adapter2);
            lvArea.setOnLongClickListener(this);
        }if (n == 2){
            String[] cities3 = new String[]{"信義", "萬華", "士林"};
            ArrayAdapter adapter3 = new ArrayAdapter(this, android.R.layout.simple_list_item_1, cities3);
            lvArea.setAdapter(adapter3);
            lvArea.setOnLongClickListener(this);
        }

    }

}
