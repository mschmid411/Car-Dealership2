package com.Dealership2.carDealer.Repository;


import com.Dealership2.carDealer.Database.MockDatabaseCars;
import com.Dealership2.carDealer.Database.MockDatabaseTransactions;
import com.Dealership2.carDealer.Entity.Car;
import com.Dealership2.carDealer.Entity.Customer;
import com.Dealership2.carDealer.Entity.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.UUID;

@Repository
public class TransactionRepository {

    @Autowired
    MockDatabaseCars mockDatabaseCars;

    private final MockDatabaseTransactions mockDatabaseTransactions;

    //constructor
    public TransactionRepository(MockDatabaseTransactions mockDatabaseTransactions) {
        this.mockDatabaseTransactions = mockDatabaseTransactions;
    }
    // getter
    // method to display all transactions by date
    public ArrayList<Transaction> getAllTransaction() {
        ArrayList<Transaction> allTransactions = mockDatabaseTransactions.getAllTransactions();
        allTransactions.sort(Comparator.comparing(Transaction::getTransactionDate).reversed());
            return allTransactions;
        }

        public Transaction getTransactionByCar(Car car) {
            ArrayList<Transaction> allTransactions = mockDatabaseTransactions.getAllTransactions();

            for (Transaction loopedTransaction : allTransactions) {
                if (loopedTransaction.getCar().getVin() == (car.getVin())) {
                    return loopedTransaction;
                }
            }

            return null;
        }

        public Customer findBuyerById(UUID customerId) {
            ArrayList<Transaction> allTransactions = mockDatabaseTransactions.getAllTransactions();

            for (Transaction loopedTransaction: allTransactions) {
                if (loopedTransaction.getCustomer().getCustomerId().equals(customerId)) {
                    return loopedTransaction.getCustomer();
                }
            }

            return null;
        }

        public void saveTransaction(Transaction transaction) {
            mockDatabaseTransactions.addTransaction(transaction);
        }

        public Transaction findById(UUID transactionID) {
            ArrayList<Transaction> allTransactions = mockDatabaseTransactions.getAllTransactions();

            for (Transaction loopedTransaction: allTransactions) {
                if (loopedTransaction.getTransactionID().equals(transactionID)) {
                    return loopedTransaction;
                }
            }

            return null;
        }
    }


