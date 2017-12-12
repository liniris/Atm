package com.iris.atm;

import android.os.StrictMode;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
    }
    public void login(View view){
        EditText edUserid = (EditText) findViewById(R.id.userid);
        EditText edPasswd = (EditText) findViewById(R.id.passwd);
        String userid = edUserid.getText().toString();
        String passwd = edPasswd.getText().toString();
        if("iris".equals(userid) && "1234".equals(passwd)){
            Toast.makeText(this,"登入成功",Toast.LENGTH_LONG).show();
            getIntent().putExtra("EXRA_USERID",userid);
            setResult(RESULT_OK,getIntent());

//            getIntent().putExtra("LOGIN_USERID", userid);
//            getIntent().putExtra("LOGIN_PASSWD", passwd);
//            setResult(RESULT_OK, getIntent());
            finish();
        }else {
            new AlertDialog.Builder(this)
                    .setMessage("登入失敗" )
                    .setTitle("Atm")
                    .setPositiveButton("Ok",null)
                    .show();
        }
    }
    public void cancel(View view){

    }
}
