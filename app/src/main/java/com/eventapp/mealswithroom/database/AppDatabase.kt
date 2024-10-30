package com.eventapp.mealswithroom.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.eventapp.mealswithroom.database.categories.MealCategoryDao
import com.eventapp.mealswithroom.database.categories.MealCategoryEntity
import com.eventapp.mealswithroom.database.supermarket.SupermarketEntity
import com.eventapp.mealswithroom.database.supermarket.SupermarketListDao

@Database(entities = [MealCategoryEntity::class, SupermarketEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun mealCategoryDao(): MealCategoryDao
    abstract fun supermarketListDao(): SupermarketListDao
}
