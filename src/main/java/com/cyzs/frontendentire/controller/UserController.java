package com.cyzs.frontendentire.controller;

import com.cyzs.frontendentire.bean.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: xh
 * @create: 2020-04-08 17:01
 */
@RestController
public class UserController {

    @RequestMapping("/addUser")
    public User addUser(User user){
        return user;
    }
}
