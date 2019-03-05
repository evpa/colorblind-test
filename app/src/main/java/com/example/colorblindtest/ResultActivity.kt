package com.example.colorblindtest

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    val groundTruth = listOf(12, 8, 29, 5, 3, 15, 74, 6, 45, 5)
    var truthCounter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val resultList = intent.getIntegerArrayListExtra("numlist")

        for(i in groundTruth){
            if(i in resultList){
                truthCounter++
            }
        }

        if(truthCounter >= 9){
            resultTxt.text = "You don't have color blindness!"
            resultTxt.setTextColor(Color.parseColor("#00e500"))
        } else {
            resultTxt.text = "You have color blindness!"
        }
    }


}
