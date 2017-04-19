package com.example.wangjie.Page2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

import com.example.wangjie.R;

import java.util.ArrayList;

import static android.content.ContentValues.TAG;

public class MyFragment2 extends Fragment {
    private Context mContext;
    private GridView grid_photo;
    private BaseAdapter mAdapter = null;
    private ArrayList<Icon> mData = null;


    public MyFragment2() {
    }
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d(TAG, "onAttach: ");
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_2_main,container,false);
        TextView txt_content = (TextView)view.findViewById(R.id.txt_content);
        mContext = getActivity();
        grid_photo = (GridView)view.findViewById(R.id.grid_photo);
        mData = new ArrayList<Icon>();
        for(int i=1;i<2;i++) {
            mData.add(new Icon(R.mipmap.hos001, "中医"));
            mData.add(new Icon(R.mipmap.hos002, "药房"));
            mData.add(new Icon(R.mipmap.hos003, "眼科"));
            mData.add(new Icon(R.mipmap.hos004,"牙科"));
            mData.add(new Icon(R.mipmap.hos005, "心胸科"));
            mData.add(new Icon(R.mipmap.hos006, "外科"));
            mData.add(new Icon(R.mipmap.hos007, "收费处"));
            mData.add(new Icon(R.mipmap.hos008, "皮肤科"));
            mData.add(new Icon(R.mipmap.hos009, "内科"));
            mData.add(new Icon(R.mipmap.hos010, "呼吸道科"));
            mData.add(new Icon(R.mipmap.hos011, "妇产科"));
            mData.add(new Icon(R.mipmap.hos012, "儿科"));
            mData.add(new Icon(R.mipmap.hos013, "妇科"));
            mData.add(new Icon(R.mipmap.hos014,"泌尿科"));
            mData.add(new Icon(R.mipmap.hos015, "内科"));
            mData.add(new Icon(R.mipmap.hos016, "收费处"));
            mData.add(new Icon(R.mipmap.hos017, "五官科"));
            mData.add(new Icon(R.mipmap.hos018, "外科"));

        }
        mAdapter = new MyAdapter<Icon>(mData, R.layout.item_grid_icon) {
            @Override
            public void bindView(ViewHolder holder, Icon obj) {
                holder.setImageResource(R.id.img_icon, obj.getiId());
                holder.setText(R.id.txt_icon, obj.getiName());
            }
        };


        grid_photo.setAdapter(mAdapter);

        grid_photo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(getContext(), Doctor_select.class);
                startActivity(intent);
            }
        });
        return view;
}
}
