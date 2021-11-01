package com.dicoding.tourismapp.core.domain.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


// class model untuk domain
@Parcelize
data class Tourism(
    val tourismId: String,
    val name: String,
    val description: String,
    val address: String,
    val latitude: Double,
    val longitude: Double,
    val like: Int,
    val image: String,
    val isFavorite: Boolean
): Parcelable
