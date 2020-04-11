package com.system.service;

import com.system.mapper.EmployeeMapper;
import com.system.pojo.Employee;
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

    public List<Employee> getEmployeeList(){
        return employeeMapper.queryEmployeeList();
    }

    public Employee getEmployee(Integer id){
        return employeeMapper.queryById(id);
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
