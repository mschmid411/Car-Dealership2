package com.Dealership2.carDealer.Service;

import com.Dealership2.carDealer.Database.MockDatabaseCars;
import com.Dealership2.carDealer.Entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;

@Service
public class CarDirectoryService {


    private final MockDatabaseCars mockDatabase;


    // constructor inventory service class
    public CarDirectoryService(MockDatabaseCars mockDatabase) {
            this.mockDatabase = mockDatabase;
    }

    public ArrayList<Car> getAllCars() {
        return mockDatabase.getAllCars();

    }
    public void addCar(Car car) {
        mockDatabase.saveCars(car);

    }

    public ArrayList<Car> getPreOwned() {
        ArrayList<Car> preOwnedList = new ArrayList<>();
        for (Car car : mockDatabase.getAllCars()) {
            if (car.getPreOwned()) {
                preOwnedList.add(car);
            }
        }
        return preOwnedList;
    }

    public ArrayList<Car> NewInventory() {
        ArrayList<Car> newInventoryList = new ArrayList<>();
        for (Car car : mockDatabase.getAllCars()) {
            if (!car.getPreOwned()) {
                newInventoryList.add(car);
            }
        }
        return newInventoryList;
    }


    public ArrayList<Car> findPromos() {
        ArrayList<Car> promoList = new ArrayList<Car>();
        LocalDate today = LocalDate.now();
        LocalDate promoDate = today.minusDays(119);

        for (Car car : mockDatabase.getAllCars()) {
            if (car.getDateAcquired().isBefore(promoDate)) {
                System.out.println(car.getDateAcquired().toString());
                promoList.add(car);
            }
        }
        return promoList;
    }

    public ArrayList<Car> searchByModel(String model) {
        ArrayList<Car> carModels = new ArrayList<Car>();

        for (Car car : mockDatabase.getAllCars()) {
            if (car.getModel().equals(model)) {
                carModels.add(car);
            }

        }
        return carModels;


    }

    public Car findByVin(int vin) {
        Car display = new Car();
        for (Car temp : mockDatabase.getAllCars()) {
            int vinList = temp.getVin();
            if (vin == vinList) {
                display = temp;
                return display;
            }
        }
        return null;

//        for(Car temp : )
    }
}



