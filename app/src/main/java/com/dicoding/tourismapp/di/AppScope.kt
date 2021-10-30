package com.dicoding.tourismapp.di

import javax.inject.Scope

@Scope // harus memiliki scope yg lbh tinggi biar kedua Component gk make @AppScope yg sama
@Retention(AnnotationRetention.RUNTIME)
annotation class AppScope

// Mengapa kedua component tersebut tidak boleh memiliki scope yang sama? Hal ini karena kedua component tidak memiliki lifecycle yang sama.


