package com.example.kotlincoroutinepractices

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.*
import kotlinx.coroutines.Dispatchers.IO
import timber.log.Timber


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnClick.setOnClickListener {

            val parentJob = Job()
           val deferredResult =  CoroutineScope(Dispatchers.IO+parentJob+IO).launch {
                makeFakeApiCall()
            }



        }

    }

    private suspend fun makeFakeApiCall() {
        logThread("getResult1FromApi")
        val res = getResult1FromApi()
        log("got result $res")
    }

    private suspend fun getResult1FromApi(): String {
        delay(2000)
        return "Result #1"
    }


    private fun logThread(methodName: String) {
        Timber.i("Debug: $methodName -- ${Thread.currentThread().name}")
    }

    private fun log(info: String) {
        Timber.i("Debug: $info")
    }

}



