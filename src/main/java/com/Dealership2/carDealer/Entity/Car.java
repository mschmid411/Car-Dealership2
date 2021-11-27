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
    private double price;// Base price of the vehicle, this needs to change if dateAcquired is over 60 days
    private boolean preOwned;
    private boolean isSold;
    private String imageurl;

    public Car(int vin, boolean isSold, String make, String model, String color, int year, String bodyStyle, String trimLevel, LocalDate dateAcquired, long currentOdometer, double price, boolean preOwned, String imageurl) {
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
        this.isSold = isSold;
    }


    // Default Constructor
    public Car() {
         this.vin = vin;

    }

    public boolean isPreOwned() {
        return preOwned;
    }

    public boolean isSold() {
      return isSold;

    }


    public void setSold(boolean sold) {
        isSold = sold;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;

    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String formatPrice(double price) {
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



    }










