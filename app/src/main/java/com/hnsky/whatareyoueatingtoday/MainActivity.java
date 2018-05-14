package com.hnsky.whatareyoueatingtoday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void clickBtn1(View v){
        Intent intent= new Intent(this,BreakfastActivity.class);
        startActivity(intent);
    }

    public void clickBtn2(View v){
        Intent intent= new Intent(this,LunchActivity.class);
        startActivity(intent);
    }

    public void clickBtn3(View v){
        Intent intent= new Intent(this,DinnerActivity.class);
        startActivity(intent);
    }



}
