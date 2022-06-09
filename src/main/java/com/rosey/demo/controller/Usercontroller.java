package com.rosey.demo.controller;


import com.rosey.demo.entity.User;
import com.rosey.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class Usercontroller {


    @Resource
    private UserMapper userMapper;

    @GetMapping("/user")
    public List<User> index(){
        return userMapper.findAll();
    }
}
