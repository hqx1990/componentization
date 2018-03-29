package com.bestvike.app1;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.bestvike.common.base.BaseActivity;
import com.bestvike.common.utils.UiUtil;

public class MainApp1Activity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_app1);
        findViewById(R.id.textView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                UiUtil.toast("组件1");
            }
        });
        getDatas();
    }

    private void getDatas(){
        Bundle bundle = getIntent().getExtras();
        if(null != bundle){
            String tag = bundle.getString("tag");
            Log.e("---",tag);
        }
    }

    @Override
    protected void destroyPresenter() {

    }
}
