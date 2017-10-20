package com.rongwei.yxfconclusionutils.widget.dialog;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.rongwei.yxfconclusionutils.R;


/**
 * Created by admin on 2016/10/25.
 */
public class CustomDialogReChange extends Dialog {

    private TextView tvCancle,tvSure;
    private TextView tvContent;

    public CustomDialogReChange(Context context) {
        super(context, R.style.MyDialog);
        setCustomDialog();
    }

    private void setCustomDialog() {
        View mView = LayoutInflater.from(getContext()).inflate(R.layout.rechage_item_dialog, null);
        tvCancle = (TextView) mView.findViewById(R.id.tv_cancle);
        tvSure = (TextView) mView.findViewById(R.id.tv_sure);
        tvContent = (TextView) mView.findViewById(R.id.tv_content);
        super.setContentView(mView);
    }

    public View getTvContent(){
        return tvContent;
    }

    public TextView getTvSure(){
        return tvSure;
    }

    @Override
    public void setContentView(int layoutResID) {
    }

    @Override
    public void setContentView(View view, ViewGroup.LayoutParams params) {
    }

    @Override
    public void setContentView(View view) {
    }


    /**
     * 确定键监听器
     * @param listener
     */
    public void setOnPositiveListener(View.OnClickListener listener){
        tvSure.setOnClickListener(listener);
    }
    /**
     * 取消键监听器
     * @param listener
     */
    public void setOnNegativeListener(View.OnClickListener listener){
        tvCancle.setOnClickListener(listener);
    }
}
