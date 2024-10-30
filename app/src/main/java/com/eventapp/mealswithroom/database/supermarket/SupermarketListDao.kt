package com.eventapp.mealswithroom.database.supermarket

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface SupermarketListDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSupermarket(supermarket: SupermarketEntity)

    @Query("SELECT * FROM list_supermarket")
    suspend fun getAllSupermarkets(): List<SupermarketEntity>
}
