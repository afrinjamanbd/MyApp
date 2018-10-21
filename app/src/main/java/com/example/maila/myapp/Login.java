package com.example.maila.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {
    private EditText loginuserId,loginpassword;
    private Button login;
    private TextView loginregister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginuserId= (EditText) findViewById(R.id.loginuserId);
        loginpassword =(EditText) findViewById(R.id.loginpassword);
        loginregister = (TextView) findViewById(R.id.loginregister);
        login = (Button) findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String loginEmail = loginuserId.getText().toString();
               String loginPass = loginpassword.getText().toString();
                Intent logintonav = new Intent(Login.this,nav.class);
                startActivity(logintonav);
            }
        });

        loginregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent logintosignup = new Intent(Login.this,Signup.class);
                startActivity(logintosignup);
            }
        });

    }


}
