package com.aht.shopping.jewelmine.app.controller;


import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.aht.shopping.jewelmine.app.BuildConfig;
import com.aht.shopping.jewelmine.app.R;
import com.aht.shopping.jewelmine.app.model.ShareApp;


public class ShareButtonListener implements View.OnClickListener {

    private AppCompatActivity activity;
    private ShareApp shareApp;

    private Button submitBtn;
    private View pageView;


    public ShareButtonListener(AppCompatActivity activity) {

        this.activity = activity;
        pageView = activity.findViewById(R.id.contentLayout);

        shareApp = new ShareApp();
    }

    @Override
    public void onClick(View v) {

        String appName = activity.getResources().getString(R.string.app_name);
        String appLink = activity.getResources().getString(R.string.app_link, BuildConfig.APPLICATION_ID);
        String message = activity.getResources().getString(R.string.share_text, appName, appLink);

        switch (v.getId()) {
            case R.id.share_app:
                shareApp.shareText(activity, message);
                break;

            default:
                break;
        }

    }

}
