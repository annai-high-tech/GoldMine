package com.aht.entertainment.goldmine.data;

public class GoldData {

    private double rate;

    private double quantity;

    private float wastagePercentage;

    private float makingCharge;

    private float gst;

    private double totalCost;

    private GoldData(double rate,
                     double quantity,
                     float wastagePercentage,
                     float makingCharge,
                     float gst,
                     double totalCost) {
        this.rate = rate;
        this.quantity = quantity;
        this.wastagePercentage = wastagePercentage;
        this.makingCharge = makingCharge;
        this.gst = gst;
        this.totalCost = totalCost;
    }

    public GoldData(double rate, float gst) {
        this(rate, 0.0, 0.0f, 0.0f, gst, 0);
    }

    public GoldData(double rate) {
        this(rate, 0.0, 0.0f, 0.0f, 0.0f, 0);
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public float getWastagePercentage() {
        return wastagePercentage;
    }

    public void setWastagePercentage(float wastagePercentage) {
        this.wastagePercentage = wastagePercentage;
    }

    public float getMakingCharge() {
        return makingCharge;
    }

    public void setMakingCharge(float makingCharge) {
        this.makingCharge = makingCharge;
    }

    public float getGst() {
        return gst;
    }

    public void setGst(float gst) {
        this.gst = gst;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
}
