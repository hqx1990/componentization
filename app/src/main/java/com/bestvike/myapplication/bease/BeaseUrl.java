package com.bestvike.myapplication.bease;

/**
 * Created by use on 2018/3/8.
 */

public class BeaseUrl {

    /**
     * 测试环境
     * add on 2017.12.12
     */
//    public static final String baseUrl = "http://10.164.194.123:9000/";//测试环境
    /**
     * 封测环境
     * add on 2017.12.12
     */
    public static final String baseUrl = "https://testpm.haiercash.com/";//封测环境


    //6.35.	(GET)字典项查询
    public static final String URL_GETDICT = "app/appserver/cmis/getDict";


    //1.1.1.APP广告查询接口(免token)
    public static final String URL_GET_ADVERTISE = "app/appserver/ad/getAdInfoCheck";
    //6.102.(GET) 系统参数列表查询
    public static final String URL_SELECT_BY_PARAMS = "app/appserver/appmanage/param/selectByParams";


    /**
     * 不需要token的接口
     */

}
