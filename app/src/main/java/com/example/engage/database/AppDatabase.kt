package com.example.engage.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.engage.models.Task
import com.example.engage.models.Animal

@Database(entities = [Task::class, Animal::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun taskDao(): TaskDao
    abstract fun animalDao(): AnimalDao
}