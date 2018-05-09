package com.hnsky.whatareyoueatingtoday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class DinnerActivity extends AppCompatActivity {

    ImageView iv;
    Random rnd= new Random();
    int count = rnd.nextInt(5);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinner);
        iv=findViewById(R.id.iv_food);
        iv.setImageResource(R.drawable.dinner_food_01+count);
    }

    public void clickThis(View v){
        Intent intent= new Intent(this,MapActivity.class);
        startActivity(intent);


    }

    public void clickChange(View v){
        //클릭하면 랜덤한 음식이미지로 바꾼다.
        //이미지 배열에 이미지들을 저장하고 클릭할때마다 랜덤하게 이미지를 바꾼다.

        Random rnd= new Random();
        int count = rnd.nextInt(5);
        iv.setImageResource(R.drawable.dinner_food_01+count);
    }

    public void clickBord(View v){
        Intent intent= new Intent(this,BordActivity.class);
        startActivity(intent);
    }
}
