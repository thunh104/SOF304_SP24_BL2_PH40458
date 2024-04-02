package org.example.testcrudemployees.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CarRequest {

    private String ten;

    private BigDecimal money;

    private String ghiChu;

}
