package com.rongwei.yxfconclusionutils.aui.activity;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.PopupWindow;

import com.rongwei.yxfconclusionutils.R;

import static anet.channel.util.Utils.context;

public class PopWindowActivity extends Activity {

    private PopupWindow pushPW;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_window);

    }


    /**
     * 一键开撩
     * @param
     */
    private void showPushUser() {
        pushPW = new PopupWindow(getPushView(), ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        // 兼容各个版本 捕捉返回键
        pushPW.setBackgroundDrawable(new ColorDrawable());
        pushPW.setOutsideTouchable(true);
        pushPW.setFocusable(true);
        // 设置背景 灰色
        setBackgroundAlpha(0.5f);
        pushPW.setOnDismissListener(new PopupWindow.OnDismissListener() {
            @Override
            public void onDismiss() {
                setBackgroundAlpha(1f);
            }
        });

        View rootView = LayoutInflater.from(context).inflate(R.layout.activity_pop_window, null);
        pushPW.showAtLocation(rootView, Gravity.CENTER, 0, 0);
    }

    private View getPushView() {
        View view=LayoutInflater.from(this).inflate(R.layout.layout_login_reward,null);
        return view;
    }

    /**
     * 设置背景透明度
     *
     * @param alpha
     */
    private void setBackgroundAlpha(float alpha) {
        WindowManager.LayoutParams lp = getWindow().getAttributes();
        lp.alpha = alpha;
        getWindow().setAttributes(lp);
    }


}
