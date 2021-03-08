package com.example.exam_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ThirdActivity extends AppCompatActivity {
    private Bitmap image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third);
        
        //인텐트 받아오기
        Intent moveINT = getIntent();
        byte[] arr = getIntent().getByteArrayExtra("image");
        
        //Bitmap 이미지 출력
        image = BitmapFactory.decodeByteArray(arr, 0, arr.length);
        // imageview ui 요소 연결
        ImageView iv = findViewById(R.id.imageView1);
        // image 출력
        iv.setImageBitmap(image);

    }
    //클릭 이벤트
    public void onClick(View v){
        // 현재 Activity  종료
        finish();
    }
}