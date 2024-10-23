package com.ahmedapps.daggerhilt.data

import com.ahmedapps.daggerhilt.domain.repository.Repository
import javax.inject.Inject

//The @Inject annotation tells Dagger to provide instances of these dependencies when RepositoryImpl is created.
class RepositoryImpl @Inject constructor(
    private val api: SomeApi
): Repository {
    override suspend fun makeAPICall() {
        println("make api call")
        api.callApi()
    }
}