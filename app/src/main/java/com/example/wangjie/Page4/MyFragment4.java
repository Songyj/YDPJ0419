package com.example.wangjie.Page4;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.wangjie.R;

import java.util.ArrayList;
import java.util.List;

import static android.content.ContentValues.TAG;

public class MyFragment4 extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView rateView;
    View view;
    Context context;
    public MyFragment4() {
    }
    public MyFragment4(Context _context) {
        context = _context;
    }
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d(TAG, "onAttach: ");
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_4_main,container,false);

        rateView = (RecyclerView) view.findViewById(R.id.view_rate);
        recyclerView = (RecyclerView) view.findViewById(R.id.view_comment);
        Log.e("HEHE", "第四个页面");
        CircleImageView circleImageView = (CircleImageView) view.findViewById(R.id.circleview);
        circleImageView.setImageResource(R.drawable.user);
        TextView doc_name = (TextView)view.findViewById(R.id.doc_name);
        doc_name.setText("张医生");
        BorderTextView1 doc_department = (BorderTextView1)view.findViewById(R.id.doc_department);
        doc_department.setText("消化道科");
        TextView doc_post = (TextView)view.findViewById(R.id.doc_post);
        doc_post.setText("主治医师");


        TextView doc_award = (TextView)view.findViewById(R.id.doc_award) ;
        doc_award.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getActivity(),Award.class);
                //intent.setClass(getActivity(),Award.class);
                startActivity(intent);}
        });


        ImageButton btn_mes = (ImageButton)view.findViewById(R.id.Btn_massage);
        btn_mes.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getActivity(), GetMes.class);
                //intent.setClass(getContext(), GetMes.class);
                startActivity(intent);}
        });
        initrate();
        initVertical();
        return view;

    }
    private void initrate() {

        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        rateView.setLayoutManager(layoutManager);
        List<String> rateset = new ArrayList<String>();
        for (int i = 0; i < 7; i++){
            rateset.add("Title"+(i+1));
        }
        int[] array=new int[7];
        array[0]=70;
        array[1]=60;
        array[2]=75;
        array[3]=55;
        array[4]=80;
        array[5]=70;
        array[6]=75;
        RateAdapter rateadapter = new RateAdapter(getActivity(), rateset,array);
        rateView.setAdapter(rateadapter);
    }
    private void initVertical() {

        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        // 设置布局管理器
        recyclerView.setLayoutManager(layoutManager);
        // 创建数据集
        List<String> dataset = new ArrayList<String>();
        for (int i = 0; i < 20; i++){
            dataset.add("Comment"+(i+1));
        }
        // 创建Adapter，并指定数据集
        MyAdapter mAdapter = new MyAdapter(getActivity(), dataset);
        // 设置Adapter
        recyclerView.addItemDecoration(new MyItemDecoration(getActivity()));
        recyclerView.setAdapter(mAdapter);
    }
}