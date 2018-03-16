package com.bestvike.common.utils;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.WindowManager;
import android.widget.Toast;

import com.bestvike.common.base.BaseApplication;

public class UiUtil {

    /**
     * 单例Toast
     * <p>
     * toast禁止用于网络请求返回时的提示，因为用户可能看不到
     */
    public static Toast mToast;

    public static void toast(String msg) {
        if (mToast == null) {
            mToast = Toast.makeText(BaseApplication.CONTEXT, "", Toast.LENGTH_SHORT);
        }
        mToast.setText(msg);
        mToast.show();
    }

    /**
     * dip 转换成 px
     *
     * @param dip
     * @return
     */
    public static float dip2px(Activity activity , float dip) {
        DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dip, displayMetrics);
    }

    /**
     *  透明导航栏 防止虚拟键盘顶起 压缩图片
     */
    public static void TransparentNavigationBar(Activity activity){
        activity.getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
    }

    /**
     * @param dip
     * @param complexUnit {@link TypedValue#COMPLEX_UNIT_DIP} {@link TypedValue#COMPLEX_UNIT_SP}}
     * @return
     */
    public static float toDimension(Activity activity,float dip, int complexUnit) {
        DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
        return TypedValue.applyDimension(complexUnit, dip, displayMetrics);
    }
}