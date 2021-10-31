package com.dicoding.tourismapp.core.di

import com.dicoding.tourismapp.core.data.TourismRepository
import com.dicoding.tourismapp.core.domain.repository.ITourismRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module(includes = [NetworkModule::class, DatabaseModule::class])
@InstallIn(SingletonComponent::class) // Module menggunakan Component yg mana, Di sini RepositoryModule masuk ke SingletonComponent karena ia merupakan Component dengan hirarki tertinggi yang bisa digunakan di mana saja.
abstract class RepositoryModule {

    @Binds
    abstract fun provideRepository(tourismRepository: TourismRepository): ITourismRepository

}