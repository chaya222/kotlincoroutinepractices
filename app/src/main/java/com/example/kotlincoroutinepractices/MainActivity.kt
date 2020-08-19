package com.example.kotlincoroutinepractices

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
    }

    fun whichThreadIamOn(){
        GlobalScope.launch {
            println("TestingCoroutines--GlobalScope--" + Thread.currentThread().name)
        }

        GlobalScope.async {
            println("TestingCoroutines--GlobalScopeAsync--" + Thread.currentThread().name)
        }

        lifecycleScope.launch {
            println("TestingCoroutines--lifecycleScope--" + Thread.currentThread().name)
        }

        CoroutineScope(CoroutineName("hello")).launch {
            println("TestingCoroutines--CoroutineScope--" + Thread.currentThread().name)
        }

    }


    override fun onResume() {
        super.onResume()
        lifecycleScope.launchWhenCreated {
            //println("TestingCoroutines--launchWhenCreated" + lifecycle.currentState.name)
        }
        lifecycleScope.launchWhenResumed {
            // println("TestingCoroutines--launchWhenResumed" + lifecycle.currentState.name)
        }
        lifecycleScope.launchWhenStarted {
            //println("TestingCoroutines--launchWhenStarted" + lifecycle.currentState.name)
        }

    }


}



