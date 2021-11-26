package DTO;

public class Bid {

    private String vin;
    private double bid;


    public Bid(String vin, double bid) {
        this.vin = vin;
        this.bid = bid;


    }

    public void getMaxDiscount(double price) {
        if (bid <= (price - (price * .1))) {
            System.out.println("Offer Accepted, Congratulations! \n Your new total is, " + (price - bid));
        } else {
            System.out.println("Unfortunately, this price cannot be accommodated, please contact a sales expert for further negotiation.");

        }

    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public double getBid() {
        return bid;
    }

    public void setBid(double bid) {
        this.bid = bid;
    }


}
