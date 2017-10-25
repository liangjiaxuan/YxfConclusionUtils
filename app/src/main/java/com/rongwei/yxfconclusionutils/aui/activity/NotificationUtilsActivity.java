package com.rongwei.yxfconclusionutils.aui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.rongwei.yxfconclusionutils.R;
import com.rongwei.yxfconclusionutils.base.BaseActivity;
import com.rongwei.yxfconclusionutils.widget.nitification.NotificationUtil;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class NotificationUtilsActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_utils);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.tv1, R.id.tv2, R.id.tv3, R.id.tv4})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv1:
                NotificationUtil.showFullScreen(NotificationUtilsActivity.this);
                break;
            case R.id.tv2:
                NotificationUtil.showNotification(this,"我的title","我的ticker","我的内容");
                break;
            case R.id.tv3:
                NotificationUtil.showNotificationProgress(this);
                break;
            case R.id.tv4:
                NotificationUtil.shwoNotify(this,"我的title","我的ticker","我的内容");
                break;
        }
    }
}
