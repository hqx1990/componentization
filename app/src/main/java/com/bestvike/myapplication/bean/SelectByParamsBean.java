package com.bestvike.myapplication.bean;

/**
 * Created by use on 2018/3/8.
 */

public class SelectByParamsBean {
    public String	sysTyp;//系统标识
    public String	paramCode;//参数代码
    public String	paramName;//参数名称
    public String	paramValue;//参数值

    public String getSysTyp() {
        return sysTyp;
    }

    public void setSysTyp(String sysTyp) {
        this.sysTyp = sysTyp;
    }

    public String getParamCode() {
        return paramCode;
    }

    public void setParamCode(String paramCode) {
        this.paramCode = paramCode;
    }

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public String getParamValue() {
        return paramValue;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
    }
}
