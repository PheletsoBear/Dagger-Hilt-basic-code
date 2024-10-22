package com.ahmedapps.daggerhilt.domain.repository


interface Repository {
    suspend fun makeAPICall()
}
