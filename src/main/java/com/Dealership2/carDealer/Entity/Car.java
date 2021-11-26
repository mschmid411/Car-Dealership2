package com.Dealership2.carDealer.Entity;


import org.apache.tomcat.jni.Local;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.UUID;


@EntityScan
public class Car {

    private int vin;
    private String make; // Vehicle manufacturer
    private String model; // Specific car type
    private String color;
    private int year; // Year car design was finalized
    private String bodyStyle; // Shape and function of car
    private String trimLevel; // Extras
    private LocalDate dateAcquired; //= LocalDate.parse(""); // Date car was bought by MotoMerchants
    private long currentOdometer; // How many miles are on a used car
    private float price;// Base price of the vehicle, this needs to change if dateAcquired is over 60 days
    private boolean preOwned;
    private String imageurl;

    public Car(int vin, String make, String model, String color, int year, String bodyStyle, String trimLevel, LocalDate dateAcquired, long currentOdometer, float price, boolean preOwned, String imageurl) {
        this.vin = vin;
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.bodyStyle = bodyStyle;
        this.trimLevel = trimLevel;
        this.dateAcquired = dateAcquired;
        this.currentOdometer = currentOdometer;
        this.price = price;
        this.preOwned = preOwned;
        this.imageurl = imageurl;
    }


    // Default Constructor
    public Car() {
         this.vin = vin;

    }




    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public boolean getPreOwned() {
        if (preOwned) {
            System.out.println("Certified Pre-Owned");
        }
        return preOwned;

    }

    public void setPreOwned(boolean preOwned) {
        this.preOwned = preOwned;
    }

    public LocalDate getDateAcquired() {
        return dateAcquired;
    }

    public void setDateAcquired(LocalDate dateAcquired) {
        this.dateAcquired = dateAcquired;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBodyStyle() {
        return bodyStyle;
    }

    public void setBodyStyle(String bodyStyle) {
        this.bodyStyle = bodyStyle;
    }

    public String getTrimLevel() {
        return trimLevel;
    }

    public void setTrimLevel(String trimLevel) {
        this.trimLevel = trimLevel;
    }


    public long getCurrentOdometer() {
        return currentOdometer;
    }

    public void setCurrentOdometer(long currentOdometer) {
        this.currentOdometer = currentOdometer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;

    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String formatPrice(float price) {
        NumberFormat formatPrice = NumberFormat.getCurrencyInstance();
        return (formatPrice.format(this.price));

    }

    public String printPreOwned() {
        String message;
        if (preOwned) {
            message = "Certified Pre-Owned*";
        } else {
            message = "NEW!";
        }
        return message;
    }


    @Override
    public String toString() {
        return
                ("Make: " + make + "\nModel: " + model +
                "\nColor: " + color +
                "\nYear: " + year +
                "\nBody-Style: " + bodyStyle +
                "\n Trim-Level: " + trimLevel +
                "\nMileage: " + currentOdometer +
                "\nPrice: " + price +
                " " + preOwned);

    }

        public void printCar() {

            if (preOwned) {
                System.out.print(//"vin:" + vin +
                        "Make: " + make + "\nModel: " + model +
                                "\nColor: " + color +
                                "\nYear: " + year +
                                "\nBody-Style: " + bodyStyle +
                                "\n Trim-Level: " + trimLevel +
                                "\nMileage: " + currentOdometer +
                                "\nPrice: " + price +
                                "\nCertified Pre-Owned*");
            } else {

                System.out.print(//"vin:" + vin +
                        ", make:'" + make + '\'' +
                                ", model:'" + model + '\'' +
                                ", color:'" + color + '\'' +
                                ", year:" + year +
                                ", bodyStyle:'" + bodyStyle + '\'' +
                                ", trimLevel:'" + trimLevel + '\'' +
                                ", currentOdometer:" + currentOdometer +
                                ", price:" + price);
            }
        }
    }


//    public boolean getPromoCar(){
//        if(getDateAcquired().compareTo(LocalDate.now()) > (120));
//        return true;
//    }
//    public void setPromoCar(boolean promoCar) {
//        this.promoCar = promoCar;
//    }





