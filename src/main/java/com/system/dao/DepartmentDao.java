//package com.system.dao;
//
//import com.system.pojo.Department;
//import org.springframework.stereotype.Repository;
//
//import java.util.Collection;
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * @author Ares
// */
//@Repository
//public class DepartmentDao {
//    private static Map<Integer, Department> departments = null;
//    static {
//        departments = new HashMap<Integer, Department>();
//
//        departments.put(101, new Department(101,"教育部"));
//        departments.put(102, new Department(102,"企业部"));
//        departments.put(103, new Department(103,"事业部"));
//        departments.put(104, new Department(104,"通讯部"));
//    }
//    public Collection<Department> getDepartments(){
//        return departments.values();
//    }
//    public Department getDepartmentById(Integer id){
//        return departments.get(id);
//    }
//}
