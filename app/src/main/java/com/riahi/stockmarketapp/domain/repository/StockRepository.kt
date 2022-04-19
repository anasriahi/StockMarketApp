package com.riahi.stockmarketapp.domain.repository

import com.riahi.stockmarketapp.domain.model.CompanyListing
import com.riahi.stockmarketapp.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {

    suspend fun getCompanyListing(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>
}