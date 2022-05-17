package com.example.fourgot.repository

import androidx.lifecycle.LiveData
import com.example.fourgot.data.db.entity.VaultEntity

interface VaultRepository {

    suspend fun insertVault(name: String, password: String): Long

    suspend fun updateVault(id: Long, name: String, password: String)

    suspend fun deleteVault(id: Long)

    suspend fun deleteAllVault()

    suspend fun geteAllVault(): LiveData<List<VaultEntity>>
}