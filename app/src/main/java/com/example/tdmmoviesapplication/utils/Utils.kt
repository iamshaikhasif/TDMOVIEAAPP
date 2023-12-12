package com.example.tdmmoviesapplication.utils

import android.util.Log

class Utils {

    companion object {
        private var mInstant: Utils? = null
        fun getInstance() = mInstant ?: synchronized(this){
            Utils().also { mInstant = it }
        }
    }


    fun logDebug(tag:String = "TAG", msg:String = ""){
        Log.d(tag, msg)
    }

}