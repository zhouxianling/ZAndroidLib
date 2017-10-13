package com.zxl.zlibrary.view.statusview.helper;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ProgressBar;

import com.zxl.zlibrary.R;
import com.zxl.zlibrary.view.statusview.LStatusView;
import com.zxl.zlibrary.view.statusview.bean.EmptyItem;
import com.zxl.zlibrary.view.statusview.bean.ErrorItem;
import com.zxl.zlibrary.view.statusview.bean.LoadingItem;
import com.zxl.zlibrary.view.statusview.holder.EmptyViewHolder;
import com.zxl.zlibrary.view.statusview.holder.ErrorViewHolder;
import com.zxl.zlibrary.view.statusview.holder.LoadingViewHolder;


/**
 * @author Xianling.Zhou
 * @since 2017/10/11
 */

public class LayoutHelper {

    /**
     * 解析布局中的可选参数
     *
     * @param context
     * @param attrs
     * @param zStateView
     */
    public static void parseAttr(Context context, AttributeSet attrs, LStatusView zStateView) {
        TypedArray a = context.getTheme().obtainStyledAttributes(attrs, R.styleable.LStatusView, 0, 0);
        try {
            int errorImg = a.getResourceId(R.styleable.LStatusView_errorImg, -1);
            String errorText = a.getString(R.styleable.LStatusView_errorText);
            zStateView.setErrorItem(new ErrorItem(errorImg, errorText));

            int emptyImg = a.getResourceId(R.styleable.LStatusView_emptyImg, -1);
            String emptyText = a.getString(R.styleable.LStatusView_emptyText);
            zStateView.setEmptyItem(new EmptyItem(emptyImg, emptyText));


            String loadingText = a.getString(R.styleable.LStatusView_loadingText);
            zStateView.setLoadingItem(new LoadingItem(loadingText));
        } finally {
            a.recycle();
        }
    }

    /**
     * 获取初始的错误View
     *
     * @param layoutInflater 布局填充器
     * @param item           错误bean
     * @param layout         容器
     * @return 错误View
     */
    public static View getErrorView(LayoutInflater layoutInflater, ErrorItem item,
                                    final LStatusView layout) {
        View view = layoutInflater.inflate(R.layout.layout_error, null);
        if (item != null) {
            ErrorViewHolder holder = new ErrorViewHolder(view);
            view.setTag(holder);

            if (!TextUtils.isEmpty(item.getTip())) {
                holder.mTvTip.setText(item.getTip());
            }
            if (item.getResId() != -1) {
                holder.mIvImg.setImageResource(item.getResId());
            }

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (layout.getRefreshListener() != null) {
                        layout.getRefreshListener().refreshClick();
                    }
                }
            });
        }
        return view;
    }

    /**
     * 获取初始的加载View
     *
     * @param layoutInflater 布局填充器
     * @param item           加载bean
     * @return 加载View
     */
    public static View getLoadingView(LayoutInflater layoutInflater, LoadingItem item) {
        View view = layoutInflater.inflate(R.layout.layout_loading, null);
        if (item != null) {
            LoadingViewHolder holder = new LoadingViewHolder(view);
            view.setTag(holder);

            ProgressBar progressBar = new ProgressBar(view.getContext());
            holder.mFrameLayout.addView(progressBar);

            if (!TextUtils.isEmpty(item.getTip())) {
                holder.mTvTip.setText(item.getTip());
            }
        }
        return view;
    }

    /**
     * 获取初始的空数据View
     *
     * @param layoutInflater 布局填充器
     * @param item           空数据bean
     * @return 空数据View
     */
    public static View getEmptyView(LayoutInflater layoutInflater, EmptyItem item) {
        View view = layoutInflater.inflate(R.layout.layout_empty, null);
        if (item != null) {
            EmptyViewHolder holder = new EmptyViewHolder(view);
            view.setTag(holder);

            if (!TextUtils.isEmpty(item.getTip())) {
                holder.mTvTip.setText(item.getTip());
            }
            if (item.getResId() != -1) {
                holder.mIvImg.setImageResource(item.getResId());
            }
        }
        return view;
    }


}
