package com.bestvike.common.base;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.bestvike.common.interfaces.DialogListener;
import com.bestvike.common.utils.CheckUtil;
import com.bestvike.common.utils.ShowDialog;

/**
 * Created by use on 2018/3/14.
 */
public abstract class BaseActivity extends Activity implements View.OnClickListener{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onClick(View view) {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        try{
            destroyPresenter();
        }catch (Exception e){}
    }

    /**
     * 用于销毁presenter
     */
    protected abstract void destroyPresenter();

    /**
     * 只有一个按钮的提示框
     * @param str
     */
    public void showDialog(String str){
        ShowDialog.getInstance().showDialog(this, str, true, new DialogListener() {
            @Override
            public void dialogCallBack(final AlertDialog dialog, TextView left, TextView right) {
                left.setVisibility(View.GONE);
                right.setText("知道了");
                right.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
            }
        });
    }

    /**
     * 含有两个按钮的提示框
     * @param str
     * @param listener
     */
    public void showDialog(String str , DialogListener listener){
        ShowDialog.getInstance().showDialog(this,str,true,listener);
    }

    /**
     * 两个按钮的提示
     * @param str
     * @param isTitle  title 是否展示 。f 不含有title , t 含有title
     * @param listener
     */
    public void showDialog(String str , boolean isTitle , DialogListener listener){
        ShowDialog.getInstance().showDialog(this,str,isTitle,listener);
    }
    /**
     * 菊花
     */
    public void showProgress(boolean flag){
        ShowDialog.getInstance().showProgress(flag,"",this);
    }

    /**
     * 含有提示语的菊花
     * @param flag
     * @param str
     */
    public void showProgress(boolean flag,String str){
        ShowDialog.getInstance().showProgress(flag,str,this);
    }


    /**
     * 有回调的activity
     * @param url
     */
    public void toActivity(String url,Bundle bundle){

    }
}
