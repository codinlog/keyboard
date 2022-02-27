package com.codinlogkeyboard

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class KeyboardApplication:Application() {

    override fun onCreate() {
        super.onCreate()
        _CTX= this.applicationContext
    }


    companion object{
        @SuppressLint("StaticFieldLeak")
        private var _CTX:Context? = null
        val CTX:Context
            get() = _CTX!!
    }

}