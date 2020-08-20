package com.example.kotlincoroutinepractices

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.*
import kotlinx.coroutines.Dispatchers.Main
import timber.log.Timber
import kotlin.system.measureTimeMillis


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnClick.setOnClickListener {
            CoroutineScope(Main+CoroutineName("my coroutine")).launch {
                suspenddd()
            }
        }



    }

    private suspend fun suspenddd() {
        val k = withContext(CoroutineName("my name 2")) {
            launch {
                delay(3000)
                log("launch1")
            }
            launch {
                delay(1000)
                log("launch2")
            }
        }

    }


    private fun logThread(methodName: String) {
        Timber.i("Debug: $methodName -- ${Thread.currentThread().name}")
    }

    private fun log(info: String) {
        Timber.i("Debug: $info")
    }

}



