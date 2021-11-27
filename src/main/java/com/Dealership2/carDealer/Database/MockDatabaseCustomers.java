package com.Dealership2.carDealer.Database;

import com.Dealership2.carDealer.Entity.Car;
import com.Dealership2.carDealer.Entity.Customer;
import com.Dealership2.carDealer.Entity.Payment;
import com.Dealership2.carDealer.Service.CarDirectoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.UUID;

@Component
public class MockDatabaseCustomers {
 private ArrayList<Customer> allCustomers = new ArrayList<Customer>();



 // getters and setters
 public ArrayList<Customer> getAllCustomers() {
  return this.allCustomers;
 }

 public void setAllCustomers(ArrayList<Customer> allCustomers) {
  this.allCustomers = allCustomers;
 }


 // constructor
 public MockDatabaseCustomers(){
  generateMockCustomers();

 }

// test customer db with 1 manual input
 public void generateMockCustomers(){

  Customer c1 = new Customer(UUID.randomUUID(), "Billy", "Joel", "pianoman@gmail.com", "333-333-3333");
  Payment p1 = new Payment(UUID.randomUUID(), c1,"Billy Joel", "19287340912874", "AMEX", "01/25", "989", LocalDate.parse("2020-09-01", DateTimeFormatter.ISO_LOCAL_DATE));
  allCustomers.add(c1);

 }

 public void addCustomer(Customer customer) {
  allCustomers.add(customer);

 }
 public void saveCustomer(Customer customer) {
  allCustomers.add(customer);
 }




}
