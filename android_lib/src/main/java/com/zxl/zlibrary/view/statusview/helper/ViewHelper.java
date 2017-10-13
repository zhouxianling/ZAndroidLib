package com.zxl.zlibrary.view.statusview.helper;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.zxl.zlibrary.view.statusview.holder.EmptyViewHolder;
import com.zxl.zlibrary.view.statusview.holder.ErrorViewHolder;
import com.zxl.zlibrary.view.statusview.holder.LoadingViewHolder;


/**
 * @author Xianling.Zhou
 * @since 2017/10/11
 */

public class ViewHelper {

    public static final int ERROR = 1;
    public static final int EMPTY = 2;
    public static final int LOADING = 3;


    public TextView getTvTip(int type, View view) {
        switch (type) {
            case ERROR:
                return ((ErrorViewHolder) view.getTag()).mTvTip;
            case EMPTY:
                return ((EmptyViewHolder) view.getTag()).mTvTip;
            case LOADING:
                return ((LoadingViewHolder) view.getTag()).mTvTip;
            default:
                return null;
        }
    }

    public ImageView getImg(int type, View view) {
        switch (type) {
            case ERROR:
                return ((ErrorViewHolder) view.getTag()).mIvImg;
            case EMPTY:
                return ((EmptyViewHolder) view.getTag()).mIvImg;
            default:
                return null;
        }
    }


}
