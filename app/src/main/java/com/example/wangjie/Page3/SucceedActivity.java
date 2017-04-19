package com.example.wangjie.Page3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.wangjie.Public.MainActivity;
import com.example.wangjie.R;

/**
 * Created by songyanjun on 2017/1/13.
 */

public class SucceedActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_succeed);
        Button resub = (Button)findViewById(R.id.Btn_resub);
        ImageButton back = (ImageButton)findViewById(R.id.Btn_back);
        resub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent();
//                intent.setClass(SucceedActivity.this,MainActivity.class);
//                startActivity(intent);
                finish();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(SucceedActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
