package com.hnsky.whatareyoueatingtoday;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

import de.hdodenhof.circleimageview.CircleImageView;

public class BreakfastActivity extends AppCompatActivity {

    CircleImageView iv;
    Random rnd= new Random();
    int count = rnd.nextInt(9);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast);
        iv=findViewById(R.id.iv_food);

        iv.setImageResource(R.drawable.food_01+count);

    }

    public void clickThis(View v){
        Intent intent= new Intent(this,MapActivity.class);
        startActivity(intent);
    }

    public void clickChange(View v){
        //클릭하면 랜덤한 음식이미지로 바꾼다.
        Random rnd= new Random();
        int count = rnd.nextInt(9);
      iv.setImageResource(R.drawable.food_01+count);
    }

    public void clickBord(View v){
        Intent intent= new Intent(this,BordActivity.class);
        startActivity(intent);
    }
}
