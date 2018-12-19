package br.com.ramonilho.androidstyledictionary

import android.util.Log

class LogDebug {
    companion object {
        val TAG: String = "LogDebugLibrary"

        fun d(message: String) {
            Log.d(TAG, message)
        }
    }
}