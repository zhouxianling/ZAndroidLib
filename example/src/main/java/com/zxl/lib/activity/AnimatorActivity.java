package com.zxl.lib.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.zxl.lib.R;
import com.zxl.zlibrary.tool.LActivityAnimator;
import com.zxl.zlibrary.view.LTitleBarView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @author Xianling.Zhou
 * @since 2017/10/17
 */

public class AnimatorActivity extends AppCompatActivity {

    @BindView(R.id.titleBar)
    LTitleBarView titleBar;
    @BindView(R.id.btn1)
    Button btn1;
    @BindView(R.id.btn2)
    Button btn2;
    @BindView(R.id.btn3)
    Button btn3;
    @BindView(R.id.btn4)
    Button btn4;
    @BindView(R.id.btn5)
    Button btn5;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animator);
        ButterKnife.bind(this);

        titleBar.setLeftIconOnClickListener(view -> finish());
    }

    @OnClick({R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4, R.id.btn5})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                startActivity(new Intent(this, TestActivity.class));
                LActivityAnimator.flipHorizontalAnimation(this);
                break;
            case R.id.btn2:
                startActivity(new Intent(this, TestActivity.class));
                LActivityAnimator.fadeAnimation(this);
                break;
            case R.id.btn3:
                startActivity(new Intent(this, TestActivity.class));
                LActivityAnimator.disappearBottomRightAnimation(this);
                break;
            case R.id.btn4:
                startActivity(new Intent(this, TestActivity.class));
                LActivityAnimator.appearBottomRightAnimation(this);
                break;
            case R.id.btn5:
                startActivity(new Intent(this, TestActivity.class));
                LActivityAnimator.unzoomAnimation(this);
                break;
        }
    }
}
