package com.system.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Ares
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department implements Serializable {
    private Integer id;
    private String departmentName;
}
