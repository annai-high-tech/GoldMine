package com.aht.shopping.jewelmine.controller;


import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.aht.shopping.jewelmine.R;

public class ActivityTextListener implements View.OnTouchListener {

    private AppCompatActivity activity;

    private EditText rateTxt;
    private EditText quantityTxt;
    private EditText wastageTxt;
    private EditText makingTxt;
    private EditText gstTxt;

    private TextView total;


    public ActivityTextListener(AppCompatActivity activity) {

        this.activity = activity;
        rateTxt = activity.findViewById(R.id.rate);
        quantityTxt = activity.findViewById(R.id.quantity);
        wastageTxt = activity.findViewById(R.id.wastage);
        makingTxt = activity.findViewById(R.id.making);
        gstTxt = activity.findViewById(R.id.gst);
        total = activity.findViewById(R.id.total);

    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {

        return false;
    }
}
