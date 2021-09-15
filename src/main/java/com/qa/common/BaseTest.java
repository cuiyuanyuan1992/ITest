package com.qa.common;

/**
 * 基础用例类，用于用例继承进行通用操作处理,如登陆
 */
public class BaseTest extends InitEnv{

    public static String cookie ;//如公共cookie，接口常用参数

    static {
        cookie = login(properties.getProperty("userName"),properties.getProperty("password"));
    }

    private static String login(String userName,String password){
        // 请求登陆接口获取cookie
        return "123456";
    }

}
