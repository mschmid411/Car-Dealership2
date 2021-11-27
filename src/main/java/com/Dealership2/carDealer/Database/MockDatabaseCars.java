package com.Dealership2.carDealer.Database;
import com.Dealership2.carDealer.Entity.Car;
import org.springframework.stereotype.Component;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


@Component
public class MockDatabaseCars {

    // variables comprising db
    private ArrayList<Car> allCars = new ArrayList<Car>();



    // constructor db
    public MockDatabaseCars() {
        generateMockCars(); //method returns db below


    }
    // getter and setter for allCars
    public ArrayList<Car> getAllCars() {
        return this.allCars;
    }

    public void setAllCars(ArrayList<Car> allCars) {
        this.allCars = allCars;
    }


        public void generateMockCars() {
            Car car1 = new Car();
            car1.setVin(1);
            car1.setMake("Aston Martin");
            car1.setModel("Valhalla");
            car1.setColor("Blue");
            car1.setImageurl("/images/AstonMartin.JPG");
            car1.setBodyStyle("Hypercar");
            car1.setTrimLevel("Lux");
            car1.setCurrentOdometer(0);
            car1.setDateAcquired(LocalDate.parse("2021-11-06", DateTimeFormatter.ISO_LOCAL_DATE));
            car1.setYear(2024);
            car1.setPrice(800000);
            car1.setPreOwned(false);
            allCars.add(car1);


            Car car2 = new Car();

            car2.setVin(2);
            car2.setMake("Ferrari");
            car2.setModel("458 Italia");
            car2.setColor("Yellow");
            car2.setImageurl("/images/Ferrari.JPG");
            car2.setBodyStyle("Coupe");
            car2.setTrimLevel("RWD");
            car2.setCurrentOdometer(1766);
            car2.setDateAcquired(LocalDate.parse("2021-06-22", DateTimeFormatter.ISO_LOCAL_DATE));
            car2.setYear(2013);
            car2.setPrice(233509);
            car2.setPreOwned(true);
            allCars.add(car2);

            Car car3 = new Car();

            car3.setVin(3);
            car3.setMake("Porsche");
            car3.setModel("911 Turbo");
            car3.setColor("White");
            car3.setImageurl("/images/Porsche911.JPG");
            car3.setBodyStyle("Coupe");
            car3.setTrimLevel("Automatic");
            car3.setCurrentOdometer(19239);
            car3.setDateAcquired(LocalDate.parse("2021-11-02", DateTimeFormatter.ISO_LOCAL_DATE));
            car3.setYear(2008);
            car3.setPrice(89841);
            car3.setPreOwned(true);
            allCars.add(car3);

            Car car4 = new Car();

            car4.setVin(4);
            car4.setMake("Bugatti");
            car4.setModel("Centodieci");
            car4.setColor("White");
            car4.setImageurl("/images/Bugatti2.JPG");
            car4.setBodyStyle("Hypercar");
            car4.setTrimLevel("1577-HP");
            car4.setCurrentOdometer(5374);
            car4.setDateAcquired(LocalDate.parse("2021-11-05", DateTimeFormatter.ISO_LOCAL_DATE));
            car4.setYear(2021);
            car4.setPrice(9000000);
            car4.setPreOwned(true);
            allCars.add(car4);

            Car car5 = new Car();

            car5.setVin(5);
            car5.setMake("Masserati");
            car5.setModel("Ghibli");
            car5.setColor("White");
            car5.setImageurl("/images/Masserati.JPG");
            car5.setBodyStyle("Sedan");
            car5.setTrimLevel("M713");
            car5.setCurrentOdometer(28);
            car5.setDateAcquired(LocalDate.parse("2021-08-22", DateTimeFormatter.ISO_LOCAL_DATE));
            car5.setYear(2021);
            car5.setPrice(74390);
            car5.setPreOwned(true);
            allCars.add(car5);


            Car car6 = new Car();
            car6.setVin(6);
            car6.setMake("Rolls-Royce");
            car6.setModel("Boat Tail");
            car6.setColor("Blue");
            car6.setImageurl("/images/Rolls-Royce28.JPG");
            car6.setBodyStyle("Sedan");
            car6.setTrimLevel("Automatic");
            car6.setCurrentOdometer(10);
            car6.setDateAcquired(LocalDate.parse("2021-06-29", DateTimeFormatter.ISO_LOCAL_DATE));
            car6.setYear(2022);
            car6.setPrice(28_000_000);
            car6.setPreOwned(false);
            allCars.add(car6);


            Car car7 = new Car();
            car7.setVin(7);
            car7.setMake("Lamborghini");
            car7.setModel("Murcielago");
            car7.setColor("Red");
            car7.setImageurl("/images/Lamborghini.JPG");
            car7.setBodyStyle("Convertible");
            car7.setTrimLevel("Roadster LP640");
            car7.setCurrentOdometer(13985);
            car7.setDateAcquired(LocalDate.parse("2021-05-01", DateTimeFormatter.ISO_LOCAL_DATE));
            car7.setYear(2008);
            car7.setPrice(318_300);
            car7.setPreOwned(true);
            allCars.add(car7);


            Car car8 = new Car();

            car8.setVin(8);
            car8.setMake("Bentley");
            car8.setModel("Continental");
            car8.setColor("White");
            car8.setImageurl("/images/Bentley.JPG");
            car8.setBodyStyle("Convertible");
            car8.setTrimLevel("Gtc");
            car8.setCurrentOdometer(18);
            car8.setDateAcquired(LocalDate.parse("2021-10-12", DateTimeFormatter.ISO_LOCAL_DATE));
            car8.setYear(2022);
            car8.setPrice(302400);
            car8.setPreOwned(false);
            allCars.add(car8);

            Car car9 = new Car();

            car9.setVin(9);
            car9.setMake("Maybach");
            car9.setModel("62 S");
            car9.setColor("Black");
            car9.setImageurl("/images/Maybach.JPG");
            car9.setBodyStyle("Sedan");
            car9.setTrimLevel("6.0L Twin Turbo");
            car9.setCurrentOdometer(42785);
            car9.setDateAcquired(LocalDate.parse("2021-11-11", DateTimeFormatter.ISO_LOCAL_DATE));
            car9.setYear(2009);
            car9.setPrice(430200);
            car9.setPreOwned(true);
            allCars.add(car9);

            Car car10 = new Car();

            car1.setVin(10);
            car10.setMake("Tesla");
            car10.setModel("Cybertruck");
            car10.setColor("Silver");
            car10.setImageurl("/images/Tesla.JPG");
            car10.setBodyStyle("Truck");
            car10.setTrimLevel("Electric");
            car10.setCurrentOdometer(0);
            car10.setDateAcquired(LocalDate.parse("2021-11-01", DateTimeFormatter.ISO_LOCAL_DATE));
            car10.setYear(2022);
            car10.setPrice(69000);
            car10.setPreOwned(false);
            allCars.add(car10);
        }


    public void addCar(Car car) {
        allCars.add(car);

    }
    public void saveCars(Car car) {
        allCars.add(car);
    }

}