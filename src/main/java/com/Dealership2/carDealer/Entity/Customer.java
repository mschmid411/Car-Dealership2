package com.Dealership2.carDealer.Entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.UUID;

@EntityScan
public class Customer {


    private int customerId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private Payment payment;
    private Car car;



    public Customer() {

    }

    public Customer(int customerId, String firstName, String lastName, String email, String phoneNumber, Payment payment, Car car) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.payment = payment;
        this.car = car;
    }

        public int getCustomerId() {
            return customerId;
        }

        public void setCustomerId(int customerId) {
            this.customerId = customerId;
        }

        public void setCar(Car car) {
            this.car = car;
        }


    public Car getCar() {
        return car;
    }
    public void setCar() {
        this.car = car;
    }


    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Payment getPayment() {
        return payment;
    }
    
    public void setPayment(Payment payment) {
        this.payment = this.payment;
    }



}

