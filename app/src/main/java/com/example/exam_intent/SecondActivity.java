package com.example.exam_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TableLayout;

import java.io.ByteArrayOutputStream;

public class SecondActivity extends AppCompatActivity {
    private String TAG = "Seco_Act";
    Bitmap sendBitmap;
    TableLayout tableLayout;
    ImageView iv;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        Log.i(TAG, "Create Second Activity");
        //imageView = (ImageView)findViewById(R.id.imageView);

        //tableLayout = (TableLayout) tableLayout.findViewById(R.id.secondLAY);
    }

    public void ImageClick(View v){
        //Intent 생성
        Intent moveINT = new Intent(SecondActivity.this, ThirdActivity.class);
        int clickValue = v.getId();
        switch (clickValue){
            case R.id.imageView1:
                //moveINT.putExtra("idTxt","imageView1");
                sendBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.brush);
                break;
            case R.id.imageView2:
                //moveINT.putExtra("idTxt","imageView2");
                sendBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.frameillust);
                break;
            case R.id.imageView3:
                //moveINT.putExtra("idTxt","imageView3");
                sendBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.image3);
                break;
            case R.id.imageView4:
                //moveINT.putExtra("idTxt","imageView4");
                sendBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.image4);
                break;
            case R.id.imageView5:
                //moveINT.putExtra("idTxt","imageView5");
                sendBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.image5);
                break;
            case R.id.imageView6:
                //moveINT.putExtra("idTxt","imageView6");
                sendBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.moon);
                break;
            case R.id.imageView7:
                //moveINT.putExtra("idTxt","imageView7");
                sendBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.sky_prism);
                break;
            case R.id.imageView8:
                //moveINT.putExtra("idTxt","imageView8");
                sendBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.rosesmall);
                break;
            case R.id.imageView9:
                //moveINT.putExtra("idTxt","imageView9");
                sendBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.image9);
                break;
            case R.id.imageView10:
                //moveINT.putExtra("idTxt","imageView10");
                sendBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.image10);
                break;
        }

        //putExtra 파일 크기 100kb이하인데 팅김 현상 발생.. bitmap으로 변형해서 넘김
        //Bitmap sendBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.brush);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        sendBitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
        byte[] byteArray = stream.toByteArray();
        moveINT.putExtra("image",byteArray);

        //Activity 이동
        startActivity(moveINT);

        Log.e("ID", String.valueOf(v.getId()));

    }
}