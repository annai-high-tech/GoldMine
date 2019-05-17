package com.aht.shopping.jewelmine.core.model.data;

public class Data {

    private double data;

    private boolean valid;

    public Data() {
        this(0.0, false);
    }

    public Data(double data, boolean valid) {
        this.data = data;
        this.valid = valid;
    }

    public double getData() {
        return data;
    }

    public void setData(double data) {
        this.data = data;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

}
