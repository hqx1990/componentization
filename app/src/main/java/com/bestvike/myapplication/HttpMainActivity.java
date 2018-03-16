package com.bestvike.myapplication;

import android.app.AlertDialog;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.bestvike.common.base.BaseActivity;
import com.bestvike.common.interfaces.DialogListener;
import com.bestvike.common.utils.PublicData;
import com.bestvike.common.utils.UiUtil;


/**
 * Created by use on 2018/3/7.
 * hqx
 * 网络请求测试
 */

public class HttpMainActivity extends BaseActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.httpmainactivity);
        findViewById(R.id.textView1).setOnClickListener(this);
        findViewById(R.id.textView2).setOnClickListener(this);
        findViewById(R.id.textView3).setOnClickListener(this);
        findViewById(R.id.textView4).setOnClickListener(this);
        findViewById(R.id.textView5).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.textView1:
                Log.e("----------","组件1");
                showDialog("组件1", false, new DialogListener() {
                    @Override
                    public void dialogCallBack(final AlertDialog dialog, TextView left, TextView right) {
                        left.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                UiUtil.toast("取消");
                                dialog.dismiss();
                            }
                        });
                        right.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                dialog.dismiss();
                                Bundle bundle = new Bundle();
                                bundle.putString("tag","路由传输数据");
                                toActivity(PublicData.toMainApp1Activity,bundle);

                            }
                        });
                    }
                });

                break;

            case R.id.textView2:
                showDialog("组件2");
                break;

            case R.id.textView3:
                showDialog("组件3", new DialogListener() {
                    @Override
                    public void dialogCallBack(final AlertDialog dialog, TextView left, TextView right) {
                        left.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                UiUtil.toast("取消");
                                dialog.dismiss();
                            }
                        });
                        right.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                dialog.dismiss();
                                UiUtil.toast("取消");
                            }
                        });
                    }
                });
                break;

            case R.id.textView4:
                showProgress(true);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        showProgress(false);
                    }
                },5000);
                break;

            case R.id.textView5:
                showProgress(true,"请稍后。。。");
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        showProgress(false);
                    }
                },5000);
                break;
        }
    }

    @Override
    protected void destroyPresenter() {

    }
}
