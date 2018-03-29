package com.bestvike.myapplication.bease;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.bestvike.common.base.BaseActivity;
import com.bestvike.myapplication.R;

/**
 * Created by Administrator on 2018/3/29.
 */

public class ToARouterActivity extends BaseActivity {
    @Override
    protected void destroyPresenter() {

    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toarouteractivity);
    }
}
