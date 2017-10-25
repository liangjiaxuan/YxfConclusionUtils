package com.rongwei.yxfconclusionutils.aui.activity;

import android.os.Bundle;
import android.widget.TextView;

import com.rongwei.yxfconclusionutils.R;
import com.rongwei.yxfconclusionutils.base.BaseActivity;
import com.rongwei.yxfconclusionutils.utils.DateUtils;
import com.rongwei.yxfconclusionutils.utils.TimeUtils;

import butterknife.Bind;
import butterknife.ButterKnife;

public class DateAndTimeUtilsActivity extends BaseActivity {

    @Bind(R.id.tv_data1)
    TextView tvData1;
    @Bind(R.id.tv_data2)
    TextView tvData2;
    @Bind(R.id.tv_data3)
    TextView tvData3;
    @Bind(R.id.tv_data4)
    TextView tvData4;
    @Bind(R.id.tv_data5)
    TextView tvData5;
    @Bind(R.id.tv_data6)
    TextView tvData6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_utils);
        ButterKnife.bind(this);
        long currentTimeMillis = System.currentTimeMillis();

        String formatTimeMd = DateUtils.getFormatTimeMd(currentTimeMillis);
        String formatTimeMdHm = DateUtils.getFormatTimeMdHm(currentTimeMillis);
        String formatTimeyMd = DateUtils.getFormatTimeyMd(currentTimeMillis);
        String formatTimeyMdHm = DateUtils.getFormatTimeyMdHm(currentTimeMillis);
        String formatTimeWeekday = DateUtils.getFormatTimeWeekday(currentTimeMillis);

        String pulishTime = TimeUtils.getPulishTime(currentTimeMillis-600*1000*1000);

        tvData1.setText(formatTimeMd);
        tvData2.setText(formatTimeMdHm);
        tvData3.setText(formatTimeyMd);
        tvData4.setText(formatTimeyMdHm);
        tvData5.setText(formatTimeWeekday);
        tvData6.setText(pulishTime);

    }
}
