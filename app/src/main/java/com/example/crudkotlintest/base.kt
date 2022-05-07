package com.example.crudkotlintest
import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [PruebaEntity::class],
    version = 2,
    exportSchema = true
)
abstract class AppDatabase: RoomDatabase() {
    abstract val pruebaDao : PruebaEntity
    companion object {
        const val DATABASE_NAME = "db-Prueba"
    }
}