package com.example.wangjie.Page4;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import com.example.wangjie.R;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView rateView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4_main);

        CircleImageView circleImageView = (CircleImageView) this.findViewById(R.id.circleview);
        circleImageView.setImageResource(R.drawable.user);
        TextView doc_name = (TextView)findViewById(R.id.doc_name);
        doc_name.setText("张医生");
        BorderTextView1 doc_department = (BorderTextView1)findViewById(R.id.doc_department);
        doc_department.setText("消化道科");
        TextView doc_post = (TextView)findViewById(R.id.doc_post);
        doc_post.setText("主治医师");
        TextView doc_award = (TextView)findViewById(R.id.doc_award) ;
        doc_award.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,Award.class);
                startActivity(intent);}
        });
        ImageButton btn_mes = (ImageButton)findViewById(R.id.Btn_massage);
        btn_mes.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, GetMes.class);
                startActivity(intent);}
        });
        initrate();
        initVertical();
    }


    private void initrate() {
        rateView = (RecyclerView) findViewById(R.id.view_rate);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
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
        RateAdapter rateadapter = new RateAdapter(MainActivity.this, rateset,array);
        rateView.setAdapter(rateadapter);
    }
    private void initVertical() {
        recyclerView = (RecyclerView) findViewById(R.id.view_comment);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        // 设置布局管理器
        recyclerView.setLayoutManager(layoutManager);
        // 创建数据集
        List<String> dataset = new ArrayList<String>();
        for (int i = 0; i < 20; i++){
            dataset.add("Comment"+(i+1));
        }
        // 创建Adapter，并指定数据集
        MyAdapter mAdapter = new MyAdapter(MainActivity.this, dataset);
        // 设置Adapter
        recyclerView.addItemDecoration(new MyItemDecoration(this));
        recyclerView.setAdapter(mAdapter);
    }
}
