package com.example.learning

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (supportActionBar != null)
            supportActionBar?.hide()
        val diceImage: ImageView = findViewById(R.id.diceImage)
        diceImage.setOnClickListener{
            rollDice(diceImage)
        }
    }

    private fun rollDice(diceImage: ImageView)
    {
        val drawableResource =  when(Random().nextInt(6) +1){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6

        }
        diceImage.setImageResource(drawableResource)
    }
}