package com.qa.test;

import com.alibaba.fastjson.JSONObject;
import com.qa.common.BaseTest;
import com.qa.http.service.TestService;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * 用例类一般与开发的接口类对应，覆盖接口类下的接口用例
 */
public class DemoTest1 extends BaseTest {

    @Test
    public void testcase1(){
        System.out.println("testcase1：这是一个测试不通过的case");
        System.out.println("username："+properties.getProperty("username"));
        Assert.assertTrue(false);
    }
    @Test
    public void testcase2(){
        System.out.println("testcase2：这是一个测试通过的case");
        TestService testService = new TestService();
        String response = testService.getById("123456",cookie);
        JSONObject jsonObject = JSONObject.parseObject(response);
        Assert.assertEquals("302",jsonObject.getString("code"));
        Assert.assertEquals("未登录",jsonObject.getString("msg"));
        Assert.assertFalse(jsonObject.getBoolean("success"));
    }
}
