package com.zxl.lib.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.zxl.lib.R;
import com.zxl.zlibrary.tool.LToast;
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
    @BindView(R.id.titleBar3)
    LTitleBarView titleBar3;
    @BindView(R.id.titleBar4)
    LTitleBarView titleBar4;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_titlebar);
        ButterKnife.bind(this);
        initData();
    }

    private void initData() {
        titleBar1.setLeftIconOnClickListener(view -> finish());

        titleBar2.setLeftIconOnClickListener(view -> LToast.normal("icon"));
        titleBar2.setLeftTextOnClickListener(view -> LToast.normal("text"));

        titleBar2.setRightIconOnClickListener(view -> LToast.normal("icon"));
        titleBar2.setRightTextOnClickListener(view -> LToast.normal("text"));

    }
}
