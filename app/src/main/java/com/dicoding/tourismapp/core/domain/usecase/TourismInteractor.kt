package com.dicoding.tourismapp.core.domain.usecase

import androidx.lifecycle.LiveData
import com.dicoding.tourismapp.core.data.Resource
import com.dicoding.tourismapp.core.domain.model.Tourism
import com.dicoding.tourismapp.core.domain.repository.ITourismRepository

// Interactor itu buat UseCase nya
class TourismInteractor(private val repo: ITourismRepository): TourismUseCase {

    override fun getAllTourism(): LiveData<Resource<List<Tourism>>> =
        repo.getAllTourism()

    override fun getFavoriteTourism(): LiveData<List<Tourism>> =
        repo.getFavoriteTourism()

    override fun setFavoriteTourism(tourism: Tourism, state: Boolean) =
        repo.setFavoriteTourism(tourism, state)

}