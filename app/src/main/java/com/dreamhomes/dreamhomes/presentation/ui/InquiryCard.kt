package com.dreamhomes.dreamhomes.presentation.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.dreamhomes.dreamhomes.data.local.CustomerInquiry

@Composable
fun InquiryCard(inquiry: CustomerInquiry) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = inquiry.name, style = MaterialTheme.typography.titleMedium)
            Text(text = inquiry.contactNumber, style = MaterialTheme.typography.bodyMedium)
        }
    }
}