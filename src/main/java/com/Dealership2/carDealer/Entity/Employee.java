package com.Dealership2.carDealer.Entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Employee {
    private String eeID;
    private String password;


    public void Employee(){

    }
  public String getEeID(){
        return eeID;
  }

    public void setEeID(String eeID) {
        this.eeID = eeID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}


