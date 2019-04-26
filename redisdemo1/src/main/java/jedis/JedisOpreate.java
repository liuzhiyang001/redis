package jedis;

import redis.clients.jedis.Jedis;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in  2019/4/25 16:08
 * @ Description：
 */
public class JedisOpreate {
    public static void main(String[] args) {
        Jedis jedis=null;
        try {
            jedis=new Jedis("127.0.0.1",6379);
            String setResult =jedis.set("hello","word1");
            String hello=jedis.get("hello");
            System.out.println(hello);
            System.out.println(setResult);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            jedis.close();
        }

    }

}
