package com.example.calendarlist

import android.app.DatePickerDialog
import android.content.Intent
import android.icu.util.Calendar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.compose.material3.DatePicker
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    val c = Calendar.getInstance()
    val year = c.get(Calendar.YEAR)
    val month= c.get(Calendar.MONTH)
    val day= c.get(Calendar.DAY_OF_MONTH)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        calendarView.setOnDateChangeListener {
            view, yeat, month, dayOfMonth ->
            textView.text = "$dayOfMonth.${month + 1}.$year"
        }
    }
    fun onClickGoTask(view : View){
        val intent = Intent(this, Roomdb::class.java)
        startActivity(intent)

    }
}


    


