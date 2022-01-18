package com.wyy.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Wangyy
 * @version 1.0
 * @ClassName Role
 * @Description TODO
 * @date 2022/1/17 16:27
 */
@Component
//@DependsOn("user")  // 严格来说并不是控制加载顺序是user 依赖Role所以先加载user  后加载role  depends-on
//@Lazy  //只有使用时才会加载  lazy-init
//@Scope("prototype")  //默认singleton 单例   prototype
public class Role {

    @Value("管理员")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role() {
        System.out.println("Role已加载");
    }
    //生命周期回调 初始回调
    @PostConstruct
    public void init(){
        System.out.println("初始化");
    }
    //生命周期回调 销毁回调
    @PreDestroy
    public void destory(){
        System.out.println("销毁");
    }
}