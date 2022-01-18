package com.wyy.service.impl;

import com.wyy.beans.User;
import com.wyy.dao.UserDao;
import com.wyy.service.BaseService;
import com.wyy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author Wangyy
 * @version 1.0
 * @ClassName UserServiceImpl
 * @Description TODO
 * @date 2022/1/17 15:16
 */
@Service
@Primary//设置自动注入的主要bean
public class UserServiceImpl implements UserService {


    @Autowired
    UserDao userDao;
    public void getUser() {
        System.out.println("UserServiceImpl");
        userDao.getUser();
    }
}