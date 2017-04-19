package com.example.wangjie.Page4;

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

/**
 * Created by songyanjun on 2017/3/28.
 */
public class Award extends AppCompatActivity {
   RecyclerView recyclerView_award;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4_award);
        CircleImageView circleImageView = (CircleImageView) this.findViewById(R.id.circleview);
        circleImageView.setImageResource(R.drawable.user);
        TextView doc_name = (TextView)findViewById(R.id.award_name);
        doc_name.setText("张医生");
        BorderTextView1 doc_department = (BorderTextView1)findViewById(R.id.award_department);
        doc_department.setText("消化道科");
        TextView doc_post = (TextView)findViewById(R.id.award_post);
        doc_post.setText("主治医师");
        initAward();
        ImageButton back = (ImageButton)findViewById(R.id.Btn_backhome);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent();
//                intent.setClass(Award.this,MyFragment4.class);
//                startActivity(intent);
                finish();
            }
        });

    }
    private void initAward() {
        recyclerView_award = (RecyclerView) findViewById(R.id.view_award);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView_award.setLayoutManager(layoutManager);

        List<String> typeset = new ArrayList<String>();
        for (int i = 0; i < 20; i++){
            typeset.add("Type"+(i+1));
        }

        List<String> awardset = new ArrayList<String>();
        for (int i = 0; i < 20; i++){
            awardset.add("Award"+(i+1));
        }

        List<String> timeset = new ArrayList<String>();
        for (int i = 0; i < 20; i++){
            timeset.add("XXXX年XX月"+(i+1)+"日");
        }

        AwardAdapter awardadapter = new AwardAdapter(Award.this,typeset,awardset,timeset);
        recyclerView_award.addItemDecoration(new MyItemDecoration(this));
        recyclerView_award.setAdapter(awardadapter);
    }
}
