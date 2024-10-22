package com.ahmedapps.daggerhilt.data

import retrofit2.http.GET

interface SomeApi2 {

    @GET("some-route")
    suspend fun callApi2()
}