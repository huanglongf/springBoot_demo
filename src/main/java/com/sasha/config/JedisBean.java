package com.sasha.config;

import org.springframework.aop.target.PoolingConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.PoolConfig;
import redis.clients.jedis.JedisPool;

import javax.sound.sampled.Port;

/**
 * Created by Andy on 2018/1/9.
 */

@Configuration //相當於配置文件applicationcontext.xml
public class JedisBean {

    @Value("${spring.redis.host}")
    private String host;

    @Value("${spring.redis.port}")
    private int Port;


    @Bean //相当于<bean class="Jedis Pool> Bean method 'getJedisPool' must not be private or final; change the method's modifiers to continue
    public  JedisPool getJedisPool(){
        PoolConfig poolConfig = new PoolConfig();
        poolConfig.setMaxIdle(20);
        poolConfig.setMaxTotal(2000);

        JedisPool jedisPool = new JedisPool(poolConfig, host, Port);
        return jedisPool;
    }

    /**
     * @Value("${redis.cache.clusterNodes}")
    private String clusterNodes;

     @Bean
     public JedisCluster getJedisCluster() {
     // 截取集群节点
     String[] cluster = clusterNodes.split(",");
     // 创建set集合
     Set<HostAndPort> nodes = new HashSet<HostAndPort>();
     // 循环数组把集群节点添加到set集合中
     for (String node : cluster) {
     String[] host = node.split(":");
     //添加集群节点
     nodes.add(new HostAndPort(host[0], Integer.parseInt(host[1])));

     }
     JedisCluster jc = new JedisCluster(nodes);

     return jc;

     }
     */

}
