package com.dicoding.tourismapp.core.domain.usecase

import androidx.lifecycle.LiveData
import com.dicoding.tourismapp.core.data.Resource
import com.dicoding.tourismapp.core.domain.model.Tourism
import com.dicoding.tourismapp.core.domain.repository.ITourismRepository
import javax.inject.Inject

// Interactor itu buat UseCase nya
class TourismInteractor @Inject constructor (private val repo: ITourismRepository): TourismUseCase {

    override fun getAllTourism() = repo.getAllTourism()

    override fun getFavoriteTourism() = repo.getFavoriteTourism()

    override fun setFavoriteTourism(tourism: Tourism, state: Boolean) =
        repo.setFavoriteTourism(tourism, state)

}