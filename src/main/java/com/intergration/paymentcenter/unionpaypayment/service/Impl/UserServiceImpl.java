package com.intergration.paymentcenter.unionpaypayment.service.Impl;

import com.intergration.paymentcenter.unionpaypayment.dao.UserMapper;
import com.intergration.paymentcenter.unionpaypayment.entity.User;
import com.intergration.paymentcenter.unionpaypayment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUser(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
