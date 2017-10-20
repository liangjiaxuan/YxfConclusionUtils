package com.rongwei.yxfconclusionutils.commonadapter.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;


import com.rongwei.yxfconclusionutils.commonadapter.recyclerview.base.ItemViewDelegate;
import com.rongwei.yxfconclusionutils.commonadapter.recyclerview.base.ViewHolder;

import java.util.List;

/**
 * Created by zhy on 16/4/9.
 */
public abstract class RecyclerViewCommonAdapter<T> extends MultiItemTypeAdapter<T>
{
    protected Context mContext;
    protected int mLayoutId;
    protected List<T> mDatas;
    protected LayoutInflater mInflater;

    public RecyclerViewCommonAdapter(final Context context, final int layoutId, List<T> datas)
    {
        super(context, datas);
        mContext = context;
        mInflater = LayoutInflater.from(context);
        mLayoutId = layoutId;
        mDatas = datas;

        addItemViewDelegate(new ItemViewDelegate<T>()
        {
            @Override
            public int getItemViewLayoutId()
            {
                return layoutId;
            }

            @Override
            public boolean isForViewType( T item, int position)
            {
                return true;
            }

            @Override
            public void convert(ViewHolder holder, T t, int position)
            {
                RecyclerViewCommonAdapter.this.convert(holder, t, position);
            }
        });
    }

    protected abstract void convert(ViewHolder holder, T t, int position);


}
