package com.dicoding.tourismapp.core.domain.usecase

import androidx.lifecycle.LiveData
import com.dicoding.tourismapp.core.data.Resource
import com.dicoding.tourismapp.core.domain.model.Tourism
import io.reactivex.Flowable

// buat di impelement di Interactor
interface TourismUseCase {
    fun getAllTourism(): Flowable<Resource<List<Tourism>>> // ganti semua LiveData jd make FLowable
    fun getFavoriteTourism(): Flowable<List<Tourism>>
    fun setFavoriteTourism(tourism: Tourism, state: Boolean)
}