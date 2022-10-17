package ir.behnoudsh.t9.data.repository

import io.reactivex.Single
import ir.behnoudsh.t9.data.api.ApiHelper
import ir.behnoudsh.t9.data.model.PixabayData
import ir.behnoudsh.t9.di.component.ApiHelperComponent
import ir.behnoudsh.t9.di.component.DaggerApiHelperComponent
import javax.inject.Inject

/**
 * Repository class which has the duty of getting data from network and passes the data to the viewmodel
 */
class ImageRepository : OutputRepository {

    @Inject
    lateinit var apiHelper: ApiHelper

    init {
        val apiHelperComponent: ApiHelperComponent = DaggerApiHelperComponent.create();
        apiHelperComponent.inject(this)
    }

    override fun getData(searchWord: String, page: Int): Single<PixabayData> {

        return apiHelper.getImages(searchWord, page)

    }
}