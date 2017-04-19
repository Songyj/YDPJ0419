package com.example.wangjie.Public;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.wangjie.R;

public class SucceedActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1_succeed);
        Button resub = (Button)findViewById(R.id.Btn_resub);
        ImageButton back = (ImageButton)findViewById(R.id.Btn_back);
        resub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(SucceedActivity.this,MainActivity.class);
                startActivity(intent);
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
