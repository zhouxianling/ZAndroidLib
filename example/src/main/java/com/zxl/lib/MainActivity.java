package com.zxl.lib;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.zxl.lib.adapter.MyViewPagerAdapter;
import com.zxl.lib.fragment.TestFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import me.majiajie.pagerbottomtabstrip.MaterialMode;
import me.majiajie.pagerbottomtabstrip.NavigationController;
import me.majiajie.pagerbottomtabstrip.PageNavigationView;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.viewPager)
    ViewPager viewPager;
    @BindView(R.id.tab)
    PageNavigationView tab;


    private NavigationController mController;
    private List<Fragment> fragments;
    private MyViewPagerAdapter viewPagerAdapter;

    int[] testColors = {0xFF455A64, 0xFF00796B, 0xFF795548, 0xFF5B4947, 0xFFF57C00};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initView();

    }

    private void initView() {
        fragments = new ArrayList<>();
        fragments.add(TestFragment.newInstance());
        fragments.add(TestFragment.newInstance());
        fragments.add(TestFragment.newInstance());
        fragments.add(TestFragment.newInstance());

        //这里可以设置样式模式，总共可以组合出4种效果
        mController = tab.material()
                .addItem(R.mipmap.ic_launcher, "View", testColors[0])
                .addItem(R.mipmap.ic_launcher, "Tool", testColors[1])
                .addItem(R.mipmap.ic_launcher, "其他", testColors[2])
                .addItem(R.mipmap.ic_launcher, "设置", testColors[3])
                .setDefaultColor(0x89FFFFFF)//未选中状态的颜色
                .setMode(MaterialMode.CHANGE_BACKGROUND_COLOR | MaterialMode.HIDE_TEXT)//这里可以设置样式模式，总共可以组合出4种效果
                .build();

        viewPagerAdapter = new MyViewPagerAdapter(getSupportFragmentManager(), fragments);

        viewPager.setAdapter(viewPagerAdapter);
        mController.setupWithViewPager(viewPager);
        fragments = new ArrayList<>();
        fragments.add(TestFragment.newInstance());
        fragments.add(TestFragment.newInstance());
        fragments.add(TestFragment.newInstance());
        fragments.add(TestFragment.newInstance());

        //这里可以设置样式模式，总共可以组合出4种效果
        mController = tab.material()
                .addItem(R.mipmap.ic_launcher, "View", testColors[0])
                .addItem(R.mipmap.ic_launcher, "Tool", testColors[1])
                .addItem(R.mipmap.ic_launcher, "其他", testColors[2])
                .addItem(R.mipmap.ic_launcher, "设置", testColors[3])
                .setDefaultColor(0x89FFFFFF)//未选中状态的颜色
                .setMode(MaterialMode.CHANGE_BACKGROUND_COLOR | MaterialMode.HIDE_TEXT)//这里可以设置样式模式，总共可以组合出4种效果
                .build();

        viewPagerAdapter = new MyViewPagerAdapter(getSupportFragmentManager(), fragments);

        viewPager.setAdapter(viewPagerAdapter);
        mController.setupWithViewPager(viewPager);

    }


}
