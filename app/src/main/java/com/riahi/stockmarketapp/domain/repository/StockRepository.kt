package com.riahi.stockmarketapp.domain.repository

import com.riahi.stockmarketapp.domain.model.CompanyInfo
import com.riahi.stockmarketapp.domain.model.CompanyListing
import com.riahi.stockmarketapp.domain.model.IntradayInfo
import com.riahi.stockmarketapp.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {

    suspend fun getCompanyListing(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>

    suspend fun getIntradayInfo(
        symbol: String
    ): Resource<List<IntradayInfo>>

    suspend fun getCompanyInfo(
        symbol: String
    ): Resource<CompanyInfo>
}