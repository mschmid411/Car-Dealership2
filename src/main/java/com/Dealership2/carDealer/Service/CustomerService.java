package com.Dealership2.carDealer.Service;

import com.Dealership2.carDealer.Entity.Customer;
import org.springframework.stereotype.Service;
import java.util.ArrayList;


@Service
public class CustomerService {

    // private variable, taken from mvc lab student service
    private ArrayList<Customer> customers;

    //constructor for customer service directory
    public CustomerService() {
        customers = new ArrayList<Customer>();

    }

    public void saveCustomer(Customer customer){
       customers.add(customer);
    }
    public ArrayList<Customer> getCustomers() {
    return customers;
    }
}
