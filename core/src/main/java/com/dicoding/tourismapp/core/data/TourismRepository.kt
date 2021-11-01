package com.dicoding.tourismapp.core.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import com.dicoding.tourismapp.core.data.source.remote.network.ApiResponse
import com.dicoding.tourismapp.core.data.source.local.LocalDataSource
import com.dicoding.tourismapp.core.data.source.local.entity.TourismEntity
import com.dicoding.tourismapp.core.data.source.remote.RemoteDataSource
import com.dicoding.tourismapp.core.data.source.remote.response.TourismResponse
import com.dicoding.tourismapp.core.domain.model.Tourism
import com.dicoding.tourismapp.core.domain.repository.ITourismRepository
import com.dicoding.tourismapp.core.utils.AppExecutors
import com.dicoding.tourismapp.core.utils.DataMapper
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class TourismRepository(
    private val remoteDataSource: com.dicoding.tourismapp.core.data.source.remote.RemoteDataSource,
    private val localDataSource: com.dicoding.tourismapp.core.data.source.local.LocalDataSource,
    private val appExecutors: AppExecutors
): ITourismRepository {

    // ubah tipe LiveData jadi Flow
    override fun getAllTourism(): Flow<com.dicoding.tourismapp.core.data.Resource<List<Tourism>>> =
        object : com.dicoding.tourismapp.core.data.NetworkBoundResource<List<Tourism>, List<TourismResponse>>() {

            override fun loadFromDB(): Flow<List<Tourism>> {
                return localDataSource.getAllTourism().map { DataMapper.mapEntitiesToDomain(it) } // mengubah entity (Room) model menjadi domain model
            }

            override fun shouldFetch(data: List<Tourism>?): Boolean =
                data == null || data.isEmpty()

            override suspend fun createCall(): Flow<ApiResponse<List<TourismResponse>>> =
                remoteDataSource.getAllTourism()

            override suspend fun saveCallResult(data: List<TourismResponse>) {
                val tourismList = DataMapper.mapResponsesToEntities(data)
                localDataSource.insertTourism(tourismList)
            }
        }.asFlow()

    override fun getFavoriteTourism(): Flow<List<Tourism>> {
        return localDataSource.getFavoriteTourism().map { DataMapper.mapEntitiesToDomain(it) }
    }

    override fun setFavoriteTourism(tourism: Tourism, state: Boolean) {
        //appExecutors.diskIO().execute { localDataSource.setFavoriteTourism(tourism, state) }
        val tourisEntity = DataMapper.mapDomainToEntity(tourism) // untuk mengubah domain model menjadi Entity Model Room
        appExecutors.diskIO().execute { localDataSource.setFavoriteTourism(tourisEntity, state) }
    }
}

