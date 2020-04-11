package com.system.mapper;

import com.system.pojo.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

import java.util.Collection;

/**
 * @author Ares
 */
@Repository
@Mapper
public interface DepartmentMapper {

    List<Department> querDepartments();
}
