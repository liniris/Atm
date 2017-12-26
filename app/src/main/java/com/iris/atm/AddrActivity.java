package com.iris.atm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class AddrActivity extends AppCompatActivity {

    private Spinner addr;
    private Spinner addr2;
    private String[] data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addr);
        addr = (Spinner) findViewById(R.id.city);
        addr2 = (Spinner) findViewById(R.id.downtown);
        data = new String[]{"AAA", "BBB", "CCC"};
        ArrayAdapter adapter =new  ArrayAdapter(this,
                android.R.layout.simple_list_item_1, data);
        addr.setAdapter(adapter);
        addr.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                String[] area = null;
                if (position == 0) {
                    area = new String[]{"cc", "1", "2"};
                    ArrayAdapter adapter2 = new ArrayAdapter(AddrActivity.this,
                       android.R.layout.simple_list_item_1,area);
                    addr2.setAdapter(adapter2);
                }
                if (position == 1) {
                    area = new String[]{"5", "1", "2"};
                    ArrayAdapter adapter2 = new ArrayAdapter(AddrActivity.this,
                            android.R.layout.simple_list_item_1,area);
                    addr2.setAdapter(adapter2);
                }
                if (position == 2) {
                    area = new String[]{"6", "1", "2"};
                    ArrayAdapter adapter2 = new ArrayAdapter(AddrActivity.this,
                            android.R.layout.simple_list_item_1,area);
                    addr2.setAdapter(adapter2);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    public void addr(View view){

    }
}
