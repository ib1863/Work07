/**
 * @author		Idan Bunkin <idan.bunkin@gmail.com>
 * @version	1. (current version number of program)
 * @since		29/12/2022 (the date of the package the class was added)
 * this activity is creating a menu with 3 colors and changes the background color
 * by the color you choose from the menu
 */



package com.example.work07;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Short description.
     * this function create a menu with 3 colors
     *
     * @param	menu	the menu we are using
     * @return	true			the function ran properly.
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the activity
        getMenuInflater().inflate(R.menu.main, menu);
        return true;

    }

    /**
     * Short description.
     * this function changes the color of the background by the menu
     *
     * @param	item	the item the user choose from the menu
     * @return	true			the function ran properly.
     */
    public boolean onOptionsItemSelected(MenuItem item)
    {
        ConstraintLayout CL = findViewById(R.id.RL);
        String st = item.getTitle().toString();
        switch(st)
        {
            case "Black":
                CL.setBackgroundColor(Color.BLACK);
                break;
            case "Red":
                CL.setBackgroundColor(Color.RED);
                break;
            case "Yellow":
                CL.setBackgroundColor(Color.YELLOW);
                break;
        }
        return true;
    }

    /**
     * Short description.
     * this function moving to the next page when pressing the button
     *
     * @param	view	the activity we are using
     * @return	none
     */
    public void nextPage(View view) {
        Intent si = new Intent(this, MainActivity2.class);
        startActivity(si);
    }
}
