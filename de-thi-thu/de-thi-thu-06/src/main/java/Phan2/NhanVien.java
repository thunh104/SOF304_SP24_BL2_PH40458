package Phan2;

import lombok.*;

import java.math.BigDecimal;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NhanVien {
    private int employeeID;
    private String codeEmployee;
    private String firstName;
    private String lastName;
    private String position;
    private double salary;
}
