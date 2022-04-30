package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val foodlist = arrayListOf("Chines","Hamburger","Pizza","McDonalds","Dunkin")


        val selectedFoodTxt = findViewById<TextView>(R.id.selectedFoodTxt)
        //selectedFoodTxt.text = "Burger King"
        val addFoodbtn = findViewById<TextView>(R.id.adFoodBtn)
        val addFoodTxt = findViewById<TextView>(R.id.addFoodTxt)

        val decideBtn = findViewById<Button>(R.id.decideBtn)
       decideBtn.setOnClickListener {
           //println("You click me!")
           val random = java.util.Random()
           val randomFood = random.nextInt(foodlist.count())
           selectedFoodTxt.text = foodlist[randomFood]
       }
        addFoodbtn.setOnClickListener {
            val newFood = addFoodTxt.text.toString()
            foodlist.add(newFood)
            addFoodTxt.setText("")
            println(foodlist)
        }
    }
}