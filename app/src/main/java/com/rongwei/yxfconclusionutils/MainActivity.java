package com.rongwei.yxfconclusionutils;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.rongwei.yxfconclusionutils.aui.activity.RecyclerviewHelperActivity;
import com.rongwei.yxfconclusionutils.aui.adapter.MainAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    private static final Class<?>[]ACTIVITY={ RecyclerviewHelperActivity.class};

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
    }
}
