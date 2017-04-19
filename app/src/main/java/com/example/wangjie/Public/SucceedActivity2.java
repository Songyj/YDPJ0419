package com.example.wangjie.Public;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.example.wangjie.R;

/**
 * Created by songyanjun on 2017/4/17.
 */

public class SucceedActivity2 extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1_succeed);
        ImageButton back = (ImageButton)findViewById(R.id.Btn_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent();
//                intent.setClass(SucceedActivity1.this,MainActivity.class);
//                startActivity(intent);
                finish();
            }
        });


    }
}
