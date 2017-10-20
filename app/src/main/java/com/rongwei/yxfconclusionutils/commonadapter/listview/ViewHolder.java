package com.rongwei.yxfconclusionutils.commonadapter.listview;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by LCCX on 2016/8/21.
 */
public class ViewHolder {
    private View mConvertView;
    private int mPosition;

    /**
     * 初始化convertview
     * @param context
     * @param layoutId
     * @param position
     */
    public ViewHolder(Context context, int layoutId, int position) {
        mConvertView= LayoutInflater.from(context).inflate(layoutId,null);
        mPosition=position;
        mConvertView.setTag(this);
    }

    /**
     * 得到convertview
     * @return
     */
    public View getConvertView(){
        return mConvertView;
    }
    /**
     * 得到ViewHolder
     * @param context
     * @param convertView
     * @param layoutId
     * @param parent
     * @param position
     * @return
     */
    public static ViewHolder getHolder(Context context, View convertView, int layoutId, ViewGroup parent, int position){
        ViewHolder holder=null;
        if (convertView==null){
           holder=new ViewHolder(context,layoutId,position);
        }else {
            holder= (ViewHolder) convertView.getTag();
            holder.mPosition=position;
        }
        return holder;
    }

    /**
     * set text
     * @return
     */
    public ViewHolder setText(int viewId,String text){
        TextView tv = (TextView) mConvertView.findViewById(viewId);
        tv.setText(text);
        return this;
    }

    /**
     * set bitmap
     * @param viewId
     * @param bitmap
     * @return
     */
    public ViewHolder setBitMap(int viewId, Bitmap bitmap){
        ImageView iv = (ImageView) mConvertView.findViewById(viewId);
        iv.setImageBitmap(bitmap);
        return this;
    }

    /**
     * set resImg
     * @param viewId
     * @param imgResource
     * @return
     */
    public ViewHolder setImageResource(int viewId,int imgResource){
        ImageView iv = (ImageView) mConvertView.findViewById(viewId);
        iv.setImageResource(imgResource);
        return this;
    }


}
