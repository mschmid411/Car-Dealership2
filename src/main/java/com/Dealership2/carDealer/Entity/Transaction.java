package com.Dealership2.carDealer.Entity;


import java.time.LocalDate;
import java.util.UUID;

public class Transaction {
    private UUID transactionID;
    private Customer customer;
    private Payment payment;
    private Car car;
    private LocalDate transactionDate;

    public Transaction() {
        this.transactionID = UUID.randomUUID();
    }

    public Transaction(UUID transactionID, Customer customer, Car car, LocalDate transactionDate, Payment payment) {
        this.transactionID = UUID.randomUUID();
        this.customer = customer;
        this.car = car;
        this.transactionDate = transactionDate;
        this.payment = payment;
    }

    public Transaction(UUID randomUUID, Customer firstCustomer, Car byVin, LocalDate parse) {
    }


    public UUID getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(UUID transactionID) {
        this.transactionID = transactionID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }


    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
