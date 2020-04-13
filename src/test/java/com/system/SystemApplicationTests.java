package com.system;

import com.system.mapper.UserMapper;
import com.system.pojo.Employee;
import com.system.pojo.User;
import com.system.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import redis.clients.jedis.Jedis;

@SpringBootTest
class SystemApplicationTests {

    @Autowired
    EmployeeService employeeService;
    @Autowired
    UserMapper userMapper;
    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    StringRedisTemplate stringRedisTemplate;
    @Test
    void contextLoads() {
//        Jedis jedis = new Jedis("127.0.0.1",6379);
//        System.out.println(jedis.ping());
//        stringRedisTemplate.opsForValue().set("name","zzz");
        String name = stringRedisTemplate.opsForValue().get("name");
        System.out.println(name);
    }
    @Test
    public void testRedis(){
//        Employee employee = employeeService.getEmployee(2);
//        redisTemplate.opsForValue().set("employee", employee);
        Employee employee = (Employee)redisTemplate.opsForValue().get("employee");
    }

}
