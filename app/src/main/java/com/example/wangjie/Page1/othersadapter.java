package com.example.wangjie.Page1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.wangjie.Page4.Award;
import com.example.wangjie.R;

import java.util.List;

/**
 * Created by songyanjun on 2017/4/16.
 */

public class othersadapter extends RecyclerView.Adapter<othersadapter.othersViewHolder> {
    private Context mContext;
    private List<String> mDatas;

    private LayoutInflater inflater;

    public othersadapter(Context contexts, List<String> name){

        this.mContext = contexts;
        this.mDatas = name;
        inflater= LayoutInflater.from(mContext);
    }

    @Override
    public int getItemCount() {
        // TODO Auto-generated method stub
        return mDatas.size();
    }

    @Override
    public void onBindViewHolder(othersadapter.othersViewHolder holder, final int position) {

        holder.name.setText( mDatas.get(position));
        holder.img.setImageResource(R.drawable.homepage);
    }
    @Override
    public othersadapter.othersViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.activity_1_others_item,parent,false);
        final othersadapter.othersViewHolder holder=new othersadapter.othersViewHolder(view);
        return holder;
    }

    class othersViewHolder extends RecyclerView.ViewHolder {

        TextView name;
        ImageView img;

        public othersViewHolder(View view) {
            super(view);
            img = (ImageView) view.findViewById(R.id.otherdoc_image);
            name = (TextView) view.findViewById(R.id.otherdoc_name);
            name.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext,Award.class);
                    //startActivity(intent);
                }
            });

        }

    }

}
