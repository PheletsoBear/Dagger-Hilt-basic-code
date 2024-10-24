package com.ahmedapps.daggerhilt.data

import android.app.Application
import com.ahmedapps.daggerhilt.R
import com.ahmedapps.daggerhilt.domain.repository.Repository
import javax.inject.Inject

//The @Inject annotation tells Dagger to provide instances of these dependencies when RepositoryImpl2 is created.
class RepositoryImpl2 @Inject constructor(
    private val api: SomeApi2,
    private val application: Application
): Repository {
    override suspend fun makeAPICall() {
        println("${application.getString(R.string.app_name)} -- make api call 2")
        api.callApi2()
    }
}