package com.example.secondproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.secondproject.AboutMe
import com.example.secondproject.DiceRoll.New_Activity
import com.example.secondproject.ToDoList.SecondActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnToDo.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        btnrolldice.setOnClickListener {
            val intent = Intent(this, New_Activity::class.java)
            startActivity(intent)
        }

        btn_new.setOnClickListener {
            val intent = Intent(this, AboutMe::class.java)
            startActivity(intent)
        }

        btnPic.setOnClickListener {
            val intent = Intent(this, pic_game1::class.java)
            startActivity(intent)
        }

    }
}