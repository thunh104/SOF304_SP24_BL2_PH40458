package org.example.testcrudemployees.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employees {

    private int id;

    private String firstName;

    private String lastName;

    private String email;

}
