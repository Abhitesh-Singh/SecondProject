package com.example.secondproject

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.secondproject.databinding.ActivityThirdBinding
import kotlinx.android.synthetic.main.activity_third.*

class AboutMe : AppCompatActivity(){

    private lateinit var binding: ActivityThirdBinding

    private val myName : MyName = MyName("Abhitesh Singh") //variable of type MyName which has a value for name

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_third)

        binding.myName = myName //here we are assigning the layout variable myName to here private one

        binding.btnDone.setOnClickListener {
            myName.nickname = etNickname.text.toString()
            binding.myName = myName //now the text you enteed stored in private val assigned to layout one variable which it shows
            btn_done.visibility = View.GONE
            etNickname.visibility = View.GONE
            tvNickname.visibility = View.VISIBLE
            hideKeyboard(it)
        }
    }
    // Hide the keyboard code -->
    private fun hideKeyboard(it: View) {
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(it.windowToken, 0)
    }
}