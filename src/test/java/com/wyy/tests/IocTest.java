package com.wyy.tests;

import com.wyy.beans.Role;
import com.wyy.beans.User;
import com.wyy.controller.UserController;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Wangyy
 * @version 1.0
 * @ClassName IocTest
 * @Description TODO
 * @date 2022/1/17 15:19
 */
public class IocTest {
    ClassPathXmlApplicationContext ioc;
    @Before
    public  void  before(){
        ioc=new ClassPathXmlApplicationContext("spring_ioc.xml");
    }
    @Test
    public  void test01(){
        //实例化  读取配置文件

//        UserController userController = ioc.getBean("userController",UserController.class);
//        System.out.println(userController);
        UserController userController = ioc.getBean("userController",UserController.class);
        System.out.println(userController);
    }

    @Test
    public  void test02(){
        User user = ioc.getBean(User.class);
        System.out.println(user.getName());
    }

    @Test
    public  void test03(){
        UserController bean = ioc.getBean(UserController.class);
        bean.getUser();
    }
    @Test
    public  void test04(){
        Role bean=ioc.getBean(Role.class);
        Role bean1=ioc.getBean(Role.class);
        Role bean2=ioc.getBean(Role.class);
    }
    @Test
    public  void test05(){
        Role bean=ioc.getBean(Role.class);
        ioc.close();//容器关闭时销毁
    }
}