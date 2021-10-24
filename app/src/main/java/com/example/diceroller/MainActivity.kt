package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var diceImage: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.rollButton)
        rollButton.setOnClickListener() {
            rolldice()
            Toast.makeText(this, "rolled", Toast.LENGTH_SHORT).show()
        }
        diceImage = findViewById(R.id.dice_image)
    }
    //function for rollin the dice
    private fun rolldice(){
        val rollDisplay:TextView=findViewById(R.id.rolltext)
        //code generates random nums
      val randomnum =(1..6).random()
        rollDisplay.text= "the number you rolled is $randomnum"
        //allign image with num generated
        var drawableResource=when(randomnum){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else->R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)

    }
}