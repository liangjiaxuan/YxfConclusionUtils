package com.rongwei.yxfconclusionutils.aui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.rongwei.yxfconclusionutils.R;
import com.rongwei.yxfconclusionutils.base.BaseActivity;
import com.rongwei.yxfconclusionutils.utils.ToastUtils;
import com.rongwei.yxfconclusionutils.widget.dialog.CustomDialogReChange;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class CustomDialogActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_dialog);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.tv_dialog)
    public void onViewClicked() {
        final CustomDialogReChange dialogReChange=new CustomDialogReChange(this);
        TextView tvSure = dialogReChange.getTvSure();
        View tvContent = dialogReChange.getTvContent();
        dialogReChange.setOnPositiveListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastUtils.showToast(getApplicationContext(),"确定点击");
                dialogReChange.dismiss();
            }
        });
        dialogReChange.setOnNegativeListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastUtils.showToast(getApplicationContext(),"取消");
                dialogReChange.dismiss();
            }
        });
        dialogReChange.show();
    }
}
