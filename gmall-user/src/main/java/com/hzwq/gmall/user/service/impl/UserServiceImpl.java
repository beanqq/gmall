package com.hzwq.gmall.user.service.impl;

import com.hzwq.gmall.user.bean.UmsMember;
import com.hzwq.gmall.user.mapper.UmsMemberMapper;
import com.hzwq.gmall.user.mapper.UserMapper;
import com.hzwq.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;



    @Autowired
    UmsMemberMapper umsMemberMapper;

    @Override
    public List<UmsMember> findAll() {
        List<UmsMember> umsMembers = umsMemberMapper.selectAll();
        return umsMembers;

    }
}
