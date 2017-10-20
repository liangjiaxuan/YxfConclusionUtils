package com.rongwei.yxfconclusionutils.netstate;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.os.Message;
import android.widget.Toast;

/**
 * Created by admin on 2016/12/22.
 */
public class NetBroadcasttReceiver extends BroadcastReceiver {
    private static final int PING_CODE = 1;
    private Context mCtx;
    private static int pingResult;
    //isNetConnected是为了保证网络在已经连接的情况下不在重复提醒用户
    public static boolean isNetConnected=true;

    private static Handler handler = new Handler() {
        public void handleMessage(Message msg) {
            if (msg.what == PING_CODE) {
                pingResult = msg.arg1;
            }
        }
    };

    @Override
    public void onReceive(Context context, Intent intent) {
        mCtx=context;
        String action = intent.getAction();
        if (action==null) {
            return;
        }
        if (action.equals(ConnectivityManager.CONNECTIVITY_ACTION)) {     //接收到系统发送的广播，然后进行网络判断
            netState(context);
        }
    }
    private void netState(Context context) {
        ConnectivityType connectedType = NetworkHelper.getConnectedType(context);
        requestPingResult();
        if (connectedType == ConnectivityType.OFFLINE) {
            isNetConnected=false;
            toast("网络链接已断开");
            return;
        }
        if (connectedType == ConnectivityType.UNKNOWN
                && pingResult == NetworkHelper.PING_SUCCESS) {
            toast("未知网络");
            return;
        }

        if (connectedType == ConnectivityType.MOBILE) {
            if (!isNetConnected) {
                isNetConnected=true;
                toast("网络已连接");
            }
            return;
        }
        if (connectedType == ConnectivityType.WIFI
                && pingResult == NetworkHelper.PING_SUCCESS) {
            if (!isNetConnected) {
                isNetConnected=true;
                toast("网络已连接");
            }
            return;
        } else if (connectedType == ConnectivityType.WIFI
                && pingResult != NetworkHelper.PING_SUCCESS) {
            if (!isNetConnected) {
                isNetConnected=true;
                toast("网络已连接");
            }
            return;
        }
    }

    /**
     * @方法描述：请求Ping网络IP的结果
     * @author lizhenya
     */
    private void requestPingResult() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                int ping = NetworkHelper.Ping("www.baidu.com");

                Message message = Message.obtain();
                message.what = PING_CODE;
                message.arg1 = ping;
                handler.sendMessage(message);
            }
        }).start();
    }

    private void toast(CharSequence message) {
        Toast.makeText(mCtx, message, Toast.LENGTH_SHORT).show();
    }
}
