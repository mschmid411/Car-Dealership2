package com.Dealership2.carDealer.Entity;


import DTO.Bid;

import java.time.LocalDate;
import java.util.UUID;

public class Transaction {
    private UUID transactionID;
    private Customer customer;
    private Payment payment;
    private Car car;
    private LocalDate transactionDate;
    private Bid bid;
    private double price;
    private boolean setSold;


    public Transaction() {
        this.transactionID = UUID.randomUUID();
    }

    public Transaction(UUID transactionID, Customer customer, Car car, LocalDate transactionDate, Payment payment) {
        this.transactionID = UUID.randomUUID();
        this.customer = customer;
        this.car = car;
        this.transactionDate = transactionDate;
        this.payment = payment;
        this.price = car.getPrice();
        this.setSold = car.isSold();

    }

    public boolean isSetSold() {
        return setSold;
    }

    public void setSetSold(boolean setSold) {
        this.setSold = setSold;
    }

    public Transaction(UUID randomUUID, Customer firstCustomer, Car byVin, LocalDate parse, boolean setSold) {

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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

    public Bid getBid() {
        return bid;
    }

    public void setBid(Bid bid) {
        this.bid = bid;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }


}
