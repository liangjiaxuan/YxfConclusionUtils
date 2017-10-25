package com.rongwei.yxfconclusionutils.aui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.rongwei.yxfconclusionutils.R;
import com.rongwei.yxfconclusionutils.aui.activity.rv.AnimationUseActivity;
import com.rongwei.yxfconclusionutils.aui.activity.rv.EmptyViewUseActivity;
import com.rongwei.yxfconclusionutils.aui.activity.rv.HeaderAndFooterUseActivity;
import com.rongwei.yxfconclusionutils.aui.activity.rv.MultipleItemUseActivity;
import com.rongwei.yxfconclusionutils.aui.activity.rv.PullToRefreshUseActivity;
import com.rongwei.yxfconclusionutils.aui.adapter.rvadapter.HomeAdapter;
import com.rongwei.yxfconclusionutils.base.BaseActivity;
import com.rongwei.yxfconclusionutils.bean.rvbean.HomeItem;
import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;


public class RecyclerviewHelperActivity extends BaseActivity {
    private static final Class<?>[] ACTIVITY = {AnimationUseActivity.class, MultipleItemUseActivity.class, HeaderAndFooterUseActivity.class, PullToRefreshUseActivity.class,  EmptyViewUseActivity.class};
    private static final String[] TITLE = {"Animation", "MultipleItem", "Header/Footer", "PullToRefresh", "EmptyView"};
    private static final int[] IMG = {R.mipmap.gv_animation, R.mipmap.gv_multipleltem, R.mipmap.gv_header_and_footer, R.mipmap.gv_pulltorefresh, R.mipmap.gv_empty};
    private ArrayList<HomeItem> mDataList;
    @Bind(R.id.rv_list)
    RecyclerView rvList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview_helper);
        ButterKnife.bind(this);
        rvList.setLayoutManager(new GridLayoutManager(this,2));
        initData();
        initAdapter();
    }

    private void initAdapter() {
        BaseQuickAdapter homeAdapter = new HomeAdapter(R.layout.home_item_view, mDataList);
        homeAdapter.openLoadAnimation();
        View top = getLayoutInflater().inflate(R.layout.top_view, (ViewGroup) rvList.getParent(), false);
        homeAdapter.addHeaderView(top);
        homeAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                Intent intent = new Intent(RecyclerviewHelperActivity.this, ACTIVITY[position]);
                startActivity(intent);
            }
        });
        rvList.setAdapter(homeAdapter);
    }

    private void initData() {
        mDataList = new ArrayList<>();
        for (int i = 0; i < TITLE.length; i++) {
            HomeItem item = new HomeItem();
            item.setTitle(TITLE[i]);
            item.setActivity(ACTIVITY[i]);
            item.setImageResource(IMG[i]);
            mDataList.add(item);
        }
    }

}
