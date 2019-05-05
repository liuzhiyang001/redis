package jedis;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.Pipeline;

import java.util.List;


/**
 * @ Author     ：lzy
 * @ Date       ：Created in  2019/4/25 16:08
 * @ Description：redis连接
 */
public class JedisPipelineDemo1 {

    public static void main(String[] args) {
        Jedis jedis=null;
        try {
            jedis=new Jedis("192.168.116.128",6379);
            jedis.auth("123");
            Pipeline pipeline=jedis.pipelined();
            jedis.flushDB();
            pipeline.set("hello","word");
            pipeline.set("hello1","word1");//添加入pipeline但是未执行
            pipeline.incr("counter");
            //pipeline.sync();//执行操作---sync()与syncAndReturnAll()都可以执行
            //用pipeline.syncAndReturnAll()可以获取返回值
            List<Object> list=pipeline.syncAndReturnAll();
            for (Object obj:list
                 ) {
                System.out.println(obj);
            }
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            jedis.close();
        }

    }

}
