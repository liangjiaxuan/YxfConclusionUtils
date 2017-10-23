package com.rongwei.yxfconclusionutils.aui.adapter.rvadapter;

import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.rongwei.yxfconclusionutils.R;
import com.rongwei.yxfconclusionutils.bean.rvbean.HomeItem;

import java.util.List;


/**
 * Created by Administrator on 2017/10/23.
 */

public class HomeAdapter extends BaseQuickAdapter<HomeItem ,BaseViewHolder > {

    public HomeAdapter(@LayoutRes int layoutResId, @Nullable List<HomeItem> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, HomeItem item) {
        helper.setText(R.id.text, item.getTitle());
        helper.setImageResource(R.id.icon, item.getImageResource());
    }
}
