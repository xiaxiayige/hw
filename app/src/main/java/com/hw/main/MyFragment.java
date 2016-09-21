package com.hw.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hw.R;

/**
 * [description about this class]
 *
 * @author zhangqil
 * @DATE 2016-09-21 10:49
 * @copyright Copyright 2010 RD information technology Co.,ltd.. All Rights Reserved.
 */
public class MyFragment extends Fragment {
    public static final String TABNAME = "tabName";
    private View rootView;
    private TextView temp_tabName;

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        temp_tabName = (TextView) rootView.findViewById(R.id.temp_tabName);
        temp_tabName.setText("我的");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fratment_hc, container, false);
        return rootView;
    }
}

