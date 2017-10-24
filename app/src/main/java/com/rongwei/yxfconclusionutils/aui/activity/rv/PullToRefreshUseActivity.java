package com.rongwei.yxfconclusionutils.aui.activity.rv;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

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

    private static final int TOTAL_COUNTER = 28;

    private static final int PAGE_SIZE = 10;

    private int delayMillis = 2000;

    private int mCurrentCounter = 0;

    private boolean isErr;//加载数据的时候发生错误(网络或其他错误)的时候
    private boolean mLoadMoreEndGone = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pull_to_refresh_use);
        ButterKnife.bind(this);
        swipeLayout.setOnRefreshListener(this);
        rvList.setLayoutManager(new LinearLayoutManager(this));
        adapter=new PullToRefreshAdapter(R.layout.list_item_animation,data);
        adapter.setEnableLoadMore(true);
        adapter.setOnLoadMoreListener(this,rvList);
        adapter.openLoadAnimation(BaseQuickAdapter.SCALEIN);
        adapter.isFirstOnly(false);
        rvList.setAdapter(adapter);
        if (adapter.getData().size()<=0) {
            View emptyView = LayoutInflater.from(this).inflate(R.layout.empty_view, null);
            adapter.setEmptyView(emptyView);
        }
    }

    @Override
    public void onRefresh() {
        initData();
    }

    @Override
    public void onLoadMoreRequested() {
        swipeLayout.setEnabled(false);
        if (adapter.getData().size() < PAGE_SIZE) {
            adapter.setEnableLoadMore(true);
        } else {
            if (mCurrentCounter >= TOTAL_COUNTER) {
                adapter.loadMoreEnd(mLoadMoreEndGone);//true is gone,false is visible
            } else {
                if (!isErr) {
                   loadData();
                } else {
                    isErr = false;
                    Toast.makeText(PullToRefreshUseActivity.this, R.string.network_err, Toast.LENGTH_LONG).show();
                    adapter.loadMoreFail();
                }
            }
        }
        swipeLayout.setEnabled(true);
    }

    private void initData() {
        adapter.setEnableLoadMore(false);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (data!=null) {
                    data.clear();
                }
                for (int i = 0; i < PAGE_SIZE; i++) {
                    data.add(new AnimationItem("animation title"+i));
                }
                adapter.setNewData(data);
                isErr = false;
                mCurrentCounter = PAGE_SIZE;
                swipeLayout.setRefreshing(false);
                adapter.setEnableLoadMore(true);
            }
        }, delayMillis);
    }

    private void loadData() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                for (int i = mCurrentCounter; i < mCurrentCounter+PAGE_SIZE; i++) {
                    data.add(new AnimationItem("animation title"+i));
                }
                adapter.setNewData(data);
                mCurrentCounter = adapter.getData().size();
                adapter.loadMoreComplete();
            }
        },delayMillis);
    }
}
