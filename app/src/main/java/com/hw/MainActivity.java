package com.hw;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

import com.hw.main.CHFragment;
import com.hw.main.MyFragment;
import com.hw.main.XHFragment;
import com.hw.main.ZHFragment;

public class MainActivity extends FragmentActivity {
    private FragmentTabHost mFragmentTabHost;
    private String[] tabNames = {"吃", "住", "行", "我的"};
    private Class[] fragments = {CHFragment.class, ZHFragment.class, XHFragment.class, MyFragment.class};
    private int[] tabIco = {R.drawable.tab_eat, R.drawable.tab_zhu, R.drawable.work, R.drawable.my};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
    }

    protected void initView() {
        setContentView(R.layout.activity_main);
        mFragmentTabHost = (FragmentTabHost) findViewById(R.id.fragmentTabHost);
        mFragmentTabHost.setup(this, getSupportFragmentManager(), android.R.id.tabcontent);
        mFragmentTabHost.getTabWidget().setDividerDrawable(null);
        addTab(tabNames);
    }

    private void addTab(String[] tabNames) {
        for (int i = 0; i < tabNames.length; i++) {
            View v = getLayoutInflater().inflate(R.layout.main_tab_layout, null, false);
            TextView tabName = (TextView) v.findViewById(R.id.tab_name);
            ImageView imageView = (ImageView) v.findViewById(R.id.tab_icon);
            tabName.setText(tabNames[i]);
            imageView.setBackgroundResource(tabIco[i]);
            TabHost.TabSpec tab = mFragmentTabHost.newTabSpec(tabNames[i]).setIndicator(v);
            mFragmentTabHost.addTab(tab, fragments[i], null);
        }
    }

   
}
