package com.example.kotlincoroutinepractices





//--------------------------------------------------beginner example
//private suspend fun showResult() {
//    val time = measureTimeMillis {
//        val result1 = getResult1FromApi()
//        setTextOnMainThread(result1)
//        val result2 = getResult2FromApi(result1)
//        setTextOnMainThread(result2)
//    }
//    log(time.toString())
//}
//
//private suspend fun setTextOnMainThread(res: String) {
//    withContext(Dispatchers.Main) {
//        tvResult.text = "${tvResult.text}\n$res"
//    }
//}
//
//private suspend fun getResult1FromApi(): String {
//    logThread("getResult1FromApi")
//    delay(1000)
//    return "Result #1"
//}
//
//private suspend fun getResult2FromApi(res1: String): String {
//    logThread("getResult2FromApi")
//    delay(2000)
//    return "Result #2 $res1"
//}
//
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
