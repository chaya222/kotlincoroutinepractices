package com.example.kotlincoroutinepractices

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext


//--------------------------------------------------Suspended function
//private suspend fun makeFakeApiCall(){
//    logThread("getResult1FromApi")
//    val res = getResult1FromApi()
//    log("got result $res")
//}
//
//private suspend fun getResult1FromApi(): String {
//    delay(2000)
//    return "Result #1"
//}
//--------------------------------------------------Beginner launch example
//private suspend fun doSync(delayTime: Int) {
//    delay(1000L * delayTime)
//    log("child #$delayTime Success")
//}
//

//--------------------------------------------------Beginner Async parallel example
//private suspend fun getResult(delayTime: Int) {
//    delay(1000L * delayTime)
//    return "Result #$delayTime"
//}
//
//private suspend fun showOnMainThread(str: String) {
//    withContext(Dispatchers.Main) {
//        tvResult.text = "${tvResult.text}\n$str"
//    }
//}

//--------------------------------------------------Structure concurrency
//private suspend fun getResult(delayTime: Int): String {
//    delay(1000L * delayTime)
//    if (delayTime == 2)
//        throw Exception("Exception :  I am produced by $delayTime")
//    return "Result #$delayTime"
//}

//--------------------------------------------------whichThreadIamOn
//private fun whichThreadIamOn() {
//    GlobalScope.launch {
//        logThread("GlobalScope launch")
//    }
//
//    GlobalScope.async {
//        logThread("GlobalScope async")
//    }
//
//    lifecycleScope.launch {
//        logThread("GlobalScope lifecycleScope")
//    }
//
//    CoroutineScope(Dispatchers.IO).launch {
//        logThread("GlobalScope CoroutineScope")
//    }
//
//}
//
//--------------------------------------------------lifeCyclesScopeLaunchType
//private fun lifeCyclesScopeLaunchType() {
//    lifecycleScope.launchWhenCreated {
//        logThread("launchWhenCreated")
//    }
//    lifecycleScope.launchWhenResumed {
//        logThread("launchWhenResumed")
//    }
//    lifecycleScope.launchWhenStarted {
//        logThread("launchWhenStarted")
//    }
//
//}
