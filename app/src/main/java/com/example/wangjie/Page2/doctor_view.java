package com.example.wangjie.Page2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.example.wangjie.Page4.BorderTextView1;
import com.example.wangjie.Page4.CircleImageView;
import com.example.wangjie.R;

public class doctor_view extends AppCompatActivity {
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
    }



}
