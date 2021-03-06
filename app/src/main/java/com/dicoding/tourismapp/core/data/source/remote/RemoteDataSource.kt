package com.dicoding.tourismapp.core.data.source.remote

import android.annotation.SuppressLint
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.dicoding.tourismapp.core.data.source.remote.network.ApiResponse
import com.dicoding.tourismapp.core.data.source.remote.network.ApiService
import com.dicoding.tourismapp.core.data.source.remote.response.ListTourismResponse
import com.dicoding.tourismapp.core.data.source.remote.response.TourismResponse
import io.reactivex.BackpressureStrategy
import io.reactivex.Flowable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import io.reactivex.subjects.PublishSubject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RemoteDataSource private constructor(private val apiService: ApiService) {
    companion object {
        @Volatile
        private var instance: RemoteDataSource? = null

        fun getInstance(service: ApiService): RemoteDataSource =
            instance ?: synchronized(this) {
                instance ?: RemoteDataSource(service)
            }
    }

    @SuppressLint("CheckResult")
    fun getAllTourism(): Flowable<ApiResponse<List<TourismResponse>>> { // sblmnya LiveData<>
        val resultData = PublishSubject.create<ApiResponse<List<TourismResponse>>>() // sblmnya MutableLiveData<>

    //get data from remote api
        val client = apiService.getList()

        client
            .subscribeOn(Schedulers.computation())  // computation itu yg berhubungan sama proses tinggi
            .observeOn(AndroidSchedulers.mainThread())
            .take(1) // operator take(1) untuk mengambil data dari API sekali saja.
            .subscribe({ response ->
                val dataArray = response.places
                // onNext = meng-emmit setiap response
                resultData.onNext(if (dataArray.isNotEmpty()) ApiResponse.Success(dataArray) else ApiResponse.Empty) // anggap aja resultData.value
            }, {
                resultData.onNext(ApiResponse.Error(it.message.toString()))
                Log.e("RemoteDataSource", it.toString())
            })

        return resultData.toFlowable(BackpressureStrategy.BUFFER) // Buffer  hal ini karena kita ingin mengambil setiap data walaupun ter-delay.

//        client.enqueue(object : Callback<ListTourismResponse> {
//            override fun onResponse(call: Call<ListTourismResponse>, response: Response<ListTourismResponse>) {
//                val dataArray = response.body()?.places
//                resultData.value = if (dataArray != null) ApiResponse.Success(dataArray) else ApiResponse.Empty
//            }
//            override fun onFailure(call: Call<ListTourismResponse>, t: Throwable) {
//                resultData.value = ApiResponse.Error(t.message.toString())
//                Log.e("RemoteDataSource", t.message.toString())
//            }
//        })
        //return resultData
    }
}

