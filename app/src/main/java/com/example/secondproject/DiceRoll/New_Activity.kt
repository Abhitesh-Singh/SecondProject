package com.example.secondproject.DiceRoll

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.secondproject.R
import kotlinx.android.synthetic.main.roll_dice_main.*

class New_Activity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.roll_dice_main)

        btn_roll.setOnClickListener {
            val random_num = (1..6).random()
            val drawable_res = when(random_num){
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }

            diceView.setImageResource(drawable_res)
        }
    }
}