package com.dreamhomes.dreamhomes.di

import com.dreamhomes.dreamhomes.data.repository.InquiryRepository
import com.dreamhomes.dreamhomes.domain.usecase.AddInquiryUseCase
import com.dreamhomes.dreamhomes.domain.usecase.GetInquiriesUseCase
import com.dreamhomes.dreamhomes.domain.usecase.SearchInquiriesUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {
    @Provides
    fun provideAddInquiryUseCase(repository: InquiryRepository): AddInquiryUseCase {
        return AddInquiryUseCase(repository)
    }

    @Provides
    fun provideGetInquiriesUseCase(repository: InquiryRepository): GetInquiriesUseCase {
        return GetInquiriesUseCase(repository)
    }

    @Provides
    fun provideSearchInquiriesUseCase(repository: InquiryRepository): SearchInquiriesUseCase {
        return SearchInquiriesUseCase(repository)
    }
}
