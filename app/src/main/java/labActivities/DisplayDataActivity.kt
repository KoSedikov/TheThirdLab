package com.example.yourappname

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.thethirdlabactivities.R

class DisplayDataActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_data)

        // Получаем данные из Intent
        val userName = intent.getStringExtra("USERNAME")

        // Отображаем данные в TextView
        val textViewDisplay: TextView = findViewById(R.id.textViewDisplay)
        textViewDisplay.text = "Привет, $userName!"
    }
}