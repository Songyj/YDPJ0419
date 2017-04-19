package com.example.wangjie.Page1;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.wangjie.R;

import java.util.List;

/**
 * Created by songyanjun on 2017/4/11.
 */

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.MesViewHolder>{
private Context mContext;
    private List<String> titleDatas;
private List<String> mDatas;
private List<String> timeDatas;
private LayoutInflater inflater;

public RecycleAdapter(Context contexts, List<String> title, List<String> data, List<String> time){

        this.mContext = contexts;
        this.titleDatas = title;
        this.mDatas = data;
        this.timeDatas = time;
        inflater= LayoutInflater.from(mContext);
        }

@Override
public int getItemCount() {
        // TODO Auto-generated method stub
        return mDatas.size();
        }

@Override
public void onBindViewHolder(RecycleAdapter.MesViewHolder holder, final int position) {

        holder.title.setText(titleDatas.get(position));
        holder.text.setText( mDatas.get(position));
        holder.time.setText(timeDatas.get(position));
        }
@Override
public RecycleAdapter.MesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.item_message,parent,false);
        RecycleAdapter.MesViewHolder holder=new RecycleAdapter.MesViewHolder(view);
        return holder;
        }

class MesViewHolder extends RecyclerView.ViewHolder {

    TextView title;
    TextView text;
    TextView time;

    public MesViewHolder(View view) {
        super(view);
        title = (TextView) view.findViewById(R.id.item_mestitle);
        text = (TextView) view.findViewById(R.id.item_mestext);
        time = (TextView) view.findViewById(R.id.item_mestime);
    }

}

}
