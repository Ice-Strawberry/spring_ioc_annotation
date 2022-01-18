package com.wyy.dao.impl;

import com.wyy.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @author Wangyy
 * @version 1.0
 * @ClassName UserDaoImpl
 * @Description TODO
 * @date 2022/1/17 15:17
 */
@Repository
public class UserDaoImpl implements UserDao {
    public void getUser() {
        System.out.println("查询数据库");
    }
}