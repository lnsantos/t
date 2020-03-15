package com.nepoapp.todo.core.room.daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.nepoapp.todo.core.room.entity.LastAccess

@Dao
interface LastAccessDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(lastAccess: LastAccess)

    @Query("SELECT * FROM ${LastAccess.TABLE_NAME} WHERE ${LastAccess.NAME_COLUMN_ID} = :searchId")
    suspend fun findById(searchId: Int) : LastAccess

    @Query("SELECT * FROM ${LastAccess.TABLE_NAME} ORDER BY ${LastAccess.NAME_COLUMN_LAST_ACCESS} DESC ")
    suspend fun getAll() : List<LastAccess>

}