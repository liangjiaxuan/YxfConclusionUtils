package com.rongwei.yxfconclusionutils.aui.activity.rv;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.rongwei.yxfconclusionutils.R;
import com.rongwei.yxfconclusionutils.aui.adapter.rvadapter.MultipleItemQuickAdapter;
import com.rongwei.yxfconclusionutils.bean.rvbean.MultipleItem;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MultipleItemUseActivity extends AppCompatActivity {

    @Bind(R.id.rv_list)
    RecyclerView rvList;
    MultipleItemQuickAdapter adapter;
    List<MultipleItem>data=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple_item_use);
        ButterKnife.bind(this);
        initData();
        initAdapter();
    }

    private void initAdapter() {
        adapter=new MultipleItemQuickAdapter(data);
        rvList.setLayoutManager(new LinearLayoutManager(this));
        adapter.openLoadAnimation(BaseQuickAdapter.SCALEIN);
        rvList.setAdapter(adapter);
        View top= LayoutInflater.from(this).inflate(R.layout.top_view,null);
        adapter.addHeaderView(top);

        View footview = getLayoutInflater().inflate(R.layout.footer_view, (ViewGroup) rvList.getParent(), false);
        adapter.addFooterView(footview);
    }

    private void initData() {
        for (int i = 0; i < 20; i++) {
            data.add(new MultipleItem(MultipleItem.VIEW_TYPE1,"multipel title"+i,"multipel content"+i,R.mipmap.gv_animation));
            data.add(new MultipleItem(MultipleItem.VIEW_TYPE3,"multipel title"+i,"multipel content"+i,R.mipmap.gv_animation));
            data.add(new MultipleItem(MultipleItem.VIEW_TYPE2,"multipel title"+i,"multipel content"+i,R.mipmap.gv_animation));
            data.add(new MultipleItem(MultipleItem.VIEW_TYPE1,"multipel title"+i,"multipel content"+i,R.mipmap.gv_animation));

        }
    }
}
