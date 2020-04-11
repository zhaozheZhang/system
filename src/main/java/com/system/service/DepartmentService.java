package com.system.service;

import com.system.mapper.DepartmentMapper;
import com.system.pojo.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    DepartmentMapper departmentMapper;

    public List<Department> getDepartments(){
        return departmentMapper.querDepartments();
    }
}
