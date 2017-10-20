package com.rongwei.yxfconclusionutils.netstate;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;

/**
 * Created by admin on 2016/12/22.
 */
public class NetStateManager {
    private NetBroadcasttReceiver receiver;
    private Context mCtx;
    /**
     * 注册广播
     */

    public void register(Context context){
        this.mCtx = context;
        receiver = new NetBroadcasttReceiver();
        IntentFilter filter = new IntentFilter();
        filter.addAction(ConnectivityManager.CONNECTIVITY_ACTION);
        context.registerReceiver(receiver, filter);
    }

    /**
     * 注销广播
     */
    public void unRegister(){
        mCtx.unregisterReceiver(receiver);
    }
}
