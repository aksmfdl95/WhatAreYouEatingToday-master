package com.hnsky.whatareyoueatingtoday;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BordItemActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bord_item);
    }

    public void clickOk(View v){
        DialogShow();

    }

    public void clickBack(View v){
        //게시물 추가 액티비티 종료
        BordItemActivity.this.finish();
    }

   public void DialogShow(){
       AlertDialog.Builder builder = new AlertDialog.Builder(this);
        //제목 셋팅
        builder.setTitle("게시물 추가");

        //다이얼 로그 셋팅
        builder.setMessage("게시물을 추가하시겠습니까?");
        builder.setCancelable(false);
        builder.setPositiveButton("추가", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //게시물 추가
            }
        });

        builder.setNegativeButton("취소", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //다이얼로그를 종료한다.
                dialog.cancel();

            }
        });

        //다이얼로그 생성
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

}
