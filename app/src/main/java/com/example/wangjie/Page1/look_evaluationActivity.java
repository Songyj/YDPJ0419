package com.example.wangjie.Page1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;

import com.example.wangjie.Page4.MesAdapter;
import com.example.wangjie.Page4.MyItemDecoration;
import com.example.wangjie.Public.MainActivity;
import com.example.wangjie.R;

import java.util.ArrayList;
import java.util.List;

public class look_evaluationActivity extends AppCompatActivity {
    private Context mContext;
        private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1_look_evaluation);
        mContext = look_evaluationActivity.this;
        ImageButton backhome = (ImageButton)findViewById(R.id.backhome);
        backhome.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(look_evaluationActivity.this, MainActivity.class);
                startActivity(intent);}
        });
        initMes();
    }
    private void initMes() {
        recyclerView = (RecyclerView) findViewById(R.id.look_recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        List<String> titleset = new ArrayList<String>();
        for (int i = 0; i < 20; i++){
            titleset.add("Title"+(i+1));
        }

        List<String> messet = new ArrayList<String>();
        for (int i = 0; i < 20; i++){
            messet.add("Message"+(i+1));
        }


        List<String> timeset = new ArrayList<String>();
        for (int i = 0; i < 20; i++){
            timeset.add("XXXX年XX月"+(i+1)+"日");
        }

        MesAdapter mesadapter = new MesAdapter(look_evaluationActivity.this,titleset,messet,timeset);
        recyclerView.addItemDecoration(new MyItemDecoration(this));
        recyclerView.setAdapter(mesadapter);
    }
}
