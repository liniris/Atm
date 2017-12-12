package com.iris.atm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static com.iris.atm.R.id.username;

public class UserInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
    }
    public void login(View view) {
        EditText userna = (EditText) findViewById(R.id.username);
        EditText userph = (EditText) findViewById(R.id.userph);
        String username = userna.getText().toString();
        String userphone = userph.getText().toString();

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("EXTRE_NAME", username);
        intent.putExtra("EXTRE_PHONE", userphone);
        startActivity(intent);

    }
}
