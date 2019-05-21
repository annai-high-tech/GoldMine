package com.aht.shopping.jewelmine.app.view;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import com.aht.shopping.jewelmine.app.R;
import com.aht.shopping.jewelmine.app.controller.ActivityButtonListener;
import com.aht.shopping.jewelmine.app.controller.ActivityTextListener;
import com.aht.shopping.jewelmine.app.controller.NavigationMenuListener;
import com.aht.shopping.jewelmine.app.controller.ShareButtonListener;

public class MainActivity extends AppCompatActivity {

    private ActivityButtonListener buttonListener = null;
    private ActivityTextListener textListener = null;
    private ShareButtonListener shareListener = null;
    private NavigationMenuListener navListener = null;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		
		buttonListener = new ActivityButtonListener(this);
        textListener = new ActivityTextListener(this);
        shareListener = new ShareButtonListener(this);
        navListener = new NavigationMenuListener(this);

        findViewById(R.id.submit_button).setOnClickListener(buttonListener);
        findViewById(R.id.reset_button).setOnClickListener(buttonListener);
        findViewById(R.id.rate).setOnTouchListener(textListener);
        findViewById(R.id.quantity).setOnTouchListener(textListener);
        findViewById(R.id.wastage).setOnTouchListener(textListener);
        findViewById(R.id.making).setOnTouchListener(textListener);
        findViewById(R.id.gst).setOnTouchListener(textListener);
        findViewById(R.id.share_app).setOnClickListener(shareListener);


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(navListener);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
