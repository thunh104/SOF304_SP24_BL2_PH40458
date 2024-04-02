package org.example.testcrudemployees.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeesRequest {
    
    private String firstName;

    private String lastName;

    private String email;

}
