package com.hedroid.menubar

import android.os.Bundle
import android.widget.Button

import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

   private val customMenu = CustomMenu()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

       setContentView(R.layout.activity_main)
       val showPopup = findViewById<Button>(R.id.btn_menu)
        showPopup.setOnClickListener{
            customMenu.customMenu(this,it)
        }
    }
}