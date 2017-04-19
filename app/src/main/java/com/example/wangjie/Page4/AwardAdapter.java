package com.example.wangjie.Page4;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.wangjie.R;
import java.util.List;
/**
 * Created by songyanjun on 2017/4/10.
 */

public class AwardAdapter extends RecyclerView.Adapter<AwardAdapter.AwardViewHolder>{
    private Context mContext;
    private List<String> mDatas;
    private List<String> aDatas;
    private List<String> timeDatas;
    private LayoutInflater inflater;

    public AwardAdapter(Context contexts, List<String> data,List<String> adata, List<String> time){

        this.mContext = contexts;
        this.mDatas = data;
        this.aDatas = adata;
        this.timeDatas = time;
        inflater= LayoutInflater.from(mContext);
    }

    @Override
    public int getItemCount() {
        // TODO Auto-generated method stub
        return mDatas.size();
    }

    @Override
    public void onBindViewHolder(AwardAdapter.AwardViewHolder holder, final int position) {

        holder.type.setText( mDatas.get(position));
        holder.context.setText( aDatas.get(position));
        holder.time.setText(timeDatas.get(position));
        holder.img.setImageResource(R.drawable.img);
    }
    @Override
    public AwardAdapter.AwardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.item_award,parent,false);
        AwardAdapter.AwardViewHolder holder=new AwardAdapter.AwardViewHolder(view);
        return holder;
    }

    class AwardViewHolder extends RecyclerView.ViewHolder {

        TextView type;
        TextView context;
        TextView time;
        ImageView img;

        public AwardViewHolder(View view) {
            super(view);
            img = (ImageView) view.findViewById(R.id.award_img);
            type = (TextView) view.findViewById(R.id.award_type);
            context = (TextView) view.findViewById(R.id.award_context);
            time = (TextView) view.findViewById(R.id.award_time);
        }

    }

}
