package edu.study.commonapi.redis;

import edu.study.commonapi.CommonApiApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * @author wjl
 * @Data 2018, 05, 21
 */
public class TestRedis extends CommonApiApplicationTests {

    @Autowired
    StringRedisTemplate redisTemplate;
    @Test
    public void testConnection(){
        redisTemplate.opsForValue().set("wjl","hello world");
        System.out.println("success");
    }
}
