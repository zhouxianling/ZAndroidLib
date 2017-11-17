package com.zxl.lib.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.zxl.lib.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author Xianling.Zhou
 * @since 2017/10/17
 */

public class TestActivity extends AppCompatActivity {



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        ButterKnife.bind(this);
    }
}
