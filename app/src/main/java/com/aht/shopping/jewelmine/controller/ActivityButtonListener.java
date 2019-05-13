package com.aht.shopping.jewelmine.controller;


import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.aht.shopping.jewelmine.R;
import com.aht.shopping.jewelmine.data.JewelData;
import com.aht.shopping.jewelmine.data.enums.JewelType;
import com.aht.shopping.jewelmine.model.JewelMineFactory;
import com.aht.shopping.jewelmine.model.jewel.IJewelRateCalculator;

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

    private IJewelRateCalculator rateCalculator = JewelMineFactory.getInstance(JewelType.GOLD);

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

        JewelData data = new JewelData();
        boolean status;
        DecimalFormat decimalFormat = new DecimalFormat("#.00");

        if(v.getId() == R.id.submit_button) {
            data.setRate(Float.parseFloat(rateTxt.getText().toString()));
            data.setQuantity(Float.parseFloat(quantityTxt.getText().toString()));
            data.setWastagePercentage(Float.parseFloat(wastageTxt.getText().toString()));
            data.setMakingCharge(Float.parseFloat(makingTxt.getText().toString()));
            data.setGst(Float.parseFloat(gstTxt.getText().toString()));

            status = rateCalculator.updatePriceList(data);

            System.out.println("Status: " + status);

            if (status) {
                System.out.println("Total: " + decimalFormat.format(data.getTotalCost()));
                total.setText(decimalFormat.format(data.getTotalCost()));
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
