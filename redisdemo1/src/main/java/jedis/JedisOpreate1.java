package jedis;

import redis.clients.jedis.Jedis;

import java.util.List;
import java.util.Set;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in  2019/4/25 16:08
 * @ Description：redis连接
 */
public class JedisOpreate1 {
//    public static void main(String[] args) {
//        Jedis jedis=null;
//        try {
//            jedis=new Jedis("192.168.116.128",6379);
//            //jedis=new Jedis("192.168.137.209",6379);
//            jedis.auth("123");
//            jedis.flushAll();
//            //jedis.flushDB();
//            //返回OK
//            String setResult =jedis.set("hello","word");
//            //word
//            String hello=jedis.get("hello");
//            jedis.set("counter","5");
//            //结果为1
//            jedis.incr("counter");//若设置counter，则在counter基础上加1，否则从0加1
//
//            //hash部分
//            jedis.hset("myhash","f1","哈哈");
//            jedis.hset("myhash","f2","v2");
//            //{f2=v2, f1=v1}
//            jedis.hgetAll("myhash");
//            // list部分
//            jedis.rpush("mylist","1");
//            jedis.rpush("mylist","2");
//            jedis.rpush("mylist","3");
//            //[1, 2, 3]
//            List str=jedis.lrange("mylist",0,-1);
//
//            System.out.println(str);
//            //System.out.println(str.toArray().toString());
//            //set部分
//            jedis.sadd("myset","a");
//            jedis.sadd("myset","b");
//            jedis.sadd("myset","a");
//
//            //[b, a]
//            Set set=jedis.smembers("myset");
//            //zset部分
//            jedis.zadd("myzset",99,"tom");
//            jedis.zadd("myzset",66,"peter");
//            jedis.zadd("myzset",33,"redis");
//            jedis.zadd("myzset",52,"java");
//            //[[redis,33.0], [java,52.0], [peter,66.0], [tom,99.0]]
//            Set zset=jedis.zrangeWithScores("myzset",0,-1);
//            System.out.println(zset);
//        }catch (Exception e){
//            e.printStackTrace();
//        }finally {
//            jedis.close();
//        }
//
//    }

}
