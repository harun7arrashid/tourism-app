package com.dicoding.tourismapp.core.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

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
