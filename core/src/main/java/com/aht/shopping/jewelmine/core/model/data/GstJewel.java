package com.aht.shopping.jewelmine.core.model.data;

public class GstJewel extends Jewel {

    private float gst;

    protected GstJewel() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false);
    }

    public GstJewel(float rate, float quantity, float wastage, float makingCharges, float gst, boolean selected) {
        super(rate, quantity, wastage, makingCharges, selected);
        this.gst = gst;
    }

    public float getGst() {
        return gst;
    }

    public void setGst(float gst) {
        this.gst = gst;
    }
}
