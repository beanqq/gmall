package com.hzwq.gmall.user.controller;

import com.hzwq.gmall.user.bean.UmsMember;
import com.hzwq.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/user")
public class UserController {

  @Autowired
  UserService userService;


    /**
     * 查询用户
     * @return
     */
    @RequestMapping("/findAll")
  public List<UmsMember> findAll(){
      return userService.findAll();

  }


    @RequestMapping("/index")
    public String index(){
        return "Hello world!";
    }
}
