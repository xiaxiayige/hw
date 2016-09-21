package com.hw.baselib.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.FrameLayout;

import com.hw.baselib.R;

/**
 * [description about this class]
 *
 * @author zhangqil
 * @DATE 2016-09-20 16:50
 * @copyright Copyright 2010 RD information technology Co.,ltd.. All Rights Reserved.
 */
public abstract class BaseActivity extends FragmentActivity {
    private FrameLayout content;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
    }


    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(R.layout.base_activity_layout);
        _initViews();
        addContentView(getLayoutInflater().inflate(layoutResID, null, false));
    }

    protected abstract void initView();

    @Override
    public void setContentView(View view) {
        super.setContentView(R.layout.base_activity_layout);
        _initViews();
        addContentView(view);
    }

    protected void _initViews() {
        content = $(R.id.content);
    }

    private void addContentView(View contentView) {
        content.addView(contentView);
    }

    public <T extends View> T $(int resId) {
        return (T) findViewById(resId);
    }


}
