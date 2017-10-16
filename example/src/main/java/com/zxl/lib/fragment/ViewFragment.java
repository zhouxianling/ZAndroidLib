package com.zxl.lib.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.zxl.lib.R;
import com.zxl.lib.activity.StatusViewActivity;
import com.zxl.lib.activity.TitleBarActivity;
import com.zxl.lib.adapter.MyAdapter;
import com.zxl.zlibrary.tool.LActivityAnimator;
import com.zxl.zlibrary.tool.LToast;
import com.zxl.zlibrary.view.LTitleBarView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * @author Xianling.Zhou
 * @since 2017/10/14
 */

public class ViewFragment extends Fragment implements BaseQuickAdapter.OnItemClickListener {

    @BindView(R.id.titleBar)
    LTitleBarView titleBar;
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    Unbinder unbinder;
    private MyAdapter mAdapter;

    public static ViewFragment newInstance() {
        ViewFragment fragment = new ViewFragment();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_view, container, false);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initData();
    }

    private void initData() {
        List<String> mData = new ArrayList<>();
        mData.add("通用标题控件LTitleBarView");
        mData.add("页面状态控件LStatusView");

        mAdapter = new MyAdapter(mData);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(mAdapter);
        mAdapter.setOnItemClickListener(this);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @Override
    public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
        switch (position) {
            //通用标题
            case 0:
                LToast.normal("啦啦");
                startActivity(new Intent(getContext(), TitleBarActivity.class));
                LActivityAnimator.PullRightPushLeft(getActivity());
                break;
            //页面状态
            case 1:
                startActivity(new Intent(getContext(), StatusViewActivity.class));
                LActivityAnimator.PullRightPushLeft(getActivity());
                break;
            default:

                break;
        }
    }
}
