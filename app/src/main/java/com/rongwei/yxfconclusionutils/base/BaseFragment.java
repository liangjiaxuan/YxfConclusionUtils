package com.rongwei.yxfconclusionutils.base;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.umeng.analytics.MobclickAgent;

/**
 * Created by Administrator on 2017/10/20.
 */

public class BaseFragment extends Fragment {
    protected Context context;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = getContext();
    }

    @Override
    public void onResume() {
        super.onResume();
        MobclickAgent.onResume(context);
    }

    @Override
    public void onPause() {
        super.onPause();
        MobclickAgent.onPause(context);
    }

    /**
     * 进度加载条
     */
    private boolean progressShow;
    ProgressDialog progressDialog;

    public void showProgressDialog(String text) {
        if (progressShow) {
            return;
        }
        hideProgressDialog();
        progressShow = true;
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

    public void hideProgressDialog() {
        if (progressDialog != null) {
            progressDialog.dismiss();
            progressDialog = null;
            progressShow = false;
        }
    }

}
