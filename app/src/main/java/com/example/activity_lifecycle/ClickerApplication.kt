package com.example.activity_lifecycle

import android.app.Application
import timber.log.Timber


/**
 * @author CHOI
 * @email vviian.2@gmail.com
 * @created 2022-08-14
 * @desc
 */
class ClickerApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        Timber.plant(Timber.DebugTree())
    }
}