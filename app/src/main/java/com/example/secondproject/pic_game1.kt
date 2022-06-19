package com.example.secondproject

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import kotlinx.android.synthetic.main.pic_game1.*

class pic_game1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.pic_game1)

        setListeners()
    }

    private fun setListeners() {
        val clickableViews : List<View> =
            listOf(tvBox1,tvBox2,tvBox3,tvBox4,tvBox5,ConstraintLayout,btn_red,btn_green,btn_yellow)

        for(item in clickableViews){
            item.setOnClickListener {makecoloured(it)}
        }

    }

    private fun makecoloured(it: View) {
        when(it.id){
            // Boxes using Color class colors for background
            R.id.tvBox1 -> it.setBackgroundColor(Color.DKGRAY)
            R.id.tvBox2 -> it.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.tvBox3 -> it.setBackgroundResource(android.R.color.holo_green_light)
            R.id.tvBox4 -> it.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.tvBox5 -> it.setBackgroundResource(android.R.color.holo_green_light)

            // Boxes using custom colors for background
            R.id.btn_red -> tvBox3.setBackgroundResource(R.color.my_red)
            R.id.btn_green -> tvBox4.setBackgroundResource(R.color.my_green)
            R.id.btn_yellow -> tvBox5.setBackgroundResource(R.color.my_yellow)

            else -> it.setBackgroundColor(Color.LTGRAY)
        }
    }
}