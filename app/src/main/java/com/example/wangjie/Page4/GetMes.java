package com.example.wangjie.Page4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;

import com.example.wangjie.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by songyanjun on 2017/4/11.
 */

public class GetMes extends AppCompatActivity {
    RecyclerView recyclerView_mes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4_message);
        ImageButton Btn_back = (ImageButton)findViewById(R.id.Btn_back2);
        Btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent();
//                intent.setClass(GetMes.this,MyFragment4.class);
//                startActivity(intent);
                finish();
            }
        });
        initMes();

    }

    private void initMes() {
        recyclerView_mes = (RecyclerView) findViewById(R.id.view_massage);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView_mes.setLayoutManager(layoutManager);
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
        MesAdapter mesadapter = new MesAdapter(GetMes.this,titleset,messet,timeset);
        recyclerView_mes.addItemDecoration(new MyItemDecoration(this));
        recyclerView_mes.setAdapter(mesadapter);
    }





}
