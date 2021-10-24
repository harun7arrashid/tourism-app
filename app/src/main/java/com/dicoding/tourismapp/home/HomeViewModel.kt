package com.dicoding.tourismapp.home

import androidx.lifecycle.LiveDataReactiveStreams
import androidx.lifecycle.ViewModel
import com.dicoding.tourismapp.core.data.TourismRepository
import com.dicoding.tourismapp.core.domain.usecase.TourismUseCase

class HomeViewModel(tourismUseCase: TourismUseCase) : ViewModel() {

    // ubah tipe data Flowable menajdi LiveData
    val tourism = LiveDataReactiveStreams.fromPublisher(tourismUseCase.getAllTourism())

}

