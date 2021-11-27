package DTO;


import com.Dealership2.carDealer.Entity.Car;

import java.lang.constant.Constable;
import java.text.NumberFormat;

public class Bid {

    private int vin;
    private double offer;


    public Bid() {

    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public double getOffer() {
        return offer;
    }

    public void setOffer(double offer) {
        this.offer = offer;
    }


    public Bid(int vin, double offer) {
        this.vin = vin;
        this.offer = offer;
    }

    public double maxDiscountPrice(double offer, Car promoCar) {
        double maxDiscount = promoCar.getPrice() - (promoCar.getPrice() * .1);
        if (offer >= maxDiscount) {
            return offer;
        } else {
            return 0;
        }
    }

    public String formatPrice(double offer) {
        NumberFormat formatPrice = NumberFormat.getCurrencyInstance();
        return (formatPrice.format(this.offer));

    }

    }





