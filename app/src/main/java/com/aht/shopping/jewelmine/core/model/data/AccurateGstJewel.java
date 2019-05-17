package com.aht.shopping.jewelmine.core.model.data;

public class AccurateGstJewel extends Jewel {

    private float jewelGst;

    private float makingChargeGst;

    private float customsDuty;

    public AccurateGstJewel(float rate, float quantity, float wastage, float makingCharges, float jewelGst, float makingChargeGst, float customsDuty, boolean selected) {
        super(rate, quantity, wastage, makingCharges, selected);
        this.jewelGst = jewelGst;
        this.makingChargeGst = makingChargeGst;
        this.customsDuty = customsDuty;
    }

    public float getJewelGst() {
        return jewelGst;
    }

    public void setJewelGst(float jewelGst) {
        this.jewelGst = jewelGst;
    }

    public float getMakingChargeGst() {
        return makingChargeGst;
    }

    public void setMakingChargeGst(float makingChargeGst) {
        this.makingChargeGst = makingChargeGst;
    }

    public float getCustomsDuty() {
        return customsDuty;
    }

    public void setCustomsDuty(float customsDuty) {
        this.customsDuty = customsDuty;
    }
}
