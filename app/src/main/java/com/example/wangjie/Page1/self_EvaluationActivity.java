package com.example.wangjie.Page1;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import com.example.wangjie.Page4.BorderTextView1;
import com.example.wangjie.Page4.CircleImageView;
import com.example.wangjie.Page4.MyItemDecoration;
import com.example.wangjie.Public.MainActivity;
import com.example.wangjie.R;
import com.example.wangjie.Test.Fruit;
import com.example.wangjie.Test.FruitAdapter;

import java.util.ArrayList;
import java.util.List;
public class self_EvaluationActivity extends AppCompatActivity {
    private List<Fruit> fruitList = new ArrayList<Fruit>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1_self__evaluation);
        CircleImageView circleImageView = (CircleImageView) this.findViewById(R.id.eva_circleview);
        circleImageView.setImageResource(R.drawable.user);
        TextView doc_name = (TextView)findViewById(R.id.eva_award_name);
        doc_name.setText("张医生");
        BorderTextView1 doc_department = (BorderTextView1)findViewById(R.id.eva_award_department);
        doc_department.setText("消化道科");
        TextView doc_post = (TextView)findViewById(R.id.eva_award_post);
        doc_post.setText("主治医师");
        initFruits();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.eva_recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        FruitAdapter adapter = new FruitAdapter(fruitList);
        recyclerView.addItemDecoration(new MyItemDecoration(this));
        recyclerView.setAdapter(adapter);
        Button commit = (Button)findViewById(R.id.eva_commit);
        ImageButton cancel = (ImageButton)findViewById(R.id.eva_Btn_backhome);
        commit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                new DoubleCheck1().show(getSupportFragmentManager(),"activity_p_doublecheck1");
            }
        });
        ImageButton back = (ImageButton)findViewById(R.id.eva_Btn_backhome);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(self_EvaluationActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
    private void initFruits() {
        for (int i = 0; i <20 ; i++) {
            Fruit apple = new Fruit(("评价项目：")+(i+1), R.drawable.apple_pic);
            fruitList.add(apple);
        }
    }



}