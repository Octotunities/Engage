package com.example.engage.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.engage.models.Task
import com.example.engage.models.Animal

@Dao
interface TaskDao {
    @Insert
    suspend fun insert(task: Task)

    @Query("SELECT * FROM task")
    suspend fun getAll(): List<Task>
}

@Dao
interface AnimalDao {
    @Insert
    suspend fun insert(animal: Animal)

    @Query("SELECT * FROM animal")
    suspend fun getAll(): List<Animal>
}