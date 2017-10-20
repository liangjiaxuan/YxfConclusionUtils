package com.rongwei.yxfconclusionutils.netstate;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/**
 * Created by admin on 2016/12/22.
 */
public class NetworkHelper {

    //首先判断网络是否连接  然后再判断连接网络的类型是那种类型的网络


    public static final String WIFI = "wifi";
    public static final String MOBILE = "移动蜂窝网络";
    public static final String UNKNOWN = "未知网络状态";
    public static final String OFFLINE = "网络连接已断开";
    public static final String IP_DEFAULT = "0.0.0.0";
    public static String ping;
    public static final int PING_SUCCESS = 0;
    public static final int PING_FAILE = 1;


    public static ConnectivityManager getConnectivityManager(Context context){
        return  (ConnectivityManager) context
                .getSystemService(context.CONNECTIVITY_SERVICE);
    }

    /**
     * 获取网络的类型
     */
    public static ConnectivityType getConnectedType(Context context){
        ConnectivityManager connectivityManager = getConnectivityManager(context);
        if (connectivityManager!=null) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (null != activeNetworkInfo) {
                switch (activeNetworkInfo.getType()) {
                    case ConnectivityManager.TYPE_WIFI:
                        return ConnectivityType.WIFI;
                    case ConnectivityManager.TYPE_MOBILE:
                        return ConnectivityType.MOBILE;
                    default:
                        return ConnectivityType.UNKNOWN;
                }
            }
        }
        return ConnectivityType.OFFLINE;
    }


    /**
     * @方法描述：wifi连接时判断当前WiFi是否可用
     * @param ipString
     * @return success表示网络畅通，否则网络不通
     */
    public static int Ping(String ipString) {
        int resault = -1;
        Process p;
        try {
            // ping -c 2 -w 100 中 ，-c 是指ping的次数 2是指ping 2次 ，-w 100
            // 以秒为单位指定超时间隔，是指超时时间为100秒
            p = Runtime.getRuntime().exec("ping -c 2 -w 100 " + ipString);
            int status = p.waitFor();

            InputStream input = p.getInputStream();
            BufferedReader in = new BufferedReader(new InputStreamReader(input));
            StringBuffer buffer = new StringBuffer();
            String line = "";
            while ((line = in.readLine()) != null) {
                buffer.append(line);
            }
            System.out.println("Return ============" + buffer.toString());

            if (status == 0) {
                resault = PING_SUCCESS;
            } else {
                resault = PING_FAILE;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return resault;
    }

    /**
     * @方法描述：判断网络是否连接
     * @param context
     * @return
     */
    public static boolean isConnected(Context context){
        ConnectivityManager connectivityManager = getConnectivityManager(context);
        if (connectivityManager!=null) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo!=null&&activeNetworkInfo.isConnected()) {
                if (activeNetworkInfo.getState()== NetworkInfo.State.CONNECTED) {
                    return true;
                }
            }

        }
        return false;
    }

    /**
     * 扫描Wifi
     */
    public static void startWifiScan(Context context) {
        WifiManager wifiManager = (WifiManager) context
                .getSystemService(Context.WIFI_SERVICE);
        wifiManager.startScan();
    }


    /**
     * wifi是否连接
     */

    public static boolean isWifiConnected(Context context){
        ConnectivityManager connectivityManager = getConnectivityManager(context);
        if (connectivityManager!=null) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo!=null&&activeNetworkInfo.getType()==ConnectivityManager.TYPE_WIFI) {
                return true;
            }
        }
        return false;
    }

    /**
     * 移动网络连接
     */
    public static boolean isMobileNet(Context context){
        ConnectivityManager connectivityManager = getConnectivityManager(context);
        if (connectivityManager!=null) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo!=null&&activeNetworkInfo.getType()==ConnectivityManager.TYPE_MOBILE) {
                return true;
            }
        }
        return false;
    }

    /**
     * @方法描述：获取IP地址
     * @return
     */
    public static String getIPAddress() {
        try {
            final Enumeration<NetworkInterface> networkInterfaceEnumeration = NetworkInterface
                    .getNetworkInterfaces();

            while (networkInterfaceEnumeration.hasMoreElements()) {
                final NetworkInterface networkInterface = networkInterfaceEnumeration
                        .nextElement();

                final Enumeration<InetAddress> inetAddressEnumeration = networkInterface
                        .getInetAddresses();

                while (inetAddressEnumeration.hasMoreElements()) {
                    final InetAddress inetAddress = inetAddressEnumeration
                            .nextElement();

                    if (!inetAddress.isLoopbackAddress()) {
                        return inetAddress.getHostAddress();
                    }
                }
            }
            return NetworkHelper.IP_DEFAULT;
        } catch (final SocketException e) {
            return NetworkHelper.IP_DEFAULT;
        }
    }



    /**
     * @方法描述：打开网络设置界面
     * @param activity
     */
    public static void openSetting(Activity activity) {
        Intent intent = new Intent("/");
        ComponentName cm = new ComponentName("com.android.settings",
                "com.android.settings.WirelessSettings");
        intent.setComponent(cm);
        intent.setAction("android.intent.action.VIEW");
        activity.startActivityForResult(intent, 0);
    }

    public static void setPing(String ping) {
        NetworkHelper.ping = ping;
    }

}
