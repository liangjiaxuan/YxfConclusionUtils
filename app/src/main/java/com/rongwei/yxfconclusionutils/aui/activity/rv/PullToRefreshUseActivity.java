package com.rongwei.yxfconclusionutils.aui.activity.rv;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.rongwei.yxfconclusionutils.R;
import com.rongwei.yxfconclusionutils.aui.adapter.rvadapter.PullToRefreshAdapter;
import com.rongwei.yxfconclusionutils.bean.rvbean.AnimationItem;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class PullToRefreshUseActivity extends AppCompatActivity implements BaseQuickAdapter.RequestLoadMoreListener,SwipeRefreshLayout.OnRefreshListener{

    @Bind(R.id.rv_list)
    RecyclerView rvList;
    @Bind(R.id.swipeLayout)
    SwipeRefreshLayout swipeLayout;
    PullToRefreshAdapter adapter;
    private List<AnimationItem> data=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pull_to_refresh_use);
        ButterKnife.bind(this);
        initData();
        swipeLayout.setOnRefreshListener(this);
        adapter=new PullToRefreshAdapter(R.layout.list_item_animation,data);

    }

    private void initData() {
        for (int i = 0; i < 40; i++) {
            data.add(new AnimationItem("animation title"+i));
        }
    }

    @Override
    public void onRefresh() {

    }

    @Override
    public void onLoadMoreRequested() {

    }
}
