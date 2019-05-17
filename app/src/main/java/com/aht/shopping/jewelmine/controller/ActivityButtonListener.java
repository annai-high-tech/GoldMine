package com.aht.shopping.jewelmine.controller;


import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.aht.shopping.jewelmine.R;
import com.aht.shopping.jewelmine.core.model.interfaces.JewelMineFactory;
import com.aht.shopping.jewelmine.core.model.jewel.NormalJewels;
import com.aht.shopping.jewelmine.core.model.interfaces.IJewelCostCalculator;

import java.text.DecimalFormat;

public class ActivityButtonListener implements View.OnClickListener {

    private AppCompatActivity activity;

    private EditText rateTxt;
    private EditText quantityTxt;
    private EditText wastageTxt;
    private EditText makingTxt;
    private EditText gstTxt;
    private TextView total;
    private TextView errMsg;

    private IJewelCostCalculator rateCalculator = JewelMineFactory.createCostCalculator();

    public ActivityButtonListener(AppCompatActivity activity) {

        this.activity = activity;
        rateTxt = activity.findViewById(R.id.rate);
        quantityTxt = activity.findViewById(R.id.quantity);
        wastageTxt = activity.findViewById(R.id.wastage);
        makingTxt = activity.findViewById(R.id.making);
        gstTxt = activity.findViewById(R.id.gst);
        total = activity.findViewById(R.id.total);
        errMsg = activity.findViewById(R.id.errorMsg);

    }

    @Override
    public void onClick(View v) {

        NormalJewels data = JewelMineFactory.createNormalJewels();
        boolean status = false;
        double cost = 0.0;
        DecimalFormat decimalFormat = new DecimalFormat("#.00");

        errMsg.setText("");
        if(v.getId() == R.id.submit_button) {

            if(validateData()) {
                data.createJewel(
                        Float.parseFloat(rateTxt.getText().toString()),
                        Float.parseFloat(quantityTxt.getText().toString()),
                        Float.parseFloat(wastageTxt.getText().toString()),
                        Float.parseFloat(makingTxt.getText().toString()),
                        true);

                data.setGst(Float.parseFloat(gstTxt.getText().toString()));

                cost = rateCalculator.getTotalCost(data);
                status = !Double.isInfinite(cost);
            }
            else {
                System.out.println("Invalid Inputs");
                errMsg.setText("Invalid Inputs");
            }

            System.out.println("Status: " + status);

            if (status) {
                System.out.println("Total: " + decimalFormat.format(cost));
                total.setText(decimalFormat.format(cost));
            }
            else {
                total.setText("");
            }
        }
        else {
            reset();
        }
    }

    private void reset() {
        rateTxt.setText("");
        quantityTxt.setText("");
        wastageTxt.setText("");
        makingTxt.setText("");
        gstTxt.setText("");
        total.setText("");
    }

    private boolean validateData() {

        try {
            Float.parseFloat(rateTxt.getText().toString());
            Float.parseFloat(quantityTxt.getText().toString());
            Float.parseFloat(wastageTxt.getText().toString());
            Float.parseFloat(makingTxt.getText().toString());
            Float.parseFloat(gstTxt.getText().toString());
        }
        catch (NumberFormatException | NullPointerException nfe) {
            return false;
        }

        return true;
    }
}
