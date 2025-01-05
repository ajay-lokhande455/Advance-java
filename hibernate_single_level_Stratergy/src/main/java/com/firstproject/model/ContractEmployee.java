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
@DiscriminatorValue("cte")
public class ContractEmployee extends Employee {
    double invoiceAmount;
}
