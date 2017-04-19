package com.example.wangjie.Page1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.wangjie.R;


public class MyFragment1 extends Fragment  {
    public MyFragment1() {
    }
    private Button btn_self_evaluate;
    private Button btn_others_evaluate;
    private Button btn_look_evaluate;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_1_pingjia_main, container, false);
        Log.e("HEHE", "第一个页面");
        btn_self_evaluate = (Button)view.findViewById(R.id.self_evaluate);
        btn_others_evaluate = (Button)view.findViewById(R.id.others_evaluate);
        btn_look_evaluate = (Button)view.findViewById(R.id.look_evaluate);
        btn_self_evaluate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getActivity(), self_EvaluationActivity.class);
                startActivity(intent);
            }
        });
        btn_others_evaluate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),others_EvaluationActivity.class);
                startActivity(intent);
            }
        });
        btn_look_evaluate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),look_evaluationActivity.class);
                //intent.setClass(getActivity(),Award.class);
                startActivity(intent);
            }
    });
        return view;

}
}

