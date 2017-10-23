package com.rongwei.yxfconclusionutils.aui.adapter.rvadapter;

import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.view.ViewGroup;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.rongwei.yxfconclusionutils.R;
import com.rongwei.yxfconclusionutils.bean.rvbean.AnimationItem;
import com.rongwei.yxfconclusionutils.utils.DisplayUtils;

import java.util.List;

/**
 * Created by Administrator on 2017/10/23.
 */

public class PullToRefreshAdapter extends BaseQuickAdapter<AnimationItem,BaseViewHolder> {

    public PullToRefreshAdapter(@LayoutRes int layoutResId, @Nullable List<AnimationItem> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, AnimationItem item) {
        CardView cardView = helper.getView(R.id.cardview);
        int width = DisplayUtils.getScreenWidth(mContext) - DisplayUtils.dip2px(mContext, 10);
        ViewGroup.LayoutParams params = cardView.getLayoutParams();
        params.width = width / 2;
        params.height=width/2;
        cardView.setLayoutParams(params);

        helper.setText(R.id.tv,item.title);
    }
}
