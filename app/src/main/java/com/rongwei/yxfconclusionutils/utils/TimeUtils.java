package com.rongwei.yxfconclusionutils.utils;

/**
 * Created by Administrator on 2017/3/9.
 */

public class TimeUtils {
    
    public static String getPulishTime(long time) {
        long currentTime = System.currentTimeMillis();
        long interval = currentTime - time;
        if (interval < 1000 * 60 * 60) {
            long i = interval / (1000 * 60);
            return i + "分钟前";
        }
        if (interval < 1000 * 60 * 60 * 24) {
            long i = interval / (1000 * 60 * 60);
            return i + "小时前";
        }
        if (interval < 1000 * 60 * 60 * 24 * 7) {
            long i = interval / (1000 * 60 * 60 * 24);
            return i + "天前";
        }

        return DateUtils.getFormatTimeMdHm(time);
    }
}
