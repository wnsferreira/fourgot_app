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
        vaultDAO.delete(id)
    }

    override suspend fun deleteAllVault() {
        vaultDAO.deleteAll()
    }

    override suspend fun getAllVault(): List<VaultEntity> {
        return vaultDAO.getAll()
    }

}