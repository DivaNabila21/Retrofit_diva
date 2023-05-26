package com.diva.retrofit_diva

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET ("character")
    fun getRick(): Call<ResponseRick>
}