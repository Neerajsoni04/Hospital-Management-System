<<<<<<< HEAD
package com.example.HospitalManagement.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String specialization;

    @Column(nullable = false)
    private String email;

    @OneToOne
    @MapsId
    private User user;

    @OneToMany(mappedBy = "doctor")
    private List<Appointment> appointments = new ArrayList<>();

    @ManyToMany(mappedBy = "doctors")
    private Set<Department> departments;
}
=======
package com.example.HospitalManagement.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String specialization;

    @Column(nullable = false)
    private String email;

    @OneToOne
    @MapsId
    private User user;

    @OneToMany(mappedBy = "doctor")
    private List<Appointment> appointments = new ArrayList<>();

    @ManyToMany(mappedBy = "doctors")
    private Set<Department> departments;
}
>>>>>>> 443bcd5283f8aa6175c42b5caefa7eb211e30d6d
