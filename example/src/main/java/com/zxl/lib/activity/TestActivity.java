package com.zxl.lib.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.zxl.lib.R;
import com.zxl.zlibrary.tool.LActivityAnimator;
import com.zxl.zlibrary.view.LTitleBarView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author Xianling.Zhou
 * @since 2017/10/17
 */

public class TestActivity extends AppCompatActivity {

    @BindView(R.id.titleBar)
    LTitleBarView titleBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        ButterKnife.bind(this);

        titleBar.setLeftIconOnClickListener(view -> finish());
    }
}
