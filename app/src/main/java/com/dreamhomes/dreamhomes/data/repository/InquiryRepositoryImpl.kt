package com.dreamhomes.dreamhomes.data.repository

import com.dreamhomes.dreamhomes.data.local.CustomerInquiry
import com.dreamhomes.dreamhomes.data.local.InquiryDao
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class InquiryRepositoryImpl @Inject constructor(
    private val dao: InquiryDao
) : InquiryRepository {

    override suspend fun addInquiry(inquiry: CustomerInquiry) {
        dao.insertInquiry(inquiry)
    }

    override fun getInquiries(): Flow<List<CustomerInquiry>> {
        return dao.getAllInquiries()
    }

    override fun searchInquiries(query: String): Flow<List<CustomerInquiry>> {
        return dao.searchInquiries(query)
    }

    override suspend fun deleteInquiry(id: Int) {
        dao.deleteInquiry(id)
    }
}