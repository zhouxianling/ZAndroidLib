package com.zxl.lib.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.zxl.lib.R;
import com.zxl.zlibrary.tool.LToast;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author Xianling.Zhou
 * @since 2017/10/14
 */

public class TitleBarActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_titlebar);
        ButterKnife.bind(this);
        initData();
    }

    private void initData() {

    }
}
