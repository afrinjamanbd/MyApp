package com.example.maila.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Signup extends AppCompatActivity {

    private EditText signupusername,signuserid,signupemail,signuppass,signupconpass,signupphonnum;
    private Button signup;
    private TextView signuptologin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        signupusername= (EditText) findViewById(R.id.signupusername);
        signuserid = (EditText) findViewById(R.id.signupuserId);
        signupemail= (EditText) findViewById(R.id.signupemail);
        signuppass = (EditText) findViewById(R.id.signuppassword);
        signupconpass = (EditText) findViewById(R.id.signupconformpass);
        signupphonnum = (EditText) findViewById(R.id.signupphoneNum);
        signup = (Button) findViewById(R.id.signUp);
        signuptologin = (TextView) findViewById(R.id.signuptologin);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signuptonav = new Intent(Signup.this,nav.class);
                startActivity(signuptonav);
            }
        });
    }
}
