package jedis;


import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;


/**
 * @ Author     ：lzy
 * @ Date       ：Created in  2019/4/25 16:08
 * @ Description：redis连接
 */
public class JedisPoolDemo1 {

    public static void main(String[] args) {

        // common-pool连接池配置，这里使用默认配置
        GenericObjectPoolConfig poolConfig = new GenericObjectPoolConfig();
        // 初始化Jedis连接池
        JedisPool jedisPool = new JedisPool(poolConfig, "192.168.116.128", 6379, 10, "123");
//        // 设置最大连接数为默认值的5倍
//        poolConfig.setMaxTotal(GenericObjectPoolConfig.DEFAULT_MAX_TOTAL * 5);
//        // 设置最大空闲连接数为默认值的3倍
//        poolConfig.setMaxIdle(GenericObjectPoolConfig.DEFAULT_MAX_IDLE * 3);
//        // 设置最小空闲连接数为默认值的2倍
//        poolConfig.setMinIdle(GenericObjectPoolConfig.DEFAULT_MIN_IDLE * 2);
//        // 设置开启jmx功能
//        poolConfig.setJmxEnabled(true);
//        // 设置连接池没有连接后客户端的最大等待时间(单位为毫秒)
//        poolConfig.setMaxWaitMillis(3000);
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            jedis.set("hello", "啦啦啦啦");
            String str = jedisPool.getResource().get("hello");
            System.out.println(str);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (jedis != null)
                jedis.close();//源码--此处关闭是若连接池则将此连接赋值为null，连接交还连接池
        }


    }

}
