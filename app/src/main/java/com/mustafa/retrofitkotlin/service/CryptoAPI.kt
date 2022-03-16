package com.mustafa.retrofitkotlin.service

import com.mustafa.retrofitkotlin.model.CryptoModel
import io.reactivex.Observable
import retrofit2.http.GET

interface CryptoAPI {

    //GET, POST, UPDATE, DELETE





    @GET("prices?key=2187154b76945f2373394aa34f7dc98a")
    fun getData(): Observable<List<CryptoModel>>

    //fun getData(): Call<List<CryptoModel>>


}