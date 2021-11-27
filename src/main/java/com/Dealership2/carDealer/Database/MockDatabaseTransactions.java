package com.Dealership2.carDealer.Database;


import com.Dealership2.carDealer.Entity.Customer;
import com.Dealership2.carDealer.Entity.Payment;
import com.Dealership2.carDealer.Entity.Transaction;
import com.Dealership2.carDealer.Service.CarDirectoryService;
import com.Dealership2.carDealer.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.UUID;

@Component
public class MockDatabaseTransactions {

    private ArrayList<Transaction> allTransactions = new ArrayList<>();
    private final CarDirectoryService carDirectoryService;
    private final CustomerService customerService;



    public ArrayList<Transaction> getAllTransactions() {
        return allTransactions;
    }

    public void setAllTransactions(ArrayList<Transaction> allTransactions) {
        this.allTransactions = allTransactions;
    }


    // constructor
    public MockDatabaseTransactions(CarDirectoryService carDirectoryService, CustomerService customerService){
        this.carDirectoryService = carDirectoryService;
        this.customerService = customerService;
        generateMockTransactions();

    }

    // test customer db with 1 manual input
    public void generateMockTransactions() {
        Customer firstCustomer = customerService.getFirstCustomer();
        Payment newPayment = new Payment();

        newPayment.setCustomer(firstCustomer);
        newPayment.setCcName("Billy Joel");
        newPayment.setCcNumber("312321312");
        newPayment.setCardType("debit");

        Transaction t1 = new Transaction(UUID.randomUUID(), customerService.getFirstCustomer(),
                carDirectoryService.findByVin(8), LocalDate.parse("2020-09-01", DateTimeFormatter.ISO_LOCAL_DATE), newPayment);
                allTransactions.add(t1);

    }

    public void addTransaction(Transaction transaction) {
        allTransactions.add(transaction);

    }
    public void saveTransaction(Transaction transaction) {
        allTransactions.add(transaction);
    }



}
