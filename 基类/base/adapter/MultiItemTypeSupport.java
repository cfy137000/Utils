package com.lanou.chenfengyao.mirror.base.adapter;
/**
 * Created by ChenFengYao on 16/4/10.
 * 多种布局的接口
 */
public interface MultiItemTypeSupport<T> {
    int getLayoutId(int itemType);

    int getItemViewType(int position, T t);
}