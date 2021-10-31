package com.dicoding.tourismapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
open class MyApplication: Application() {

//    private val coreComponent: CoreComponent by lazy {
//        DaggerCoreComponent.factory().create(applicationContext)
//    }
//
//    val appComponent: AppComponent by lazy {
//        DaggerAppComponent.factory().create(coreComponent)
//    }

}

// Karena AppComponent membutuhkan CoreComponent, maka Anda perlu membuat CoreComponent terlebih dahulu dan selanjutnya memasukkannya sebagai parameter ketika create AppComponent, sesuai dengan yang ada di berkas AppComponent.