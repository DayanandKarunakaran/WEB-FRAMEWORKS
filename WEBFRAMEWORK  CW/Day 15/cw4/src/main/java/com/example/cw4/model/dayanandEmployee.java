package com.example.cw4.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class dayanandEmployee {
    @Id
    private int employeeId;
    private String name;
    private String position;
    @ManyToOne
    private dayanandCompany company;
}
