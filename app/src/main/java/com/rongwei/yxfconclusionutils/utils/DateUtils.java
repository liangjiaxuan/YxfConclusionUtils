package com.rongwei.yxfconclusionutils.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Administrator on 2017/3/9.
 */

public class DateUtils {

    /**
     * MM月dd日HH:mm
     * @param time
     * @return
     */
    public static String getFormatTimeyMdHm(long time) {
        String times = "";
        SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日 HH:mm", Locale.CHINA);
        times = format.format(new Date(time));
        return times;
    }

    /**
     * MM月dd日HH:mm
     * @param time
     * @return
     */
    public static String getFormatTimeMdHm(long time) {
        String times = "";
        SimpleDateFormat format = new SimpleDateFormat("MM月dd日 HH:mm", Locale.CHINA);
        times = format.format(new Date(time));
        return times;
    }

    /**
     * MM月dd日
     * @param time
     * @return
     */
    public static String getFormatTimeyMd(long time) {
        String times = "";
        SimpleDateFormat format = new SimpleDateFormat("yy年MM月dd日");
        times = format.format(new Date(time));
        return times;
    }

    /**
     * MM月dd日
     * @param time
     * @return
     */
    public static String getFormatTimeMd(long time) {
        String times = "";
        SimpleDateFormat format = new SimpleDateFormat("MM月dd日");
        times = format.format(new Date(time));
        return times;
    }

    public static String getFormatTimeWeekday(long time){
        String times="";
        SimpleDateFormat format=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EEEE");
        times=format.format(new Date(time));
        return times;
    }

}
