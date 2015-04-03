package com.example.reeves.flickr_viewr;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private Button btnLocations;
    private Button btnPictures;
    private Button btnSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLocations = (Button)findViewById(R.id.btnLocations);

        btnLocations.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view){
                // code here
                Toast.makeText(MainActivity.this, "here",
                        Toast.LENGTH_SHORT).show();
            }
        });

        btnPictures = (Button)findViewById(R.id.btnPictures);

        btnPictures.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view){
                // code here
                Toast.makeText(MainActivity.this, "shoot me",
                        Toast.LENGTH_SHORT).show();
            }
        });

        btnSearch = (Button)findViewById(R.id.btnSearch);

        btnLocations.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view){
                // code here
                Toast.makeText(MainActivity.this, "where",
                        Toast.LENGTH_SHORT).show();
            }
        });

    }

}
