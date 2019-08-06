package com.aht.shopping.jewelmine.app.controller;

import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.aht.shopping.jewelmine.app.BuildConfig;
import com.aht.shopping.jewelmine.app.R;
import com.aht.shopping.jewelmine.app.model.ShareApp;
import com.google.android.material.navigation.NavigationView;

public class NavigationMenuListener implements NavigationView
        .OnNavigationItemSelectedListener {

    private AppCompatActivity activity;
    private ShareApp shareApp;

    private View pageView;

    public NavigationMenuListener(AppCompatActivity activity) {

        this.activity = activity;
        pageView = activity.findViewById(R.id.contentLayout);

        shareApp = new ShareApp();
    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        String appName = activity.getResources().getString(R.string.app_name);
        String appLink = activity.getResources().getString(R.string.app_link, BuildConfig.APPLICATION_ID);
        String message = activity.getResources().getString(R.string.share_text, appName, appLink);

        switch (menuItem.getItemId()) {
            case R.id.nav_share:
                shareApp.shareText(activity, message);
                break;

            case R.id.nav_send:
                shareApp.shareReport(activity, pageView, message);
                break;

            default:
                break;
        }

        DrawerLayout drawer = activity.findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);

        return true;
    }
}


