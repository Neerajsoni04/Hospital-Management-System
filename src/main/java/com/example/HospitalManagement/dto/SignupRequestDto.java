<<<<<<< HEAD
package com.example.HospitalManagement.dto;

import com.example.HospitalManagement.Entity.Type.RoleType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignupRequestDto {
    private String username;
    private String password;
    private String name;

    private Set<RoleType> roles = new HashSet<>();
}
=======
package com.example.HospitalManagement.dto;

import com.example.HospitalManagement.Entity.Type.RoleType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignupRequestDto {
    private String username;
    private String password;
    private String name;

    private Set<RoleType> roles = new HashSet<>();
}
>>>>>>> 443bcd5283f8aa6175c42b5caefa7eb211e30d6d
