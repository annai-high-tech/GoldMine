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
    private Button submitBtn;
    private TextView total;

    private IJewelCostCalculator rateCalculator = JewelMineFactory.createCostCalculator();

    public ActivityButtonListener(AppCompatActivity activity) {

        this.activity = activity;
        rateTxt = activity.findViewById(R.id.rate);
        quantityTxt = activity.findViewById(R.id.quantity);
        wastageTxt = activity.findViewById(R.id.wastage);
        makingTxt = activity.findViewById(R.id.making);
        gstTxt = activity.findViewById(R.id.gst);
        total = activity.findViewById(R.id.total);

    }

    @Override
    public void onClick(View v) {

        NormalJewels data = JewelMineFactory.createNormalJewels();
        boolean status;
        double cost;
        DecimalFormat decimalFormat = new DecimalFormat("#.00");

        if(v.getId() == R.id.submit_button) {

            data.createJewel(
                    Float.parseFloat(rateTxt.getText().toString()),
                    Float.parseFloat(quantityTxt.getText().toString()),
                    Float.parseFloat(wastageTxt.getText().toString()),
                    Float.parseFloat(makingTxt.getText().toString()),
                    true);

            data.setGst(Float.parseFloat(gstTxt.getText().toString()));

            cost = rateCalculator.getTotalCost(data);
            status = Double.isInfinite(cost);

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
}
