package com.dreamhomes.dreamhomes.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dreamhomes.dreamhomes.data.local.CustomerInquiry
import com.dreamhomes.dreamhomes.data.repository.InquiryRepository
import com.dreamhomes.dreamhomes.domain.usecase.AddInquiryUseCase
import com.dreamhomes.dreamhomes.domain.usecase.GetInquiriesUseCase
import com.dreamhomes.dreamhomes.domain.usecase.SearchInquiriesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class InquiryViewModel @Inject constructor(
    private val addInquiryUseCase: AddInquiryUseCase,
    private val getInquiriesUseCase: GetInquiriesUseCase,
    private val searchInquiriesUseCase: SearchInquiriesUseCase,
    private val repository: InquiryRepository
) : ViewModel() {

    private val _inquiries = MutableStateFlow<List<CustomerInquiry>>(emptyList())
    val inquiries: StateFlow<List<CustomerInquiry>> get() = _inquiries

    private val _query = MutableStateFlow("")
    val query: StateFlow<String> get() = _query

    init {
        viewModelScope.launch {
               getInquiriesUseCase.invoke().collect { inquiries ->
                _inquiries.value = inquiries
            }
        }
    }

    fun addInquiry(inquiry: CustomerInquiry) {
        viewModelScope.launch {
            addInquiryUseCase(inquiry)
        }
    }

    fun searchInquiries(query: String) {
        _query.value = query
        viewModelScope.launch {
            searchInquiriesUseCase.invoke("%$query%").collect { inquiries ->
                _inquiries.value = inquiries
            }
        }
    }

    fun deleteInquiry(id: Int) {
        viewModelScope.launch {
            repository.deleteInquiry(id)
        }
    }
}