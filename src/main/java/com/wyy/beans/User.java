package com.wyy.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Wangyy
 * @version 1.0
 * @ClassName User
 * @Description TODO
 * @date 2022/1/17 15:39
 */
//  一般不会在实体类注册为一个bean
@Component
public class User {

    /*
     *
     使用@Value  设置依赖的属性
    1.除了可以写硬编码值  @Value("aaa")
    * 2.还可以写${}、#{}
    * @Value("${mysql.name}")
    *     @Value("#{role.name}")
    *
    * */
//    @Value("#{role.name}")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User() {
        System.out.println("User已加载");
    }
}