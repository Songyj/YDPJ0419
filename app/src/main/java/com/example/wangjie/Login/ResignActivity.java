package com.example.wangjie.Login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.wangjie.R;
import com.example.wangjie.Public.MainActivity;



public class ResignActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_0_resign);


    Button resign_login = (Button)findViewById(R.id.resign_login);
    resign_login.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(ResignActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }
    });
}
 }
