package com.eventapp.mealswithroom.ui.supermarket.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.eventapp.mealswithroom.database.supermarket.SupermarketEntity
import com.eventapp.mealswithroom.ui.supermarket.repositories.SupermarketListDao
import kotlinx.coroutines.launch

class SupermarketViewModel(private val dao: SupermarketListDao) : ViewModel() {

    fun insertSupermarket(id: String,name: String, quantity: Int, imagePath: String) {
        val supermarket = SupermarketEntity(id = id, name = name, quantity = quantity, imagePath = imagePath)
        viewModelScope.launch {
            dao.insertSupermarket(supermarket)
        }
    }
}

