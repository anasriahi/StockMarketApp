package com.riahi.stockmarketapp.presentation.company_infos

import com.riahi.stockmarketapp.domain.model.CompanyInfo
import com.riahi.stockmarketapp.domain.model.IntradayInfo

data class CompanyInfosState(
    val stockInfos: List<IntradayInfo> = emptyList(),
    val company: CompanyInfo? = null,
    val isLoading: Boolean? = false,
    val error: String? = null
)
