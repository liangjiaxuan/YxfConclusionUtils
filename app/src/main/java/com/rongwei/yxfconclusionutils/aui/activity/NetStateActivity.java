package com.rongwei.yxfconclusionutils.aui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.rongwei.yxfconclusionutils.R;
import com.rongwei.yxfconclusionutils.base.BaseActivity;
import com.rongwei.yxfconclusionutils.netstate.NetStateManager;

public class NetStateActivity extends BaseActivity {

    private NetStateManager netStateManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_net_state);
        netStateManager=new NetStateManager();
        netStateManager.register(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        netStateManager.unRegister();
    }
}
