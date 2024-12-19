package com.dreamhomes.dreamhomes.di

import com.dreamhomes.dreamhomes.data.local.InquiryDao
import com.dreamhomes.dreamhomes.data.repository.InquiryRepository
import com.dreamhomes.dreamhomes.data.repository.InquiryRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    @Singleton
    fun provideInquiryRepository(dao: InquiryDao): InquiryRepository {
        return InquiryRepositoryImpl(dao)
    }
}