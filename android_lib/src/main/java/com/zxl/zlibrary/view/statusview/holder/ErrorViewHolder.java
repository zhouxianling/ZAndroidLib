package com.zxl.zlibrary.view.statusview.holder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.zxl.zlibrary.R;

/**
 * @author Xianling.Zhou
 * @since 2017/10/11
 */
public class ErrorViewHolder extends BaseHolder {

    public ImageView mIvImg;

    public ErrorViewHolder(View view) {
        mTvTip = view.findViewById(R.id.tv_message);
        mIvImg = view.findViewById(R.id.iv_img);
    }



}
