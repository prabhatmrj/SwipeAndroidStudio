package com.example.calendarexample;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class HeaderToolBar extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_header_toolbar);
        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id=item.getItemId();
        if (id==R.id.share){
            Toast.makeText(this, "share", Toast.LENGTH_SHORT).show();
        }
        if (id==R.id.search){
            Toast.makeText(this, "search", Toast.LENGTH_SHORT).show();

        }
        if (id==R.id.setting){
            Toast.makeText(this, "setting", Toast.LENGTH_SHORT).show();

        }
        if (id==R.id.exit){
            Toast.makeText(this, "exit", Toast.LENGTH_SHORT).show();

        }
        if (id==R.id.about){
            Toast.makeText(this, "about", Toast.LENGTH_SHORT).show();

        }

        return true;
    }
}
