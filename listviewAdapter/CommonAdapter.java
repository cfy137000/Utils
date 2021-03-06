package com.lanou.chenfengyao.adapterdemo.utils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.lanou.chenfengyao.adapterdemo.R;

import java.util.List;

/**
 * Created by ChenFengYao on 16/1/11.
 */
public abstract class CommonAdapter<T> extends BaseAdapter {
    protected Context mContext;
    protected List<T> mDatas;
    protected LayoutInflater inflater;
    private int itemLayoutId;

    public CommonAdapter(Context mContext, List<T> mDatas, int itemLayoutId) {
        this.mContext = mContext;
        this.mDatas = mDatas;
        this.itemLayoutId = itemLayoutId;
        inflater = LayoutInflater.from(mContext);
    }


    @Override
    public int getCount() {
        return mDatas != null ? mDatas.size() : 0;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public T getItem(int position) {
        return mDatas.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder = ViewHolder.get(mContext, convertView, parent, itemLayoutId, position);
        convert(holder, getItem(position));
        return holder.getmConvertView();
    }

    //交给子类去添加数据
    public abstract void convert(ViewHolder holder, T t);


}
