package ir.behnoudsh.t9.data.repository


import io.reactivex.Single
import ir.behnoudsh.t9.data.model.PixabayData

interface OutputRepository {
    fun getData(searchWord: String, page: Int): Single<PixabayData>
}