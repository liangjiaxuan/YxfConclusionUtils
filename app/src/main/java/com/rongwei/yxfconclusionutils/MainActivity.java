package com.rongwei.yxfconclusionutils;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.rongwei.yxfconclusionutils.aui.activity.CustomDialogActivity;
import com.rongwei.yxfconclusionutils.aui.activity.DateAndTimeUtilsActivity;
import com.rongwei.yxfconclusionutils.aui.activity.MyPermissionActivity;
import com.rongwei.yxfconclusionutils.aui.activity.NetStateActivity;
import com.rongwei.yxfconclusionutils.aui.activity.NotificationUtilsActivity;
import com.rongwei.yxfconclusionutils.aui.activity.PopWindowActivity;
import com.rongwei.yxfconclusionutils.aui.activity.RecyclerviewHelperActivity;
import com.rongwei.yxfconclusionutils.aui.activity.SmartTablelayoutActivity;
import com.rongwei.yxfconclusionutils.aui.adapter.MainAdapter;
import com.rongwei.yxfconclusionutils.base.BaseActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {

    private static final Class<?>[]ACTIVITY={ RecyclerviewHelperActivity.class, SmartTablelayoutActivity.class, CustomDialogActivity.class,
            NotificationUtilsActivity.class,PopWindowActivity.class ,DateAndTimeUtilsActivity.class, NetStateActivity.class,
            MyPermissionActivity.class};

    @Bind(R.id.lv_main)
    ListView lvMain;
    private MainAdapter adapter;
    private List<String> data=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initData();
        adapter=new MainAdapter(this,data,R.layout.list_item_main);
        lvMain.setAdapter(adapter);
        lvMain.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(getApplicationContext(),ACTIVITY[position]);
                startActivity(intent);
            }
        });
    }

    private void initData() {
        data.add("recyclerview adapter");
        data.add("SmartTableLayout");
        data.add("custom Dialog");
        data.add("notification utils");
        data.add("PopWindow");
        data.add("dateAndTimeUtils");
        data.add("net State");
        data.add("动态添加权限");
    }
}
