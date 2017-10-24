package com.rongwei.yxfconclusionutils.aui.activity;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItem;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;
import com.rongwei.yxfconclusionutils.R;
import com.rongwei.yxfconclusionutils.aui.fragment.smarttable.FriendFragment;
import com.rongwei.yxfconclusionutils.aui.fragment.smarttable.MessageFragment;

import java.util.ArrayList;
import java.util.List;


public class SmartTablelayoutActivity extends AppCompatActivity {

    private ViewPager viewpager;
    private SmartTabLayout tab;
    private List<String> titles=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smart_tablelayout);
        viewpager= (ViewPager) findViewById(R.id.viewpager_test);
        tab= (SmartTabLayout) findViewById(R.id.viewpagertab);
        init();
        FragmentPagerItems pages = new FragmentPagerItems(this);
        pages.add(FragmentPagerItem.of(titles.get(0),MessageFragment.class));
        pages.add(FragmentPagerItem.of(titles.get(1),FriendFragment.class));
//        pages.add(FragmentPagerItem.of(titles.get(2),Test3Fragment.class));
        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
                getSupportFragmentManager(), pages);
        viewpager.setAdapter(adapter);
        tab.setViewPager(viewpager);
    }

    private void init() {
        titles.add("消息");
        titles.add("关注");
    }

}
