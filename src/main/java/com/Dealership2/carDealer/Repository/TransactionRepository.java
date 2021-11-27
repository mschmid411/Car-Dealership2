package com.Dealership2.carDealer.Repository;

import com.Dealership2.carDealer.Database.MockDatabaseCars;
import com.Dealership2.carDealer.Database.MockDatabaseCustomers;
import org.springframework.beans.factory.annotation.Autowired;
import org.w3c.dom.Entity;

import java.sql.DatabaseMetaData;

public class TransactionRepository {

@Autowired
MockDatabaseCars mockDatabaseCars;

@Autowired
MockDatabaseCustomers mockDatabaseCustomers;

}