import org.springframework.data.redis.connection.PoolConfig;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * Created by Andy on 2018/1/9.
 */
public class redisDemo {

    public static void main(String[] args) {
        PoolConfig poolConfig = new PoolConfig();
        poolConfig.setMaxIdle(20);
        poolConfig.setMaxTotal(2000);

        JedisPool jedisPool = new JedisPool(poolConfig, "localhost", 6397);
        Jedis jedis = jedisPool.getResource();
        System.out.println(jedis);
    }
}
