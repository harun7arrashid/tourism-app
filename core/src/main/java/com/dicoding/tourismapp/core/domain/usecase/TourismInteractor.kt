package com.dicoding.tourismapp.core.domain.usecase

import com.dicoding.tourismapp.core.domain.model.Tourism
import com.dicoding.tourismapp.core.domain.repository.ITourismRepository

// Interactor itu buat UseCase nya
class TourismInteractor(private val repo: ITourismRepository): TourismUseCase {

    override fun getAllTourism() = repo.getAllTourism()

    override fun getFavoriteTourism() = repo.getFavoriteTourism()

    override fun setFavoriteTourism(tourism: Tourism, state: Boolean) =
        repo.setFavoriteTourism(tourism, state)

}