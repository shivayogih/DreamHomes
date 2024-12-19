package com.dreamhomes.dreamhomes.presentation.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.dreamhomes.dreamhomes.presentation.viewmodel.InquiryViewModel

@Composable
fun HomeScreen() {
    val viewModel: InquiryViewModel = hiltViewModel()

    val inquiries = viewModel.inquiries.collectAsState().value
    val query = viewModel.query.collectAsState().value

   /* Scaffold(topBar = {
        TopAppBar(title = { Text("Dream Homes") })
    }) { padding ->
        Column(modifier = Modifier.padding(padding)) {
            SearchBar(
                query = query,
                onQueryChange = { viewModel.searchInquiries(it) },
                onSearch = { viewModel.searchInquiries(it) }
            )
            LazyColumn(modifier = Modifier.padding(8.dp)) {
              items(inquiries.size) { index ->
                  InquiryCard(inquiry = inquiries[index])
              }
            }


        }
    }*/
}