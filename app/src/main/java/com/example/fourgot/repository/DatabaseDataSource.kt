package com.example.fourgot.repository

import androidx.lifecycle.LiveData
import com.example.fourgot.data.db.dao.VaultDAO
import com.example.fourgot.data.db.entity.VaultEntity

class DatabaseDataSource(
    private val vaultDAO: VaultDAO
) : VaultRepository{
    override suspend fun insertVault(name: String, password: String): Long {
        val vault = VaultEntity(
            name = name,
            password = password
        )

        return vaultDAO.insert(vault)
    }

    override suspend fun updateVault(id: Long, name: String, password: String) {
        val vault = VaultEntity(
            id = id,
            name = name,
            password = password
        )

        vaultDAO.update(vault)
    }

    override suspend fun deleteVault(id: Long) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteAllVault() {
        TODO("Not yet implemented")
    }

    override suspend fun geteAllVault(): LiveData<List<VaultEntity>> {
        TODO("Not yet implemented")
    }

}