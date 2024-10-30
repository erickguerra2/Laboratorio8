package com.eventapp.mealswithroom.database.supermarket

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "list_supermarket")
data class SupermarketEntity(
    @ColumnInfo(name = "id")
    @PrimaryKey val id: String,

    @ColumnInfo(name = "itemName")
    val name: String,

    @ColumnInfo(name = "quantity")
    val quantity: Int,

    @ColumnInfo(name = "imagePath")
    val imagePath: String
)