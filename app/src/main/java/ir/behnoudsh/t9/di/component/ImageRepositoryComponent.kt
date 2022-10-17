package ir.behnoudsh.t9.di.component

import dagger.Component
import ir.behnoudsh.t9.di.module.ImageRepositoryModule
import ir.behnoudsh.t9.ui.viewmodel.MainViewModel
import javax.inject.Singleton

@Singleton
@Component(modules = [ImageRepositoryModule::class])
interface ImageRepositoryComponent {
    fun inject(imagesViewModel: MainViewModel)
}
