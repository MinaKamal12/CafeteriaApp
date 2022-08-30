package com.example.myapplication

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.eva.cafeteriaapp.R

class MainActivity : AppCompatActivity() {
    var i = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(findViewById(R.id.my_toolbar))


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_bar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.search -> {
                // User chose the "Settings" item, show the app settings UI...
                true
            }

            R.id.cart -> {

                true
            }
        }
        return super.onOptionsItemSelected(item)


        val FoodIncrement = findViewById<Button>(R.id.increment)
        FoodIncrement.setOnClickListener {
            val MealsNumber = i++;
            Toast.makeText(this, "Meal Quantity incremented", Toast.LENGTH_SHORT).show()

        }

        val FoodDecrement = findViewById<Button>(R.id.decrement)
        FoodDecrement.setOnClickListener {
            val MealsNumber = i--;
            Toast.makeText(this, "Meal Quantity decremented", Toast.LENGTH_SHORT).show()

        }

    }


}


