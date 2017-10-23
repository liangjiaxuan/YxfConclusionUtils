package com.rongwei.yxfconclusionutils.aui.adapter.rvadapter;


import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.rongwei.yxfconclusionutils.R;
import com.rongwei.yxfconclusionutils.bean.rvbean.MultipleItem;

import java.util.List;


/**
 * Created by Administrator on 2017/10/23.
 */

public class MultipleItemQuickAdapter extends BaseMultiItemQuickAdapter<MultipleItem,BaseViewHolder> {

    /**
     * Same as QuickAdapter#QuickAdapter(Context,int) but with
     * some initialization data.
     *
     * @param data A new list is created out of this one to avoid mutable list
     */
    public MultipleItemQuickAdapter(List<MultipleItem> data) {
        super(data);
        addItemType(MultipleItem.VIEW_TYPE1, R.layout.list_item_multiple_one);
        addItemType(MultipleItem.VIEW_TYPE2,R.layout.list_item_multiple_two);
        addItemType(MultipleItem.VIEW_TYPE3,R.layout.list_item_multiple_three);
    }

    @Override
    protected void convert(BaseViewHolder helper, MultipleItem item) {
        int itemViewType = helper.getItemViewType();
        switch (itemViewType) {
            case MultipleItem.VIEW_TYPE1:
                helper.setText(R.id.tv_title,item.title);
                break;
            case MultipleItem.VIEW_TYPE2:
                helper.setImageResource(R.id.iv_left,R.mipmap.gv_animation);
                helper.setImageResource(R.id.iv_right,R.mipmap.gv_header_and_footer);
                break;
            case MultipleItem.VIEW_TYPE3:
                helper.setImageResource(R.id.iv,R.mipmap.ic_launcher);
                break;
        }
    }
}
