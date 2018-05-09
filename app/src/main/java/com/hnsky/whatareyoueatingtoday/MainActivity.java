package com.hnsky.whatareyoueatingtoday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView iv_bf;
    ImageView iv_lc;
    ImageView iv_dn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void clickBreak(View v){
        Intent intent= new Intent(this,BreakfastActivity.class);
        startActivity(intent);
    }

    public void clickLunch(View v){
        Intent intent= new Intent(this,LunchActivity.class);
        startActivity(intent);
    }

    public void clickDinner(View v){
        Intent intent= new Intent(this, DinnerActivity.class);
        startActivity(intent);
    }
}
