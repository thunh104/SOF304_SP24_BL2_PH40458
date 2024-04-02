package org.example.testcrudemployees.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Car {

    private String ma;

    private String ten;

    private BigDecimal money;

    private String ghiChu;
}
