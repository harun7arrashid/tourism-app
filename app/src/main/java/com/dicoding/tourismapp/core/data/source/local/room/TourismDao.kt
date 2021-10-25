package com.dicoding.tourismapp.core.data.source.local.room

import androidx.lifecycle.LiveData
import androidx.room.*
import com.dicoding.tourismapp.core.data.source.local.entity.TourismEntity
import io.reactivex.Completable
import io.reactivex.Flowable

@Dao
interface TourismDao {
    // Flowable untuk mengambil data
    // Completable untuk memasukan data
    @Query("SELECT * FROM tourism")
    fun getAllTourism(): Flowable<List<TourismEntity>> // sblmnya LiveData

    @Query("SELECT * FROM tourism where isFavorite = 1")
    fun getFavoriteTourism(): Flowable<List<TourismEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertTourism(tourism: List<TourismEntity>): Completable // klo insert nya gk return data, make Completable

    @Update
    fun updateFavoriteTourism(tourism: TourismEntity)
}
