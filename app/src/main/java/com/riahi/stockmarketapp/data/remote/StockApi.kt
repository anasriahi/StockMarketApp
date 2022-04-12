package com.riahi.stockmarketapp.data.remote

import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Query

interface StockApi {

    @GET("query?function=LISTING_STATUS")
    suspend fun getListings(
        @Query("apikey") apiKey: String
    ): ResponseBody

    companion object {
        const val API_KEY = "78W8CII5ZTREGJ0O"
        const val BASE_URL = "https://alphavantage.co"
    }
}