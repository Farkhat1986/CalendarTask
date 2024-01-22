package com.example.calendarlist

import android.app.Application
import com.example.calendarlist.data.MainDb

class App : Application(){
    val database by lazy { MainDb.createDataBase(this) }
}