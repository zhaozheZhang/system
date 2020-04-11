package com.system.mapper;

import com.system.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

    /**
     * @author Ares
     */
    @Mapper
    @Repository
    public interface EmployeeMapper {

        List<Employee> queryEmployeeList();

        Employee queryById(int id);

        int addUEmployee(Employee employee);

        int updateEmployee(Employee employee);

        int deleteEmployee(int id);
}
