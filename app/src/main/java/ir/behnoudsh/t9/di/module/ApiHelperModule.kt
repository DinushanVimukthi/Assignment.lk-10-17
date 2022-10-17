package ir.behnoudsh.t9.di.module

import dagger.Module
import dagger.Provides
import ir.behnoudsh.t9.data.api.ApiHelper
import javax.inject.Singleton

@Module
class ApiHelperModule {

    @Singleton
    @Provides
    fun providesApiHelper(): ApiHelper {
        return ApiHelper()
    }
}