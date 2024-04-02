import com.sun.jdi.request.DuplicateRequestException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.example.testcrudemployees.entities.Car;
import org.example.testcrudemployees.entities.Employees;
import org.example.testcrudemployees.model.CarRequest;
import org.example.testcrudemployees.model.EmployeesRequest;
import org.example.testcrudemployees.service.CarService;
import org.example.testcrudemployees.service.EmployeesService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class CarServiceTest {

    private CarService service = new CarService();

    @Test
    public void addEmployeesSuccess(){
        Long money = 234L;
        BigDecimal bigDecimal = BigDecimal.valueOf(money);
        Car car = new Car("Car01", "Oniamey", bigDecimal, "nghiathph32178");
        service.addCar(car);
        Assertions.assertEquals(1, service.getCarList().size());
    }

    @Test
    public void addEmployeesFalse(){
        Long money = 234L;
        BigDecimal bigDecimal = BigDecimal.valueOf(money);
        Car car = new Car("Car01", "Oniamey", bigDecimal, "nghiathph32178");
        service.addCar(car);
        Car carDuplicate = new Car("Car01", "Oniamey", bigDecimal, "nghiathph32178");
        Assertions.assertThrows(DuplicateRequestException.class, () -> service.addCar(car));
        Assertions.assertEquals(1, service.getCarList().size());
    }

    @Test
    public void addEmployeesNull(){
        Assertions.assertThrows(NullPointerException.class, () -> service.addCar(null));
        Assertions.assertEquals(0, service.getCarList().size());
    }

    @Test
    public void updateEmployeesSuccess(){
        Long money = 234L;
        BigDecimal bigDecimal = BigDecimal.valueOf(money);
        Car car = new Car("Car01", "Oniamey", bigDecimal, "nghiathph32178");
        service.addCar(car);
        Long newMoney = 1000000000L;
        BigDecimal newBigDecimal = BigDecimal.valueOf(newMoney);
        CarRequest carRequest = new CarRequest("Nuna", newBigDecimal, "nyp2k4@gmail.com");
        service.updateCar("Car01", carRequest);
        Assertions.assertEquals(newBigDecimal, service.getCarList().get(0).getMoney());
    }

    @Test
    public void updateEmployeesFalse(){
        Long money = 234L;
        BigDecimal bigDecimal = BigDecimal.valueOf(money);
        Car car = new Car("Car01", "Oniamey", bigDecimal, "nghiathph32178");
        service.addCar(car);
        Long newMoney = 1000000000L;
        BigDecimal newBigDecimal = BigDecimal.valueOf(newMoney);
        CarRequest carRequest = new CarRequest("Nuna", newBigDecimal, "nyp2k4@gmail.com");
        Assertions.assertThrows(NullArgumentException.class, () -> service.updateCar("Car02", carRequest));
        Assertions.assertEquals(bigDecimal, service.getCarList().get(0).getMoney());
    }

    @Test
    public void findCarByCodeSuccess(){
        Long money = 234L;
        BigDecimal bigDecimal = BigDecimal.valueOf(money);
        Car car = new Car("Car01", "Oniamey", bigDecimal, "nghiathph32178");
        service.addCar(car);
        Long money1 = 234L;
        BigDecimal bigDecimal1 = BigDecimal.valueOf(money);
        Car car1 = new Car("Car02", "Oniamey", bigDecimal1, "nghiathph32178");
        service.addCar(car1);

        Assertions.assertEquals(car, service.findCarByCode("Car01"));
    }

    @Test
    public void findCarByCodeFalse(){
        Long money = 234L;
        BigDecimal bigDecimal = BigDecimal.valueOf(money);
        Car car = new Car("Car01", "Oniamey", bigDecimal, "nghiathph32178");
        service.addCar(car);
        Long money1 = 234L;
        BigDecimal bigDecimal1 = BigDecimal.valueOf(money);
        Car car1 = new Car("Car02", "Oniamey", bigDecimal1, "nghiathph32178");
        service.addCar(car1);

        Assertions.assertThrows(NullArgumentException.class, () -> service.findCarByCode("Car03"));
    }

    @Test
    public void findCarByCodeFalse1(){
        Long money = 234L;
        BigDecimal bigDecimal = BigDecimal.valueOf(money);
        Car car = new Car("Car01", "Oniamey", bigDecimal, "nghiathph32178");
        service.addCar(car);
        Long money1 = 234L;
        BigDecimal bigDecimal1 = BigDecimal.valueOf(money);
        Car car1 = new Car("Car02", "Oniamey", bigDecimal1, "nghiathph32178");
        service.addCar(car1);

        Assertions.assertThrows(NullPointerException.class, () -> service.findCarByCode(""));
    }

}
