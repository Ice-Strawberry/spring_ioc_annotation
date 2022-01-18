package com.wyy.controller;

import com.wyy.beans.Role;
import com.wyy.service.BaseService;
import com.wyy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * @author Wangyy
 * @version 1.0
 * @ClassName UserController
 * @Description TODO
 * @date 2022/1/17 15:14
 */
@Controller
public class UserController {

    /*
        使用@Autowired 来实现自动注入
        ·默认根据类型去匹配
        ·如果匹配到多个类型  则按照名字去匹配
        如果名字也没有匹配到会报错
                    1.修改属性的名字 对应bean的名字
                    2.可以修改bean的名字对应属性明字 @Service("userService")
                    3.可以再 @Autowired 下加上这个注解@Qualifier("userServiceImpl")设置属性的名字（覆盖原来属性名）
                    4.@Primary//设置自动注入的主要bean
                    5.使用泛型作为自动限定符
     */

    /*
     * @Description //TODO    @Resource@Autowired区别：
     *                 Resource 依赖jdk  @Autowired 依赖spring
     *                  Resource 优先根据名字匹配  @Autowired 优先根据类型匹配
     */
//    @Resource
    @Autowired
    UserService userService;



    /**
     * @Description //TODO  @Autowired 也可以写在方法上面
     * 默认有限根据参数类型匹配 同上
     * @param
     * @author Wangyy
     * @date 2022/1/18 16:36
     * @return void

    @Autowired
    public void  createUser(UserService userService ){
        this.userService=userService;
    }*/

    /*
    *

    @Autowired  //也可以写在构造器上面
    public UserController(UserService userService) {
        this.userService = userService;
    }
*/
    public void  getUser(){
        userService.getUser();
    }

}