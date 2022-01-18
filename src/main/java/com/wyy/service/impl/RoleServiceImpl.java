package com.wyy.service.impl;

import com.wyy.beans.Role;
import com.wyy.dao.UserDao;
import com.wyy.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Wangyy
 * @version 1.0
 * @ClassName UserServiceImpl
 * @Description TODO
 * @date 2022/1/17 15:16
 */
@Service
public class RoleServiceImpl implements BaseService<Role> {


    @Autowired
    UserDao userDao;
    public Role getUser() {
        System.out.println("RoleServiceImpl");
        userDao.getUser();return null;
    }
}