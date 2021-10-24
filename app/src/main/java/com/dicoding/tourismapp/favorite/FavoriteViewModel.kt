package com.dicoding.tourismapp.favorite

import androidx.lifecycle.LiveDataReactiveStreams
import androidx.lifecycle.ViewModel
import com.dicoding.tourismapp.core.data.TourismRepository
import com.dicoding.tourismapp.core.domain.usecase.TourismUseCase

class FavoriteViewModel(tourismUseCase: TourismUseCase) : ViewModel() {

    // mengubah tipe data Flowable menjadi LiveData
    val favoriteTourism = LiveDataReactiveStreams.fromPublisher(tourismUseCase.getFavoriteTourism())

}

