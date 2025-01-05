package com.firstproject.model;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Entity

@Table (name = "employee")
@DiscriminatorColumn(name = "employee_type")
@DiscriminatorValue("employee")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "emp_id")
    private int id;

    @Column(name = "emp_name")
    private String name;

    @Column(name = "emp_age")
    private int age;

    @Column(name = "address")
    private String address;

    @Column(name = "designation")
    private String designation;
}
