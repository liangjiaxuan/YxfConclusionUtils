package com.rongwei.yxfconclusionutils.aui.adapter;

import android.content.Context;

import com.rongwei.yxfconclusionutils.R;
import com.rongwei.yxfconclusionutils.commonadapter.listview.ListviewCommonAdapter;
import com.rongwei.yxfconclusionutils.commonadapter.listview.ViewHolder;

import java.util.List;

/**
 * Created by Administrator on 2017/10/20.
 */

public class MainAdapter extends ListviewCommonAdapter<String> {

    public MainAdapter(Context context, List<String> data, int layoutId) {
        super(context, data, layoutId);
    }

    @Override
    public void convert(ViewHolder holder, int position) {
        holder.setText(R.id.tv_title,data.get(position));
    }
}
