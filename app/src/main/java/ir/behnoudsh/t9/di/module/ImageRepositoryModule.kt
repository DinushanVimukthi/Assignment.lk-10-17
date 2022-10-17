package ir.behnoudsh.t9.di.module

import dagger.Module
import dagger.Provides
import ir.behnoudsh.t9.data.repository.ImageRepository
import ir.behnoudsh.t9.data.repository.OutputRepository
import javax.inject.Singleton

@Module
class ImageRepositoryModule {

    @Singleton
    @Provides
    fun providesImageRepository(): OutputRepository {
        return ImageRepository()
    }
}