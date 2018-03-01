package com.example.zver.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class UserInfoActivity extends AppCompatActivity {

    TextView textView;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
        textView=findViewById(R.id.userInfo);

        intent=getIntent();
        String temp_string=intent.getStringExtra("nick");
        textView.setText(temp_string);

    }
}
