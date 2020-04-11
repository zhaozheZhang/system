package com.system;

import com.system.mapper.UserMapper;
import com.system.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SystemApplicationTests {

    @Autowired
    UserMapper userMapper;
    @Test
    void contextLoads() {
        int a = 1;
        //User u = new User(1,"zzz",new BCryptPasswordEncoder().encode("1234"),1,"1");
        //userMapper.addUser(u);
    }

}
