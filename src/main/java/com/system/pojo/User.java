package com.system.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    Integer id;
    String username;
    String password;
    Integer enabled;
    String role;
}
