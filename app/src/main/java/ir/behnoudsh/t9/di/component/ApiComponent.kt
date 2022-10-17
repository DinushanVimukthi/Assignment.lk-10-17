package ir.behnoudsh.t9.di.component

import dagger.Component
import ir.behnoudsh.t9.data.api.ApiHelper
import ir.behnoudsh.t9.di.module.ApiModule
import javax.inject.Singleton

@Singleton
@Component(modules = [ApiModule::class])
interface ApiComponent {
    fun inject(apiHelper: ApiHelper)
}
