package com.lzy.spring;

import com.lzy.spring.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in  2019/5/6 16:45
 * @ Description：
 */
public class Application {
    public static void main(String[] args) {
       //ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        //ApplicationContext context=new ClassPathXmlApplicationContext("dao.xml");
       // ApplicationContext context=new ClassPathXmlApplicationContext("autoScan.xml");

  //      HelloWord helloWord=(HelloWord)context.getBean("helloWord");
   //     UserService userService=(UserService)context.getBean("userService");
  //      helloWord.printMassage();
   //     userService.printString();
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-redis.xml");
        RedisTemplate redisTemplate=(RedisTemplate)context.getBean("redisTemplate") ;
        //redisTemplate.opsForValue().set("hi","tom");
        Object string=redisTemplate.opsForValue().get("hi");
        System.out.println(string.toString());

    }
}
