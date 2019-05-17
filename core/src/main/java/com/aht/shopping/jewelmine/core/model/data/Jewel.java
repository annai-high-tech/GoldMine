package com.aht.shopping.jewelmine.core.model.data;

public class Jewel {

    private boolean selected;

    private float rate;

    private float quantity;

    private float wastage;

    private float makingCharges;

    protected Jewel() {
        this(0.0f, 0.0f, 0.0f, 0.0f, false);
    }

    public Jewel(float rate, float quantity, float wastage, float makingCharges, boolean selected) {
        this.rate = rate;
        this.quantity = quantity;
        this.wastage = wastage;
        this.makingCharges = makingCharges;
        this.selected = selected;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
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

    public float getWastage() {
        return wastage;
    }

    public void setWastage(float wastage) {
        this.wastage = wastage;
    }

    public float getMakingCharges() {
        return makingCharges;
    }

    public void setMakingCharges(float makingCharges) {
        this.makingCharges = makingCharges;
    }
}
