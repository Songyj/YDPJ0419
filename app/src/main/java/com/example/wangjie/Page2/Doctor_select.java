package com.example.wangjie.Page2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;

import com.example.wangjie.Page1.App;
import com.example.wangjie.Page1.Book;
import com.example.wangjie.Page1.MyAdapter;
import com.example.wangjie.R;

import java.util.ArrayList;
import java.util.List;

public class Doctor_select extends AppCompatActivity {
    private RecyclerView recyclerView_others;

    private Context mContext;
   // private ListView list_book;
    private ListView list_app;

    private MyAdapter<App> myAdapter1 = null;
    private MyAdapter<Book> myAdapter2 = null;
    private List<App> mData1 = null;
    //private List<Book> mData2 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2_doctorselect);
        mContext = Doctor_select.this;

//        ImageButton back2 = (ImageButton)findViewById(R.id.Btn_back2);
//        back2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent();
//                intent.setClass(Doctor_select.this,MyFragment2.class);
//                startActivity(intent);
//            }
//        });
        ImageButton back = (ImageButton)findViewById(R.id.back2);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                Intent intent = new Intent();
//                intent.setClass(GetMes.this,MyFragment4.class);
//                startActivity(intent);
                        finish();

            }
        });
        init();



    }

    private void init() {
//
//        recyclerView_others = (RecyclerView) findViewById(R.id.view_docs);
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
//        recyclerView_others.setLayoutManager(layoutManager);
//        List<String> typeset = new ArrayList<String>();
//        for (int i = 0; i < 20; i++){
//            typeset.add("医生"+(i+1));
//        }
//        othersadapter others = new othersadapter(Doctor_select.this,typeset);
//        recyclerView_others.addItemDecoration(new MyItemDecoration(this));
//        recyclerView_others.setAdapter(others);
        list_app = (ListView) findViewById(R.id.list_app);
        //数据初始化
        mData1 = new ArrayList<App>();
        for(int i=1;i<20;i++) {
            mData1.add(new App(R.drawable.user1, "医生"+i));
        }
        //Adapter初始化
        myAdapter1 = new MyAdapter<App>((ArrayList)mData1,R.layout.item_one) {
            @Override
            public void bindView(ViewHolder holder, App obj) {
                holder.setImageResource(R.id.img_icon,obj.getaIcon());
                holder.setText(R.id.txt_aname,obj.getaName());
            }
        };
        list_app.setAdapter(myAdapter1);
        list_app.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), doctor_view.class);
                startActivity(intent);
            }
        });
    }
}