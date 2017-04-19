package com.example.wangjie.Page4;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.wangjie.R;

import java.util.List;

/**
 * Created by songyanjun on 2017/3/22.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private Context mContext;
    private List<String> mDatas;
    private LayoutInflater inflater;

    public MyAdapter(Context contexts, List<String> datas){

        this.mContext = contexts;
        this.mDatas = datas;
        inflater= LayoutInflater.from(mContext);
    }

    @Override
    public int getItemCount() {
        // TODO Auto-generated method stub
        return mDatas.size();
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

        holder.text.setText( mDatas.get(position));
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.item_comment,parent,false);
        MyViewHolder holder=new MyViewHolder(view);
        return holder;
    }

    class MyViewHolder extends ViewHolder {

        TextView time;
        TextView text;

        public MyViewHolder(View view) {
            super(view);
            time = (TextView) view.findViewById(R.id.item_time);
            text = (TextView) view.findViewById(R.id.item_text);
        }

    }

//    public void addData(int position) {
//        mDatas.add(position, "Insert item");
//        notifyItemInserted(position);
//        notifyItemRangeChanged(position,mDatas.size());
//    }
//
//    public void removeData(int position) {
//        mDatas.remove(position);
//        notifyDataSetChanged();
//        notifyItemRemoved(position);
//        notifyItemRangeChanged(position,mDatas.size());
//    }
}
