package com.lzy.spring.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in  2019/5/6 16:54
 * @ Description：
 */
@Repository
public class User {

    @Value("得志")
    private String name;
    @Value("18")
    private String age;
    @Value("未知")
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


    public void printString() {
        System.out.println("User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                '}');

    }
}
