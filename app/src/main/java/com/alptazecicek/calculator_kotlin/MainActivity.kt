package com.alptazecicek.calculator_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.alptazecicek.calculator_kotlin.databinding.ActivityMainBinding




class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var number1 : Int? = null
    var number2 : Int? = null
    var result : Int? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)



    }

    fun sum(view: View) {

        number1 = binding.editTextNumber.text.toString().toIntOrNull()
        number2 = binding.editTextNumber2.text.toString().toIntOrNull()
        if (number1 == null || number2 == null) {
            binding.textView.text = "Error!"
        }
        else {
            result = number1!! + number2!!
            binding.textView.text = "Result ${result}"
        }


        //binding.textView.text = (binding.editTextNumber.text.toString().toInt() + binding.editTextNumber2.text.toString().toInt()).toString()


    }

    fun substraction(view: View) {
        number1 = binding.editTextNumber.text.toString().toIntOrNull()
        number2 = binding.editTextNumber2.text.toString().toIntOrNull()
        if (number1 == null || number2 == null) {
            binding.textView.text = "Error!"
        }
        else {
            result = number1!! - number2!!
            binding.textView.text = "Result ${result}"
        }
    }

    fun multiply(view: View) {
        number1 = binding.editTextNumber.text.toString().toIntOrNull()
        number2 = binding.editTextNumber2.text.toString().toIntOrNull()
        if (number1 == null || number2 == null) {
            binding.textView.text = "Error!"
        }
        else {
            result = number1!! * number2!!
            binding.textView.text = "Result ${result}"
    }
    }

    fun div(view: View) {
        number1 = binding.editTextNumber.text.toString().toIntOrNull()
        number2 = binding.editTextNumber2.text.toString().toIntOrNull()
        if (number1 == null || number2 == null) {
            binding.textView.text = "Error!"
        }
        else {
            result = number1!! / number2!!
            binding.textView.text = "Result ${result}"
    }
    }
}