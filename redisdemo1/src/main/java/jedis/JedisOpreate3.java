package jedis;

import jedis.pojo.User;
import jedis.tool.ProtostuffSerializer;
import redis.clients.jedis.Jedis;


/**
 * @ Author     ：lzy
 * @ Date       ：Created in  2019/4/25 16:08
 * @ Description：redis连接
 */
public class JedisOpreate3 {

    public static void main(String[] args) {
        ProtostuffSerializer protostuffSerializer = new ProtostuffSerializer();

        Jedis jedis = null;
        try {
            jedis = new Jedis("192.168.116.128", 6379);
            //jedis=new Jedis("192.168.137.209",6379);
            jedis.auth("123");
            //jedis.flushAll();
            jedis.flushDB();
            //返回OK
            String setResult = jedis.set("hello", "哈哈");
            System.out.println(jedis.get("hello"));
            //word
            User user = new User("张三", "男");
            //结果为1
            String keyUser = "user1";
            byte[] userBtyes = protostuffSerializer.serialize(user);
            jedis.set(keyUser.getBytes(), userBtyes);
            byte[] resultBtyes = jedis.get(keyUser.getBytes()); // 反序列化[id=1, clubName=AC, clubInfo=米兰, createDate=Tue Sep 15 09:53:18 CST // 2015, rank=1]

            User resultUser = protostuffSerializer.deserialize(resultBtyes);
            System.out.println(resultUser.toString());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            jedis.close();
        }

    }

}
