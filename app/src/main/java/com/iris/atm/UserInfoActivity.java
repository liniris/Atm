package com.iris.atm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class UserInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
    }
    public void login(View view) {
        EditText nickName = (EditText) findViewById(R.id.ednickname);
        EditText userph = (EditText) findViewById(R.id.phone);
        String nickname = nickName.getText().toString();
        String userphone = userph.getText().toString();
        getIntent().putExtra("EXTRE_NICKNAME",nickname);
        getIntent().putExtra("EXTRE_PHONE",userphone);
        setResult(RESULT_OK,getIntent());
        finish();

    }
}
