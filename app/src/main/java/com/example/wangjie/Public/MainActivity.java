package com.example.wangjie.Public;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.wangjie.Page2.MyFragment2;
import com.example.wangjie.R;


public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener,
        ViewPager.OnPageChangeListener {

    //UI Objects
    private TextView txt_topbar;
    private RadioGroup rg_tab_bar;
    private RadioButton rb_channel;
    private RadioButton rb_message;
    private RadioButton rb_better;
    private RadioButton rb_setting;
    private ViewPager vpager;
    private RadioButton[] rbs;
    private Drawable[] drs;

    private MyFragmentPagerAdapter mAdapter;

    //几个代表页面的常量
    public static final int PAGE_ONE = 0;
    public static final int PAGE_TWO = 1;
    public static final int PAGE_THREE = 2;
    public static final int PAGE_FOUR = 3;

    public int id;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1_main);
        mAdapter = new MyFragmentPagerAdapter(getSupportFragmentManager(),(Context)this);
        bindViews();
        rb_channel.setChecked(true);
        int id = getIntent().getIntExtra("id", 0);
        if (id == 1) {
            getSupportFragmentManager().beginTransaction().replace(R.id.vpager,new MyFragment2()).addToBackStack(null).commit();

            //MyFragment2.setvisible(ture);
        }
    }

    private void bindViews() {
        rg_tab_bar = (RadioGroup) findViewById(R.id.rg_tab_bar);
        rb_channel = (RadioButton) findViewById(R.id.rb_channel);
        rb_message = (RadioButton) findViewById(R.id.rb_message);
        rb_better = (RadioButton) findViewById(R.id.rb_better);
        rb_setting = (RadioButton) findViewById(R.id.rb_setting);
        rg_tab_bar.setOnCheckedChangeListener(this);

        rbs = new RadioButton[4];
        drs = new Drawable[4];
//初始化控件，中间大个的，周围小弟
        rbs[0] = rb_channel;
        rbs[1] = rb_message;
        rbs[2] = rb_better;
        rbs[3] = rb_setting;

        for (RadioButton rb : rbs) {
            //挨着给每个RadioButton加入drawable限制边距以控制显示大小
            drs = rb.getCompoundDrawables();
            //获取drawables
            Rect r = new Rect(0, 0, drs[1].getMinimumWidth()/4, drs[1].getMinimumHeight()/4);
            //定义一个Rect边界
            drs[1].setBounds(r);
            //给drawable设置边界
//            if (rb.getId() == R.id.rb_m) {
//                r = new Rect(0, 0, drs[1].getMinimumWidth(), drs[1].getMinimumHeight());
//                drs[1].setBounds(r);
//            }

            rb.setCompoundDrawables(null,drs[1],null,null);
            //添加限制给控件
        }

        vpager = (ViewPager) findViewById(R.id.vpager);
        vpager.setAdapter(mAdapter);
        vpager.setCurrentItem(0);
        vpager.addOnPageChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId) {
            case R.id.rb_channel:
                vpager.setCurrentItem(PAGE_ONE);
                break;
            case R.id.rb_message:
                vpager.setCurrentItem(PAGE_TWO);
                break;
            case R.id.rb_better:
                vpager.setCurrentItem(PAGE_THREE);
                break;
            case R.id.rb_setting:
                vpager.setCurrentItem(PAGE_FOUR);
                break;
        }
    }


    //重写ViewPager页面切换的处理方法
    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    }

    @Override
    public void onPageSelected(int position) {
    }

    @Override
    public void onPageScrollStateChanged(int state) {
        //state的状态有三个，0表示什么都没做，1正在滑动，2滑动完毕
        if (state == 2) {
            switch (vpager.getCurrentItem()) {
                case PAGE_ONE:
                    rb_channel.setChecked(true);
                    break;
                case PAGE_TWO:
                    rb_message.setChecked(true);
                    break;
                case PAGE_THREE:
                    rb_better.setChecked(true);
                    break;
                case PAGE_FOUR:
                    rb_setting.setChecked(true);
                    break;
            }
        }
    }
}
