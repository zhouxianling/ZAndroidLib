package com.zxl.lib.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.zxl.lib.R;
import com.zxl.zlibrary.tool.LToast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @author Xianling.Zhou
 * @since 2017/10/17
 */

public class LToastActivity extends AppCompatActivity {


    @BindView(R.id.btn_normal)
    Button btnNormal;
    @BindView(R.id.btn_error)
    Button btnError;
    @BindView(R.id.btn_success)
    Button btnSuccess;
    @BindView(R.id.btn_warn)
    Button btnWarn;
    @BindView(R.id.btn_info)
    Button btnInfo;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ltoast);
        ButterKnife.bind(this);


    }

    @OnClick({R.id.btn_normal, R.id.btn_error, R.id.btn_warn, R.id.btn_info, R.id.btn_success})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_normal:
                LToast.normal("啦啦");
                break;
            case R.id.btn_success:
                LToast.success("啦啦");
                break;
            case R.id.btn_error:
                LToast.error("啦啦");
                break;
            case R.id.btn_warn:
                LToast.warning("啦啦");
                break;
            case R.id.btn_info:
                LToast.info("啦啦");
                break;
        }
    }
}
