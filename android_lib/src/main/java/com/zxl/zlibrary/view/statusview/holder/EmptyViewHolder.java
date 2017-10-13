package com.zxl.zlibrary.view.statusview.holder;

import android.view.View;
import android.widget.ImageView;

import com.zxl.zlibrary.R;

/**
 * @author Xianling.Zhou
 * @since 2017/10/11
 */

public class EmptyViewHolder extends BaseHolder {
    public ImageView mIvImg;

    public EmptyViewHolder(View view) {
        mTvTip = view.findViewById(R.id.tv_message);
        mIvImg = view.findViewById(R.id.iv_img);
    }





}
