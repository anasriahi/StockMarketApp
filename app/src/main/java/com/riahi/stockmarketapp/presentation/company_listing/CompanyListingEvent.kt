package com.riahi.stockmarketapp.presentation.company_listing

sealed class CompanyListingEvent {
    object refresh: CompanyListingEvent()
    data class onSearchQueryChange(val query: String): CompanyListingEvent()
}