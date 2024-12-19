package com.dreamhomes.dreamhomes.domain.usecase

import com.dreamhomes.dreamhomes.data.local.CustomerInquiry
import com.dreamhomes.dreamhomes.data.repository.InquiryRepository
import kotlinx.coroutines.flow.Flow

class SearchInquiriesUseCase(private val repository: InquiryRepository) {
    fun invoke(query: String): Flow<List<CustomerInquiry>> = repository.searchInquiries(query)
}