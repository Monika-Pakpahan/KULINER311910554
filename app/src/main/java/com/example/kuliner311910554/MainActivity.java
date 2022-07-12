package com.example.kuliner311910554;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bnvMenuBawah;

    @Override
    protected void onCreate(Bundle savedIntanceState) {
        super.onCreate(savedIntanceState);
        setContentView(R.layout.activity_main);

        bnvMenuBawah = findViewById(R.id.bnv_menu);

        bnvMenuBawah.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item)
            {
                Fragment FR = null;

                switch (item.getItemId()){

                    case R.id.menu_home:
                        FR = new HomeFragment();
                        getSupportActionBar();setTitle("Home");
                    break;

                    case R.id.menu_web:
                        FR = new WebFragment();
                        getSupportActionBar();setTitle("Web");
                        break;

                    case R.id.menu_About:
                        FR = new AboutFragment();
                        getSupportActionBar();setTitle("About");
                        break;
                }

                return true;
            }


            });
        }
}