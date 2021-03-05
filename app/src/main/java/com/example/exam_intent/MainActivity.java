package com.example.exam_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // XML onClick's Method ----------------------------
    public void move(View v){
        //  화면 클릭(터치)하면 SecondActivity 전환하기
        // (1) Intent 메시지 객체 생성
        Intent moveINT = new Intent(MainActivity.this, SecondActivity.class); //자기 자신의 정보, 이동할 클래스의 정보
        // (2) Intent 전송 ==> startActivity()
        startActivity(moveINT);
    }
}