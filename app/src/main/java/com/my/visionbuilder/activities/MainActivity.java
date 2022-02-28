package com.my.visionbuilder.activities;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.google.android.material.navigation.NavigationView;
import com.my.visionbuilder.R;

public class MainActivity extends AppCompatActivity {

    NavController navController;
    ImageView ivDrawer;
    private DrawerLayout drawerLayout;
    NavigationView navigationView;
    CardView main_Container;
    RelativeLayout btn_Logout;
    ImageView btn_Cross;
    private static final float END_SCALE = 0.7f;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.drawer_Nav);
        setTopStatusBarColor();

        ivDrawer = findViewById(R.id.menu_ic);
        main_Container = findViewById(R.id.main_Container);

        initNavigation();

        View headerView =  navigationView.getHeaderView(0);
    }

    private void initNavigation() {
        ivDrawer.setOnClickListener(v -> {
            drawerLayout.openDrawer(GravityCompat.START, true);
            /*Navigation drawer with transparent background*/
        });
        navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupWithNavController(navigationView, navController);
        navigationView.setItemIconTintList(null);
        View mView = LayoutInflater.from(MainActivity.this).inflate(R.layout.nav_header_main, null);
//            RelativeLayout item = (RelativeLayout)findViewById(R.id.nav_header_main);
//            View child = getLayoutInflater().inflate(R.layout.nav_header_main, null);

//            navigationView.getMenu().findItem(R.id.navigation_about).setOnMenuItemClickListener(item -> {
//                startActivity(new Intent(MainActivity.this, AboutActivity.class));
//                drawerLayout.closeDrawer(GravityCompat.START, false);
//                return true;
//            });
//            navigationView.getMenu().findItem(R.id.navigation_ourCollections).setOnMenuItemClickListener(item -> {
//                startActivity(new Intent(MainActivity.this, ArtsCollectionActivity.class));
//                drawerLayout.closeDrawer(GravityCompat.START, false);
//                return true;
//            });
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void setTopStatusBarColor(){
        Window window = MainActivity.this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(MainActivity.this,R.color.colorPrimaryDark));
    }

}