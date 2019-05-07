package com.lzy.spring.service;

import com.lzy.spring.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in  2019/5/6 16:57
 * @ Description：
 */
@Service
public class UserService {


    @Autowired
    private User user;

    public void setUser(User user) {
        this.user = user;
    }

    public void printString(){
        System.out.println("我是"+user.getName()+"，今年"+user.getAge()+"岁，性别："+user.getSex());
    }

    public UserService() {
    }

    public UserService(User user) {
        this.user = user;
    }
}
