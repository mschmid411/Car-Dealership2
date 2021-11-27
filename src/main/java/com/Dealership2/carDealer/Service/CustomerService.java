package com.Dealership2.carDealer.Service;

import com.Dealership2.carDealer.Database.MockDatabaseCustomers;
import com.Dealership2.carDealer.Entity.Car;
import com.Dealership2.carDealer.Entity.Customer;
import com.Dealership2.carDealer.Entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.UUID;


@Service
public class CustomerService {

    // private variable
  //  private ArrayList<Customer> customers;

    @Autowired
    MockDatabaseCustomers mockDatabaseCustomers;

    //constructor for customer service directory
    public CustomerService() {


    }

    // method to save new customer
    public void saveCustomer(Customer customer){
        mockDatabaseCustomers.addCustomer(customer);
    }

    public ArrayList<Customer> getCustomers() {
        return mockDatabaseCustomers.getAllCustomers();
    }

    public Customer getFirstCustomer() {
        return getCustomers().get(0);


    }

    // method to find single customer

    public Customer getCustomer(UUID customerId) {
            Customer customer = new Customer();
            for (Customer temp : mockDatabaseCustomers.getAllCustomers()) {
                UUID idList = temp.getCustomerId();
                if (customerId == idList) {
                    customer = temp;
                    return customer;
                }
            }
            return null;
    }


}
