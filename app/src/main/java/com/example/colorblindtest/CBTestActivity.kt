package com.example.colorblindtest

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.view.View
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_cbtest.*

class CBTestActivity : AppCompatActivity() {

    var cbImg = "plate1"
    var i = 1
    val numberList = arrayListOf<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cbtest)
        setSupportActionBar(toolbar)


    }

    fun CBBtnClick(view: View){
        if(CBTxt.text.toString() != ""){
            i++
            cbImg = "plate$i"
            val resourceId = resources.getIdentifier(cbImg, "drawable", packageName)
            CBImageView.setImageResource(resourceId)
            numberList.add(CBTxt.text.toString().toInt())

            println(numberList)

            if(i>10){
                val CBIntent = Intent(this, ResultActivity::class.java)
                CBIntent.putIntegerArrayListExtra("numlist", numberList)
                startActivity(CBIntent)
            }
        } else {
            Toast.makeText(this, "Please enter a number!", Toast.LENGTH_SHORT).show()

        }



    }

}
