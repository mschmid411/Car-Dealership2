package com.Dealership2.carDealer.Entity;

import java.util.UUID;

public class Employee {
    private UUID eeID;
    private String password;


    public void Employee(){

    }
  public UUID getEeID(){
        return eeID;
  }

    public void setEeID(UUID eeID) {
        this.eeID = UUID.randomUUID();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}


