package com.example.calendarlist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.calendarlist.databinding.ActivityTaskBinding

class Task : AppCompatActivity() {
    lateinit var bindingClass : ActivityTaskBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityTaskBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
    }

    fun onClickEx(view : View){
        val intent2 = Intent(this, MainActivity::class.java)
        startActivity(intent2)
    }
}