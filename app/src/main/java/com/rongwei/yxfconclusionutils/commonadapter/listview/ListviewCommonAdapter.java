package com.rongwei.yxfconclusionutils.commonadapter.listview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by LCCX on 2016/8/21.
 */
public abstract class ListviewCommonAdapter<T> extends BaseAdapter {
    protected Context context;
    protected List<T> data;
    protected int layoutId;

    public ListviewCommonAdapter(Context context, List<T> data, int layoutId) {
        this.context = context;
        this.data = data;
        this.layoutId = layoutId;
    }

    @Override
    public int getCount() {
        return data!=null?data.size():0;
    }

    @Override
    public Object getItem(int position) {
        return data!=null?data.get(position):null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder=ViewHolder.getHolder(context,convertView,layoutId,parent,position);
        convert(viewHolder,position);
        return viewHolder.getConvertView();
    }
    public abstract void convert(ViewHolder holder,int position);
}
