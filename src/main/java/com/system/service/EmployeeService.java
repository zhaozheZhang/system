package com.system.service;

import com.system.mapper.EmployeeMapper;
import com.system.pojo.Employee;
import com.system.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.List;

/**
 * @author Ares
 */
@Service
public class EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;
    @Autowired
    RedisUtil redisUtil;

    public List<Employee> getEmployeeList(){
        return employeeMapper.queryEmployeeList();
    }

    public Employee getEmployee(Integer id){
        Employee employee = (Employee)redisUtil.get(id.toString());
        if (employee != null){
            return employee;
        }
        Employee employee1 = employeeMapper.queryById(id);
        redisUtil.set(id.toString(), employee1);
        return employee1;
    }
    public int addEmployee(Employee employee){
        return employeeMapper.addUEmployee(employee);
    }
    public int deleteEmployee(Integer id){
        return employeeMapper.deleteEmployee(id);
    }
    public int updateEmployee(Employee employee){
        System.out.println(employee.toString());
        return employeeMapper.updateEmployee(employee);
    }
}
