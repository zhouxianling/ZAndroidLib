package com.zxl.zlibrary.view.statusview.holder;

import android.view.View;
import android.widget.FrameLayout;

import com.zxl.zlibrary.R;

/**
 * @author Xianling.Zhou
 * @since 2017/10/11
 */
public class LoadingViewHolder extends BaseHolder {

    public FrameLayout mFrameLayout;

    public LoadingViewHolder(View view) {
        mTvTip = view.findViewById(R.id.tv_message);
        mFrameLayout = view.findViewById(R.id.loading_layout);
    }


}
