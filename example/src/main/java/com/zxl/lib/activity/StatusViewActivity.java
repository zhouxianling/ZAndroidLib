package com.zxl.lib.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.zxl.lib.R;
import com.zxl.zlibrary.view.statusview.LStatusView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @author Xianling.Zhou
 * @since 2017/10/14
 */

public class StatusViewActivity extends AppCompatActivity {

    @BindView(R.id.statusView)
    LStatusView statusView;

    @BindView(R.id.btn_loading)
    Button btnLoading;
    @BindView(R.id.btn_empty)
    Button btnEmpty;
    @BindView(R.id.btn_error)
    Button btnFail;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statusview);
        ButterKnife.bind(this);
        initData();
    }

    private void initData() {
        statusView.onLoadingView();


        statusView.setOnViewRefreshListener(() -> {
            statusView.onLoadingView();
        });
    }

    @OnClick({R.id.btn_loading, R.id.btn_empty, R.id.btn_error})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_loading:
                statusView.onLoadingView();
                break;
            case R.id.btn_empty:
                statusView.onEmptyView();
                break;
            case R.id.btn_error:
                statusView.onErrorView();
                break;
        }
    }
}
