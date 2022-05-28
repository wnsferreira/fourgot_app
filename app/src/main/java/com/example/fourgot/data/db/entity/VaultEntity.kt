package com.example.fourgot.data.db.entity

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "vault")
data class VaultEntity (
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val name: String,
    val password: String,
    val url: String,
    val email: String
) : Parcelable

//@Parcelize implementa o Parcelable. Permite utilizar esse objeto no grafo de navegacao.