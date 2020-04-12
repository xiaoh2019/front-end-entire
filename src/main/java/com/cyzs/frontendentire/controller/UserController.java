package com.cyzs.frontendentire.controller;

import com.cyzs.frontendentire.bean.User;
import com.cyzs.frontendentire.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description:
 * @author: xh
 * @create: 2020-04-08 17:01
 */
@RestController
public class UserController {

    @Autowired
    UserRepo userRepo;

    @RequestMapping("/addUser")
    public User addUser(User user){
        return user;
    }

    @PostMapping("/findUser")
    public Page<User> findUser(Integer pageNum, Integer size){
        PageRequest pageRequest = PageRequest.of(pageNum, size);
        Page<User> all = userRepo.findAll(pageRequest);
        return all;
    }
}
