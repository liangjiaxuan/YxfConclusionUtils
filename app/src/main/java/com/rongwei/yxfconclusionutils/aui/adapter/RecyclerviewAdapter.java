package com.rongwei.yxfconclusionutils.aui.adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.view.ViewGroup;

import com.rongwei.yxfconclusionutils.R;
import com.rongwei.yxfconclusionutils.bean.RecyclerviewBean;
import com.rongwei.yxfconclusionutils.commonadapter.recyclerview.RecyclerViewCommonAdapter;
import com.rongwei.yxfconclusionutils.commonadapter.recyclerview.base.ViewHolder;
import com.rongwei.yxfconclusionutils.utils.DisplayUtils;

import java.util.List;

/**
 * Created by Administrator on 2017/10/20.
 */

public class RecyclerviewAdapter extends RecyclerViewCommonAdapter<RecyclerviewBean> {
    public RecyclerviewAdapter(Context context, int layoutId, List<RecyclerviewBean> datas) {
        super(context, layoutId, datas);
    }

    @Override
    protected void convert(ViewHolder holder, RecyclerviewBean recyclerviewBean, int position) {
        CardView cardView= (CardView) holder.getConvertView().findViewById(R.id.cardview);
        int width = DisplayUtils.getScreenWidth(mContext) - DisplayUtils.dip2px(mContext, 10);
        ViewGroup.LayoutParams params = cardView.getLayoutParams();
        params.height = (width) / 3;
        params.width = (width) / 3;
        cardView.setLayoutParams(params);
        holder.setText(R.id.tv,recyclerviewBean.title)
                .setImageResource(R.id.iv,recyclerviewBean.icon);
    }
}
