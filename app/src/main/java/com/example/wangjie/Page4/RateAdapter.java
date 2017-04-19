package com.example.wangjie.Page4;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.example.wangjie.R;
import java.util.List;

/**
 * Created by songyanjun on 2017/3/22.
 */

public class RateAdapter extends RecyclerView.Adapter<RateAdapter.RateViewHolder>{
    private Context mContext;
    private List<String> mDatas;
    private LayoutInflater inflater;
    private int[] array;

    public RateAdapter(Context contexts, List<String> datas, int[] rate){

        this.mContext = contexts;
        this.mDatas = datas;
        this.array = rate;
        inflater= LayoutInflater.from(mContext);
    }

    @Override
    public int getItemCount() {
        // TODO Auto-generated method stub
        return mDatas.size();
    }

    @Override
    public void onBindViewHolder(RateAdapter.RateViewHolder holder, final int position) {

        holder.title.setText( mDatas.get(position));
        holder.bar.setProgress(array[position]);
    }
    @Override
    public RateAdapter.RateViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.item_rate,parent,false);
        RateAdapter.RateViewHolder holder=new RateAdapter.RateViewHolder(view);
        return holder;
    }

    class RateViewHolder extends RecyclerView.ViewHolder {

        TextView title;
        ProgressBar bar;

        public RateViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.rate_title);
            bar = (ProgressBar) view.findViewById(R.id.rate_bar);
        }

    }

}
