package com.iris.atm;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class UserInfoActivity extends AppCompatActivity {

    private static final String TAG = Ch8Activity.class.getSimpleName();
    private EditText nickName;
    private EditText userph;
    private Spinner ages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);

        ages = (Spinner)findViewById(R.id.ages);
        ArrayList<String> data = new ArrayList<>();
        for (int i =15;i <= 40;i++){
            data.add(i+"");
        }
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.age, android.R.layout.simple_list_item_1);
        ages.setAdapter(adapter);



        nickName = (EditText) findViewById(R.id.ednickname);
        userph = (EditText) findViewById(R.id.phone);
        String nickna = getSharedPreferences("atm" ,MODE_PRIVATE)
                .getString("EXTRA_NICKNAME"," ");
       nickName.setText(nickna);
        String phone = getSharedPreferences("atm" ,MODE_PRIVATE)
                .getString("EXTRA_PHONE" ," ");
        userph.setText(phone);

    }
    public void ok(View view) {
        Log.d(TAG,"ok : " + ages.getSelectedItem().toString());
        int age =Integer.parseInt(ages.getSelectedItem().toString());
        String nickname = nickName.getText().toString();
        String userphone = userph.getText().toString();
        getIntent().putExtra("EXTRA_NICKNAME",nickname);
        getIntent().putExtra("EXTRA_PHONE",userphone);
        setResult(RESULT_OK,getIntent());
        finish();

    }
public void addr(View view){
    startActivity(new Intent(this,CityActivity.class));
    //startActivity(new Intent(this,AddrActivity.class));
}
}
