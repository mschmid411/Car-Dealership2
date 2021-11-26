package com.Dealership2.carDealer.Entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Date;
import java.util.UUID;



@EntityScan
public class Payment {
    private int transactionID;
    private String ccNumber;
    private String cardType;
    private String ccExpiration;
    private String ccCvv;
    private Date transactionDate;



    public Payment() {
       // this.transactionID = UUID.randomUUID();

    }

    public Payment(int transactionID, String ccNumber, String cardType, String ccExpiration, String ccCvv, Date transactionDate) {
        this.transactionID = transactionID;
        this.ccNumber = ccNumber;
        this.cardType = cardType;
        this.ccExpiration = ccExpiration;
        this.ccCvv = ccCvv;
        this.transactionDate = transactionDate;
//        this.car = car;
//        this.transactionDate = transactionDate;
    }

    public Payment(int i, String s, String amex, String s1, int i1) {
    }

    public Payment(int transactionID, String ccNumber, String amex, String ccExpiration, String ccCvv, int i) {
    }


//
//    public Car getCar() {
//        return car;
//    }
//
//    public void setCar(Car car) {
//        this.car = car;
//    }


    public int getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(int transactionID) {
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

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }




}
