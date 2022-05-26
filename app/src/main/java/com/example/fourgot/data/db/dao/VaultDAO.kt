package com.example.fourgot.data.db.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.fourgot.data.db.entity.VaultEntity

@Dao
interface VaultDAO {
    @Insert
    suspend fun insert(vault: VaultEntity): Long

    @Update
    suspend fun update(vault: VaultEntity)

    @Query("DELETE FROM vault WHERE id = :id")
    suspend fun delete(id: Long)

    @Query("DELETE FROM vault")
    suspend fun deleteAll()

    @Query("SELECT * FROM vault")
    abstract suspend fun getAll(): List<VaultEntity>
}