package com.iris.atm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class UserInfoActivity extends AppCompatActivity {

    private EditText nickName;
    private EditText userph;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
        nickName = (EditText) findViewById(R.id.ednickname);
        userph = (EditText) findViewById(R.id.phone);
        String nickna = getSharedPreferences("atm" ,MODE_PRIVATE)
                .getString("EXTRA_NICKNAME"," ");
       nickName.setText(nickna);
        String phone = getSharedPreferences("atm" ,MODE_PRIVATE)
                .getString("EXTRE_PHONE" ," ");
        userph.setText(phone);
    }
    public void ok(View view) {

        String nickname = nickName.getText().toString();
        String userphone = userph.getText().toString();
        getIntent().putExtra("EXTRE_NICKNAME",nickname);
        getIntent().putExtra("EXTRE_PHONE",userphone);
        setResult(RESULT_OK,getIntent());
        finish();

    }
}
