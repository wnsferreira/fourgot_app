package com.example.fourgot.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.fourgot.data.db.dao.VaultDAO
import com.example.fourgot.data.db.entity.VaultEntity

@Database(entities = [VaultEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase(){

    abstract val vaultDAO: VaultDAO

    companion object{
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {
            synchronized(this){
                var instance: AppDatabase? = INSTANCE
                if (instance == null){
                    instance = Room.databaseBuilder(
                        context,
                        AppDatabase::class.java,
                        "app_database"
                    ).build()
                }
                return instance
            }
        }
    }
}