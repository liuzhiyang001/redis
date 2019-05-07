package jedis;


import redis.clients.jedis.Jedis;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in  2019/4/25 16:08
 * @ Description：redis连接
 */
public class JedisOpreate {
    public static void main(String[] args) {
        Jedis jedis=null;
        try {
            jedis=new Jedis("192.168.116.128",6379);
            jedis.auth("123");
            String setResult =jedis.set("hello","word1");
            String hello=jedis.get("hello");
            System.out.println(hello);
            System.out.println(setResult);
        }catch (Exception e){//            //jedis=new Jedis("192.168.137.209",6379);
            e.printStackTrace();
        }finally {
            jedis.close();
        }

    }

}
