package com.example.exam_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
    }

    public void onClick(View v){
        Intent moveINT = new Intent(SecondActivity.this, ThirdActivity.class); //계속하면 화면이 쌓임.
        startActivity(moveINT);
        // 현재 Activity  종료
        // finish();
    }
}