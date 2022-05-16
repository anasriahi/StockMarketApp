package com.riahi.stockmarketapp.di

import com.riahi.stockmarketapp.data.csv.CSVParser
import com.riahi.stockmarketapp.data.csv.CompanyListingsParser
import com.riahi.stockmarketapp.data.repository.StockRepositoryImpl
import com.riahi.stockmarketapp.domain.model.CompanyListing
import com.riahi.stockmarketapp.domain.repository.StockRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindCompanyListingParser(
        companyListingsParser: CompanyListingsParser
    ): CSVParser<CompanyListing>

    @Binds
    @Singleton
    abstract fun bindStockRepository(
        stockRepositoryImpl: StockRepositoryImpl
    ): StockRepository

}