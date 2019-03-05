package com.example.colorblindtest

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun startBtnClicked(view: View){
        val startIntent = Intent(this, CBTestActivity::class.java)
        startActivity(startIntent)
    }
}
