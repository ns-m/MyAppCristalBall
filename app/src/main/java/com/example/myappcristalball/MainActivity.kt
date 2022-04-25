package com.example.myappcristalball

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myappcristalball.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.textViewPrediction.setOnClickListener {
            binding.textViewPrediction.text = getPrediction()
        }
    }
    private fun randomNumber(): Int{
        val sizeArray = resources.getStringArray(R.array.prediction).size - 1
        return (0..sizeArray).random()
    }
    private fun getPrediction(): String{
        return resources.getStringArray(R.array.prediction)[randomNumber()]
    }
}