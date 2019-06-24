package com.example.qiaolulu.fangqi;


import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.util.ArrayList;
import java.util.List;

public class SucaiAdapter extends RecyclerView.Adapter<SucaiAdapter.ViewHolder> {
    private Context mContext;
    private List<Sucai> mSucaiList;
    //private List<Integer> height;
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if(mContext == null){
            mContext = viewGroup.getContext();
        }
        View view = LayoutInflater.from(mContext).inflate(R.layout.sucai_item,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Sucai sucai = mSucaiList.get(i);
        viewHolder.sucaiImage.setImageResource(sucai.getImageId());
        Glide.with(mContext).load(sucai.getImageId()).into(viewHolder.sucaiImage);
    }

    @Override
    public int getItemCount() {
        return mSucaiList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        ImageView sucaiImage;
        //TextView workName;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView = (CardView) itemView;
            sucaiImage = itemView.findViewById(R.id.sucai_image);
           /* int width = ((Activity) sucaiImage.getContext()).getWindowManager().getDefaultDisplay().getWidth();
            ViewGroup.LayoutParams params = sucaiImage.getLayoutParams();
            //设置图片的相对于屏幕的宽高比
            params.width = width/2;
            params.height =  (int) (100 + Math.random() * 200) ;
            sucaiImage.setLayoutParams(params);*/
        }
    }
    public SucaiAdapter(List<Sucai> sucaiList){
        mSucaiList = sucaiList;

    }

}








/**
 * Created by WangChang on 2016/4/1.
 */
/*
public class SucaiAdapter extends RecyclerView.Adapter<SucaiAdapter.BaseViewHolder> {
    private ArrayList<String> dataList = new ArrayList<>();
    public void replaceAll(ArrayList<String> list) {
        dataList.clear();
        if (list != null && list.size() > 0) {
            dataList.addAll(list);
        }
        notifyDataSetChanged();
    }
    @Override
    public SucaiAdapter.BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new OneViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.sucai_item, parent, false));
    }
    @Override
    public void onBindViewHolder(SucaiAdapter.BaseViewHolder holder, int position) {
        holder.setData(dataList.get(position));
    }
    @Override
    public int getItemCount() {
        return dataList != null ? dataList.size() : 0;
    }
    public class BaseViewHolder extends RecyclerView.ViewHolder {
        public BaseViewHolder(View itemView) {
            super(itemView);
        }
        void setData(Object data) {
        }
    }
    private class OneViewHolder extends BaseViewHolder {
        private ImageView ivImage;
        public OneViewHolder(View view) {
            super(view);
            ivImage = (ImageView) view.findViewById(R.id.sucai_image);
            int width = ((Activity) ivImage.getContext()).getWindowManager().getDefaultDisplay().getWidth();
            ViewGroup.LayoutParams params = ivImage.getLayoutParams();
            //设置图片的相对于屏幕的宽高比
            params.width = width/2;
            params.height =  (int) (200 + Math.random() * 400) ;
            ivImage.setLayoutParams(params);
        }
        @Override
        void setData(Object data) {
            if (data != null) {
                String text = (String) data;
                Glide.with(itemView.getContext()).load(text).diskCacheStrategy(DiskCacheStrategy.ALL).placeholder(R.mipmap.ic_launcher).crossFade().into(ivImage);
            }
        }
    }
}
*/
