package com.hnsky.whatareyoueatingtoday;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class IntroActivity extends AppCompatActivity {

    private Animation alphaAni;
    ImageView iv_applogo;
    ImageView iv_comlogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        iv_applogo=findViewById(R.id.iv_applogo);
        iv_comlogo=findViewById(R.id.iv_comlogo);
      //alphaAni= AnimationUtils.loadAnimation(this,R.anim.alpha);

        Animation ani01 = new AlphaAnimation(0.0f,1.0f);
        ani01.setDuration(5000);

        //iv_applogo.startActionMode((ActionMode.Callback) alphaAni);
        iv_applogo.setAnimation(ani01);

        //액션바 숨기기
        ActionBar actionBar= getSupportActionBar();
        actionBar.hide();

        //2.5초후 인트로 화면 끝내기
        Handler handler= new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent= new Intent(IntroActivity.this,MainActivity.class);
                startActivity(intent);

                finish();
            }
        },2500);
    }
}
