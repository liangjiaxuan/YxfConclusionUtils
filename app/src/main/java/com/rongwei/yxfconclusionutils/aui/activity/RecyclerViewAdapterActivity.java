package com.rongwei.yxfconclusionutils.aui.activity;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.rongwei.yxfconclusionutils.R;
import com.rongwei.yxfconclusionutils.aui.adapter.RecyclerviewAdapter;
import com.rongwei.yxfconclusionutils.bean.RecyclerviewBean;
import com.rongwei.yxfconclusionutils.commonadapter.recyclerview.MultiItemTypeAdapter;
import com.rongwei.yxfconclusionutils.commonadapter.recyclerview.wrapper.HeaderAndFooterWrapper;
import com.rongwei.yxfconclusionutils.commonadapter.recyclerview.wrapper.LoadMoreWrapper;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;


public class RecyclerViewAdapterActivity extends AppCompatActivity implements SwipeRefreshLayout.OnRefreshListener{

    @Bind(R.id.recycerview)
    RecyclerView mRecyclerView;
    RecyclerviewAdapter adapter;
    @Bind(R.id.swipefreshlayout)
    SwipeRefreshLayout swipefreshlayout;
    private List<RecyclerviewBean> datas = new ArrayList<>();
    private HeaderAndFooterWrapper mHeaderAndFooterWrapper;
    private LoadMoreWrapper mLoadMoreWrapper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_adapter);
        ButterKnife.bind(this);
        initDatas();
        swipefreshlayout.setOnRefreshListener(this);
        swipefreshlayout.setRefreshing(false);
        swipefreshlayout.setColorSchemeColors(getResources().getColor(R.color.colorAccent));
        mRecyclerView.setHasFixedSize(true);
//        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setLayoutManager(new GridLayoutManager(this, 3));
//        mRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        //添加分割线
//        mRecyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL_LIST));
        adapter = new RecyclerviewAdapter(this, R.layout.list_item_recyclerview, datas);
        initListener();
        initHeaderAndFooter();
        initLoadMore();
        mRecyclerView.setAdapter(mLoadMoreWrapper);

    }

    /**
     * 初始化监听事件
     */
    private void initListener() {
        adapter.setOnItemClickListener(new MultiItemTypeAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, RecyclerView.ViewHolder holder, int position) {

            }

            @Override
            public boolean onItemLongClick(View view, RecyclerView.ViewHolder holder, int position) {
                return false;
            }
        });
    }

    /**
     * 添加头部和底部
     */
    private void initHeaderAndFooter() {
        mHeaderAndFooterWrapper = new HeaderAndFooterWrapper(adapter);
        TextView t1 = new TextView(this);
        t1.setText("Header 1");
        TextView t2 = new TextView(this);
        t2.setText("Header 2");
        mHeaderAndFooterWrapper.addHeaderView(t1);
        mHeaderAndFooterWrapper.addHeaderView(t2);
    }

    /**
     * 上拉加载更多
     */
    private void initLoadMore() {
        mLoadMoreWrapper = new LoadMoreWrapper(mHeaderAndFooterWrapper);
        mLoadMoreWrapper.setLoadMoreView(R.layout.default_loading);
        mLoadMoreWrapper.setOnLoadMoreListener(new LoadMoreWrapper.OnLoadMoreListener() {
            @Override
            public void onLoadMoreRequested() {
                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        datas.add(new RecyclerviewBean(R.mipmap.dyzem12,"第100个话题哈哈"));
                        datas.add(new RecyclerviewBean(R.mipmap.dyzem13,"第101个话题哈哈"));
                        datas.add(new RecyclerviewBean(R.mipmap.dyzem14,"第102个话题哈哈"));
                        datas.add(new RecyclerviewBean(R.mipmap.dyzem15,"第103个话题哈哈"));
                        datas.add(new RecyclerviewBean(R.mipmap.dyzem16,"第104个话题哈哈"));
                        mLoadMoreWrapper.notifyDataSetChanged();
                    }
                }, 2000);
            }
        });
    }

    private void initDatas() {
        datas.add(new RecyclerviewBean(R.mipmap.dyzem0,"第一个话题哈哈"));
        datas.add(new RecyclerviewBean(R.mipmap.dyzem1,"第二个话题哈哈"));
        datas.add(new RecyclerviewBean(R.mipmap.dyzem2,"第三个话题哈哈"));
        datas.add(new RecyclerviewBean(R.mipmap.dyzem3,"第四个话题哈哈"));
        datas.add(new RecyclerviewBean(R.mipmap.dyzem4,"第五个话题哈哈"));
        datas.add(new RecyclerviewBean(R.mipmap.dyzem5,"第六个话题哈哈"));
        datas.add(new RecyclerviewBean(R.mipmap.dyzem6,"第七个话题哈哈"));
        datas.add(new RecyclerviewBean(R.mipmap.dyzem7,"第八个话题哈哈"));
        datas.add(new RecyclerviewBean(R.mipmap.dyzem8,"第九个话题哈哈"));
        datas.add(new RecyclerviewBean(R.mipmap.dyzem9,"第十个话题哈哈"));
        datas.add(new RecyclerviewBean(R.mipmap.dyzem10,"第十一个话题哈哈"));
        datas.add(new RecyclerviewBean(R.mipmap.dyzem11,"第十二个话题哈哈"));
    }

    @Override
    public void onRefresh() {

    }
}
