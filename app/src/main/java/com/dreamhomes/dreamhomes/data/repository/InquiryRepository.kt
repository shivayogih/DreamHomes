package com.dreamhomes.dreamhomes.data.repository

import com.dreamhomes.dreamhomes.data.local.CustomerInquiry
import kotlinx.coroutines.flow.Flow

interface InquiryRepository {
    suspend fun addInquiry(inquiry: CustomerInquiry)
    fun getInquiries(): Flow<List<CustomerInquiry>>
    fun searchInquiries(query: String): Flow<List<CustomerInquiry>>
    suspend fun deleteInquiry(id: Int)
}
