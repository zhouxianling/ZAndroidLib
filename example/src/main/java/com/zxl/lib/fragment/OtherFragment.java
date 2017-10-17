package com.zxl.lib.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zxl.lib.R;

/**
 * @author Xianling.Zhou
 * @since 2017/10/14
 */

public class OtherFragment extends Fragment {


    public static OtherFragment newInstance() {
        OtherFragment fragment = new OtherFragment();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_other, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initData();
    }

    private void initData() {
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

}
