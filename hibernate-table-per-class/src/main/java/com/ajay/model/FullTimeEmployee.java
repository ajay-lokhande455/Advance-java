package com.ajay.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class FullTimeEmployee extends Employee{
    @Column(name = "salary")
    private double salary;
}
