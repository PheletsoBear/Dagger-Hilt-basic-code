package com.ahmedapps.daggerhilt.data

import retrofit2.http.GET


interface SomeApi {

    @GET("some-route")
    suspend fun callApi()
}