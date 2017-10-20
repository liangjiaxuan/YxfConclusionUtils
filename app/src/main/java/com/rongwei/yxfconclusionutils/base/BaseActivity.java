package com.rongwei.yxfconclusionutils.base;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.rongwei.yxfconclusionutils.utils.ToastUtils;
import com.umeng.analytics.MobclickAgent;
import com.umeng.message.PushAgent;

/**
 * Created by Administrator on 2017/10/20.
 */

public class BaseActivity extends AppCompatActivity {
    protected Context context;
    protected PushAgent mPushAgent;
    public static BaseActivity instance;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
        //统计应用启动数据 此方法与统计分析sdk中统计日活的方法无关！请务必调用此方法！
        mPushAgent = PushAgent.getInstance(context);
        mPushAgent.onAppStart();
        //添加Activity
        ActivityCollector.addActivity(this);

        // 竖屏
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    public static final BaseActivity getInstance(){
        if (instance==null) {
            instance=new BaseActivity();
        }
        return instance;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //移除activity
        ActivityCollector.removeActivity(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        MobclickAgent.onResume(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        MobclickAgent.onPause(this);
    }

    /**
     * 吐司
     * @param msg
     */
    protected void showToast(final String msg) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                ToastUtils.showToast(context, msg);
            }
        });
    }



    /**
     * 进度加载条
     */
    ProgressDialog progressDialog;
    private boolean progressShow;
    public void showProgressDialog(final String text){
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if (progressShow) {
                    return;
                }
                hideProgressDialog();
                progressDialog = new ProgressDialog(context);
                progressDialog.setCanceledOnTouchOutside(false);
                progressDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
                    @Override
                    public void onCancel(DialogInterface dialog) {
                        progressShow = false;
                    }
                });
                progressDialog.setMessage(text);
                progressDialog.show();
            }
        });

    }

    public void hideProgressDialog() {
        if (progressDialog != null) {
            progressDialog.dismiss();
            progressDialog = null;
            progressShow = false;
        }
    }

    /**
     * 获取版本号
     * @return 当前应用的版本号
     */
    public String getVersion() {
        try {
            PackageManager manager = this.getPackageManager();
            PackageInfo info = manager.getPackageInfo(this.getPackageName(), 0);
            String version = info.versionName;
            return version;
        } catch (Exception e) {
            e.printStackTrace();
            return "找不到版本号";
        }
    }

}
