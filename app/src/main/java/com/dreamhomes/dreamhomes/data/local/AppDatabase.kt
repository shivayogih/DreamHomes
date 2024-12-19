package com.dreamhomes.dreamhomes.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [CustomerInquiry::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun inquiryDao(): InquiryDao
}
