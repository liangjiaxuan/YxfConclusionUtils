package com.rongwei.yxfconclusionutils.aui.activity.rv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.CompoundButton;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.kyleduo.switchbutton.SwitchButton;
import com.rongwei.yxfconclusionutils.R;
import com.rongwei.yxfconclusionutils.aui.adapter.rvadapter.AnimationAdapter;
import com.rongwei.yxfconclusionutils.bean.rvbean.AnimationItem;

import java.util.ArrayList;
import java.util.List;

public class AnimationUseActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private AnimationAdapter adapter;
    private List<AnimationItem> data=new ArrayList<>();
    SwitchButton switchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_use);
        mRecyclerView = (RecyclerView) findViewById(R.id.rv_list);
        switchButton = (SwitchButton) findViewById(R.id.switch_button);
        mRecyclerView.setHasFixedSize(true);//设置item高度不变，但是刷新的时候会做相应的改变
        mRecyclerView.setLayoutManager(new GridLayoutManager(this,2));
        initData();
        initAdapter();
        initListner();

    }

    private void initListner() {
        switchButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    adapter.isFirstOnly(true);
                } else {
                    adapter.isFirstOnly(false);
                }
                adapter.notifyDataSetChanged();
            }
        });
    }

    private void initData() {
        for (int i = 0; i < 40; i++) {
            data.add(new AnimationItem("animation title"+i));
        }
    }

    private void initAdapter() {
        adapter=new AnimationAdapter(R.layout.list_item_animation,data);
//        adapter.openLoadAnimation(BaseQuickAdapter.ALPHAIN);
        adapter.openLoadAnimation(BaseQuickAdapter.SCALEIN);
//        adapter.openLoadAnimation(BaseQuickAdapter.SLIDEIN_BOTTOM);
//        adapter.openLoadAnimation(BaseQuickAdapter.SLIDEIN_LEFT);
//        adapter.openLoadAnimation(BaseQuickAdapter.SLIDEIN_RIGHT);
        mRecyclerView.setAdapter(adapter);
        adapter.isFirstOnly(false);
    }
}
