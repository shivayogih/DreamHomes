package com.dreamhomes.dreamhomes.domain.usecase

import com.dreamhomes.dreamhomes.data.local.CustomerInquiry
import com.dreamhomes.dreamhomes.data.repository.InquiryRepository


class AddInquiryUseCase(private val repository: InquiryRepository) {
    suspend operator fun invoke(inquiry: CustomerInquiry) {
        repository.addInquiry(inquiry)
    }
}