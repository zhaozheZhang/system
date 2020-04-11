package com.system.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Ares
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private Integer id;
    private String name;
    private String email;
    private Integer gender;

    private String department;
    private Date birth;

    public Employee(Integer id, String name, String email, Integer gender, String department) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.department = department;
        this.birth = new Date();
    }
}
