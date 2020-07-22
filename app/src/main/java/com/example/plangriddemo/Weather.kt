package com.example.plangriddemo

import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import java.util.*

class Weather {

    private val random = Random()

    fun getSensorObservable(): Observable<Int> {
        return generateFakeWeatherInfo()
    }

    private fun generateFakeWeatherInfo(): Observable<Int> {
        return Observable.just(random.nextInt())
            .observeOn(AndroidSchedulers.mainThread())
    }
}