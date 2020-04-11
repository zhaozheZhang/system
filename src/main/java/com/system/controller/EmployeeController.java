package com.system.controller;


import com.system.pojo.Department;
import com.system.pojo.Employee;
import com.system.service.DepartmentService;
import com.system.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@Controller
public class EmployeeController {


    @Autowired
    EmployeeService employeeService;
    @Autowired
    DepartmentService departmentService;

    @GetMapping("/emps")
    public String emps(Model model){
        List<Employee> employees = employeeService.getEmployeeList();
        model.addAttribute("emps",employees);
        return "emp/list";
    }
    @PostMapping("/emps")
    public String addEmps(Employee employee){
        employeeService.updateEmployee(employee);
        return "redirect:/emps";
    }

    @RequestMapping("/addPage")
    public String toAddPage(Model model){
        List<Department> departments = departmentService.getDepartments();
        model.addAttribute("departments",departments);
        return "emp/add";
    }
    @GetMapping("/emp/{id}")
    public String toUpdatePage(@PathVariable("id")Integer id,
            Model model){
        Employee employee = employeeService.getEmployee(id);
        model.addAttribute("emp",employee);
        List<Department> departments = departmentService.getDepartments();
        model.addAttribute("departments",departments);
        return "emp/update";
    }

    @GetMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable("id")Integer id){
        employeeService.deleteEmployee(id);
        return "redirect:/emps";
    }
}
