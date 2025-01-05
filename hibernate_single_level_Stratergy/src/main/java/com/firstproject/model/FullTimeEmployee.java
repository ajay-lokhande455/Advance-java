package com.firstproject.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

@Entity
@DiscriminatorValue("fte")
public class FullTimeEmployee extends Employee{
    private double salary;
}
