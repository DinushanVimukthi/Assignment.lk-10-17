package ir.behnoudsh.t9.di.component

import dagger.Component
import ir.behnoudsh.t9.data.repository.ImageRepository
import ir.behnoudsh.t9.di.module.ApiHelperModule
import javax.inject.Singleton

@Singleton
@Component(modules = [ApiHelperModule::class])
interface ApiHelperComponent {
    fun inject(mainRepository: ImageRepository)
}
