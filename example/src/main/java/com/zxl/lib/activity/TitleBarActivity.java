package com.zxl.lib.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.zxl.lib.R;
import com.zxl.zlibrary.view.LTitleBarView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author Xianling.Zhou
 * @since 2017/10/14
 */

public class TitleBarActivity extends AppCompatActivity {

    @BindView(R.id.titleBar1)
    LTitleBarView titleBar1;
    @BindView(R.id.titleBar2)
    LTitleBarView titleBar2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_titlebar);
        ButterKnife.bind(this);
        initData();
    }

    private void initData() {
        titleBar1.setLeftIconOnClickListener(view -> finish());
    }
}
