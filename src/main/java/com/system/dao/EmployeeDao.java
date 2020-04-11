//package com.system.dao;
//
//import com.system.pojo.Department;
//import com.system.pojo.Employee;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import java.util.Collection;
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * @author Ares
// */
//
//@Repository
//public class EmployeeDao {
//    @Autowired
//    DepartmentDao departmentDao;
//    private static Map<Integer, Employee> employees = null;
//    static {
//        employees = new HashMap<Integer, Employee>();
//
//        employees.put(1001, new Employee(1001,"AA","AA@A",1,new Department(101,"教育部")));
//        employees.put(1002, new Employee(1002,"BB","AA@A",1,new Department(102,"教育部")));
//        employees.put(1003, new Employee(1003,"CC","AA@A",1,new Department(103,"教育部")));
//        employees.put(1004, new Employee(1004,"DD","AA@A",1,new Department(104,"教育部")));
//    }
//    private static Integer initId = 1006;
//
//    public void save(Employee employee){
//        if (employee.getId() == null){
//            employee.setId(initId++);
//        }
//        employee.setDepartment(departmentDao.getDepartmentById(employee.getDepartment().getId()));
//        employees.put(employee.getId(),employee);
//    }
//
//    public Collection<Employee> getAll(){
//        return employees.values();
//    }
//
//    public Employee getEmployeeById(Integer id){
//        return employees.get(id);
//    }
//
//    public void delete(Integer id){
//        employees.remove(id);
//    }
//
//}
