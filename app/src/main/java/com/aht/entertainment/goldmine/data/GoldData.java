package com.aht.entertainment.goldmine.data;

public class GoldData implements IGoldData {

    private float rate;

    private float quantity;

    private float wastagePercentage;

    private float makingCharge;

    private float gst;

    private double totalCost;

    private GoldData(float rate,
                     float quantity,
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

    public GoldData(float rate, float gst) {
        this(rate, 0.0f, 0.0f, 0.0f, gst, 0);
    }

    public GoldData(float rate) {
        this(rate, 0.0f, 0.0f, 0.0f, 0.0f, 0);
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    @Override
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

    @Override
    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    @Override
    public boolean isTotalCostValid() {
        return !Double.isInfinite(this.totalCost);
    }

    @Override
    public boolean isWastagePercentageValid() {
        return wastagePercentage >= 0.0f;
    }
}
