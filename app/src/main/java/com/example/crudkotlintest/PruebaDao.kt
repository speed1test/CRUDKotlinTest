package com.example.crudkotlintest

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface PruebaDao {
    @Insert
    fun insert(prueba : PruebaEntity)

    @Query("SELECT * FROM prueba")
    fun getAllBooks(): List<PruebaEntity>
}