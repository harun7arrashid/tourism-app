package com.dicoding.tourismapp.di

import com.dicoding.tourismapp.core.di.CoreComponent
import com.dicoding.tourismapp.detail.DetailTourismActivity
import com.dicoding.tourismapp.favorite.FavoriteFragment
import com.dicoding.tourismapp.home.HomeFragment
import dagger.Component


@AppScope
@Component(
    dependencies = [CoreComponent::class], // untuk menghubungkan CoreComponent dgn AppComponent artinya AppComponent membutuhkan CoreComponent untuk bisa berjalan.
            modules = [AppModule::class]
)
interface AppComponent {
    @Component.Factory
    interface Factory {
        fun create(coreComponent: CoreComponent): AppComponent
    }

    fun inject(fragment: HomeFragment)
    fun inject(fragment: FavoriteFragment)
    fun inject(activity: DetailTourismActivity)
}