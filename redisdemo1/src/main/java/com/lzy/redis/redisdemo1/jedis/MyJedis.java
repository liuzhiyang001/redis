package com.lzy.redis.redisdemo1.jedis;

import redis.clients.jedis.Jedis;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in 19:49 2019/4/25
 * @ Description：${description}
 * @ Modified By：
 * @Version: $version$
 */
public class MyJedis {
    public static void main(String[] args) {
        Jedis jedis=null;
        try{
            jedis=new Jedis("127.0.0.1",6379);
            jedis.set("hello","word");
            String hello=jedis.get("hello");
            System.out.println(hello);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            jedis.close();
        }
    }
}
