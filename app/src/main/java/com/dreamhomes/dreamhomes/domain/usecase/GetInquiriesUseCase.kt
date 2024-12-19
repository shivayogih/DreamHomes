package com.dreamhomes.dreamhomes.domain.usecase

import com.dreamhomes.dreamhomes.data.local.CustomerInquiry
import com.dreamhomes.dreamhomes.data.repository.InquiryRepository
import kotlinx.coroutines.flow.Flow

class GetInquiriesUseCase(private val repository: InquiryRepository) {
    fun invoke(): Flow<List<CustomerInquiry>> = repository.getInquiries()
}