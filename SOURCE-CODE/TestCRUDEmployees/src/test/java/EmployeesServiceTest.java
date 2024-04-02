import com.sun.jdi.request.DuplicateRequestException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.example.testcrudemployees.entities.Employees;
import org.example.testcrudemployees.model.EmployeesRequest;
import org.example.testcrudemployees.service.EmployeesService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmployeesServiceTest {

    private EmployeesService service = new EmployeesService();

    @Test
    public void addEmployeesSuccess(){
        Employees employees = new Employees(1, "Oniamey", "NuNa", "nghiathph32178");
        service.addEmployees(employees);
        Assertions.assertEquals(1, service.getEmployeesList().size());
    }

    @Test
    public void addEmployeesFalse(){
        Employees employees = new Employees(1, "Oniamey", "NuNa", "nghiathph32178");
        service.addEmployees(employees);
        Employees employees2 = new Employees(1, "Oniamey", "NuNa", "nghiathph32178");
        Assertions.assertThrows(DuplicateRequestException.class, () -> service.addEmployees(employees2));
        Assertions.assertEquals(1, service.getEmployeesList().size());
    }

    @Test
    public void addEmployeesNull(){
        Assertions.assertThrows(NullPointerException.class, () -> service.addEmployees(null));
        Assertions.assertEquals(0, service.getEmployeesList().size());
    }

    @Test
    public void updateEmployeesSuccess(){
        Employees employees = new Employees(1, "Oniamey", "NuNa", "nghiathph32178@fpt.edu.vn");
        service.addEmployees(employees);
        EmployeesRequest employeesRequest = new EmployeesRequest("Nuna", "Oniamey", "nyp2k4@gmail.com");
        employees.setEmail("nyp2k4@gmail.com");
        service.updateEmployees(1, employeesRequest);
        Assertions.assertEquals("nyp2k4@gmail.com", service.getEmployeesList().get(0).getEmail());
    }

    @Test
    public void updateEmployeesFalse(){
        Employees employees = new Employees(1, "Oniamey", "NuNa", "nghiathph32178@fpt.edu.vn");
        service.addEmployees(employees);
        EmployeesRequest employeesRequest = new EmployeesRequest("Nuna", "Oniamey", "nyp2k4@gmail.com");
        employeesRequest.setEmail("nyp2k4@gmail.com");
        Assertions.assertThrows(NullArgumentException.class, () -> service.updateEmployees(2, employeesRequest));
        Assertions.assertEquals(1, service.getEmployeesList().get(0).getId());
        Assertions.assertEquals("nghiathph32178@fpt.edu.vn", service.getEmployeesList().get(0).getEmail());
    }

    @Test
    public void deleteEmployeesSuccess(){
        Employees employees = new Employees(1, "Oniamey", "NuNa", "nghiathph32178@fpt.edu.vn");
        service.addEmployees(employees);
        service.deleteEmployees(1L);
        Assertions.assertEquals(0, service.getEmployeesList().size());
    }

    @Test
    public void deleteEmployeesFalse(){
        Employees employees = new Employees(1, "Oniamey", "NuNa", "nghiathph32178@fpt.edu.vn");
        service.addEmployees(employees);
        service.deleteEmployees(2L);
        Assertions.assertEquals(1, service.getEmployeesList().size());
    }

    @Test
    public void deleteEmployeesNull(){
        Employees employees = new Employees(1, "Oniamey", "NuNa", "nghiathph32178@fpt.edu.vn");
        service.addEmployees(employees);
        Assertions.assertThrows(ArithmeticException.class, () -> service.deleteEmployees(null));
        Assertions.assertEquals(1, service.getEmployeesList().size());
    }
}
