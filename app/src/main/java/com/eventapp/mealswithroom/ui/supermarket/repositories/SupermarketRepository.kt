package com.eventapp.mealswithroom.ui.supermarket.repositories

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.eventapp.mealswithroom.database.supermarket.SupermarketEntity

@Dao
interface SupermarketListDao {
    @Insert
    suspend fun insertSupermarket(supermarket: SupermarketEntity)

    @Query("SELECT * FROM list_supermarket")
    suspend fun getAllSupermarkets(): List<SupermarketEntity>
}
