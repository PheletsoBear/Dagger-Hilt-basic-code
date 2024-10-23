package com.ahmedapps.daggerhilt

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/*
kicks off the Hilt code generation.
It informs Dagger that it should generate
components that live for the entire lifecycle
of the application.
*/
@HiltAndroidApp
class App: Application()