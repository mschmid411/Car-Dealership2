package com.Dealership2.carDealer.Entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.UUID;


public class Payment {
    private UUID transactionID;
    private Customer customer;
    private String ccName;
    private String ccNumber;
    private String cardType;
    private String ccExpiration;
    private String ccCvv;
    private LocalDate transactionDate; //LocalDate.parse("yyyy-MM-dd");



    public Payment() {
        this.transactionID = UUID.randomUUID();

    }

    public Payment(UUID transactionID, Customer customer, String ccName, String ccNumber, String cardType, String ccExpiration, String ccCvv, LocalDate transactionDate) {
        this.transactionID = UUID.randomUUID();
        this.customer = customer;
        this.ccName = ccName;
        this.ccNumber = ccNumber;
        this.cardType = cardType;
        this.ccExpiration = ccExpiration;
        this.ccCvv = ccCvv;
        this.transactionDate = transactionDate;
//        this.car = car;
//        this.transactionDate = transactionDate;
    }

//
//    public Car getCar() {
//        return car;
//    }
//
//    public void setCar(Car car) {
//        this.car = car;
//    }


    public UUID getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(UUID transactionID) {
        this.transactionID = transactionID;
    }

    public String getCcNumber() {
        return ccNumber;
    }

    public void setCcNumber(String ccNumber) {
        this.ccNumber = ccNumber;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCcExpiration() {
        return ccExpiration;
    }

    public void setCcExpiration(String ccExpiration) {
        this.ccExpiration = ccExpiration;
    }

    public String getCcCvv() {
        return ccCvv;
    }

    public void setCcCvv(String ccCvv) {
        this.ccCvv = ccCvv;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getCcName() {
        return ccName;
    }

    public void setCcName(String ccName) {
        this.ccName = ccName;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
