package com.cyzs.frontendentire.controller;

import com.cyzs.frontendentire.bean.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author xh
 * @create 2020-03-18 12:07
 */
@RestController
public class HelloController {

    /**
     *  hello测试
     * @return 字符串
     */
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public String hello(){
        return "hello";
    }

    /**
     * 测试返回json数据
     * @return user
     */
    @RequestMapping(value = "/getJson", method = RequestMethod.GET)
    @ResponseBody
    public User getJson(){
        User user = new User();
        user.setName("王二");
        user.setAge(18);
        return user;
    }
}
