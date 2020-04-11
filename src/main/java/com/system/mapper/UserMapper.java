package com.system.mapper;

import com.system.pojo.Employee;
import com.system.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {

    int addUser(User user);
}
