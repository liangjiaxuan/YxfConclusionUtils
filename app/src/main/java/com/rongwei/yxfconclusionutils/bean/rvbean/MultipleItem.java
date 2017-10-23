package com.rongwei.yxfconclusionutils.bean.rvbean;

import com.chad.library.adapter.base.entity.MultiItemEntity;

/**
 * Created by Administrator on 2017/10/23.
 */

public class MultipleItem implements MultiItemEntity {
    public static final int VIEW_TYPE1=0;
    public static final int VIEW_TYPE2=1;
    public static final int VIEW_TYPE3=2;

    public int itemType;
    public String title;
    public String content;
    public int icon;

    public MultipleItem(int itemType, String title, String content, int icon) {
        this.itemType = itemType;
        this.title = title;
        this.content = content;
        this.icon = icon;
    }

    @Override
    public String toString() {
        return "MultipleItem{" +
                "itemType=" + itemType +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", icon=" + icon +
                '}';
    }

    @Override
    public int getItemType() {
        return itemType;
    }
}
