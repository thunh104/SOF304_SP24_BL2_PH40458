package org.example.testcrudemployees.service;

import com.sun.jdi.request.DuplicateRequestException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.example.testcrudemployees.entities.Car;
import org.example.testcrudemployees.entities.Employees;
import org.example.testcrudemployees.model.CarRequest;
import org.example.testcrudemployees.model.EmployeesRequest;

import java.util.ArrayList;
import java.util.List;

public class CarService {

    private final List<Car> carList;

    public CarService() {
        this.carList = new ArrayList<>();
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void addCar(Car car) {

        checkDuplicate(car);

        if (car != null) {
            carList.add(car);
            System.out.println("Add success");
        } else {
            System.out.println("Car is not null");
            System.out.println("add false");
            throw new NullPointerException("Car not null");
        }

    }

    private void checkDuplicate(Car car) {
        for (Car oldCar : carList){
            if (car.getMa().equalsIgnoreCase(oldCar.getMa())){
                System.out.println("duplicate ma");
                throw new DuplicateRequestException("duplicate ma");
            }
        }
    }

    public void updateCar(String ma, CarRequest newCar) {

        for (Car car : carList) {
            if (car.getMa().equalsIgnoreCase(ma)) {
                car.setTen(newCar.getTen());
                car.setMoney(newCar.getMoney());
                car.setGhiChu(newCar.getGhiChu());
                carList.add(car);
                System.out.println("update success");
                return;
            } else {
                System.out.println("code is not valid!");
                System.out.println("update false");
                throw new NullArgumentException();
            }
        }

    }

    public void deleteCar(String ma) {

        if(ma == null){
            System.out.println("ma not be null");
            throw new ArithmeticException("ma not be null");
        }

        for (Car car : carList) {
            if (car.getMa().equalsIgnoreCase(ma)) {
                carList.remove(car);
                System.out.println("delete success");
                return;
            } else {
                System.out.println("code is not valid!");
                System.out.println("update false");
                throw new ArithmeticException();
            }
        }
    }

    public Car findCarByCode(String code){
        if(code.equalsIgnoreCase("") || code == null){
            throw new NullPointerException();
        }

        for (Car car : carList){
            if(car.getMa().equalsIgnoreCase(code)){
                return car;
            }
        }
        throw new NullArgumentException();
    }

}
