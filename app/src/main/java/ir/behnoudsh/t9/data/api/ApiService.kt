package ir.behnoudsh.t9.data.api

import io.reactivex.Single
import ir.behnoudsh.t9.BuildConfig
import ir.behnoudsh.t9.data.model.PixabayData
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET(
        "?key=" + BuildConfig.API_CREDENTIAL + "&image_type=photo&pretty=true"
    )
    fun getImages(
        @Query("q") input: String?,
        @Query("page") page: Int
    ): Single<PixabayData>

}