package com.Dealership2.carDealer.Service;

import DTO.Bid;
import com.Dealership2.carDealer.Database.MockDatabaseCars;
import com.Dealership2.carDealer.Database.MockDatabaseTransactions;
import com.Dealership2.carDealer.Entity.Car;
import com.Dealership2.carDealer.Entity.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;

@Service
public class CarDirectoryService {

    @Autowired
    MockDatabaseTransactions mockDatabaseTransactions;

    private final MockDatabaseCars mockDatabaseCars;



    // constructor inventory service class
    public CarDirectoryService(MockDatabaseCars mockDatabaseCars) {
        this.mockDatabaseCars = mockDatabaseCars;

    }


    public ArrayList<Car> getAllCars() {
        return mockDatabaseCars.getAllCars();

    }

    public void addCar(Car car) {
        mockDatabaseCars.saveCars(car);

    }

    public ArrayList<Car> getPreOwned() {
        ArrayList<Car> preOwnedList = new ArrayList<>();
        for (Car car : mockDatabaseCars.getAllCars()) {
            if (car.getPreOwned()) {
                preOwnedList.add(car);
            }
        }
        return preOwnedList;
    }



    public ArrayList<Car> getUnsoldList() {
        ArrayList<Car> unsoldList = new ArrayList<>();
        for (Car car : mockDatabaseCars.getAllCars()) {
            if (car.isSold() == false) {
                unsoldList.add(car);
            }
        }
        return unsoldList;
    }

    public ArrayList<Car> getSoldList() {
        ArrayList<Car> soldList = new ArrayList<>();
        for (Car car : mockDatabaseCars.getAllCars()) {
            if (car.isSold()==true) {
                soldList.add(car);
            }
        }
        return soldList;
        }


        public ArrayList<Car> NewInventory () {
            ArrayList<Car> newInventoryList = new ArrayList<>();
            for (Car car : mockDatabaseCars.getAllCars()) {
                if (!car.getPreOwned()) {
                    newInventoryList.add(car);
                }
            }
            return newInventoryList;
        }


        public ArrayList<Car> findPromos () {
            ArrayList<Car> promoList = new ArrayList<Car>();
            LocalDate today = LocalDate.now();
            LocalDate promoDate = today.minusDays(119);

            for (Car car : mockDatabaseCars.getAllCars()) {
                if (car.getDateAcquired().isBefore(promoDate)) {
                    System.out.println(car.getDateAcquired().toString());
                    promoList.add(car);
                }
            }
            return promoList;
        }

        public ArrayList<Car> searchByModel(String model){
            ArrayList<Car> carModels = new ArrayList<Car>();

            for (Car car : mockDatabaseCars.getAllCars()) {
                if (car.getModel().equals(model)) {
                    carModels.add(car);
                }

            }
            return carModels;


        }

        public Car findByVin ( int vin){
            Car display = new Car();
            for (Car temp : mockDatabaseCars.getAllCars()) {
                int vinList = temp.getVin();
                if (vin == vinList) {
                    display = temp;
                    return display;
                }
            }
            return null;

        }

        public void refreshCarList (Transaction transaction){
            for (Car soldCar : mockDatabaseCars.getAllCars()) {
                if (soldCar.getVin() == transaction.getCar().getVin()) {
                    getUnsoldList().remove(soldCar);
                }
            }
        }

    }




