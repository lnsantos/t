package com.nepoapp.todo.core.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.nepoapp.todo.core.room.entity.LastAccess.Companion.TABLE_NAME
import java.util.*

@Entity(tableName = TABLE_NAME)
data class LastAccess(

    @PrimaryKey(autoGenerate = true           )
    @ColumnInfo(name = NAME_COLUMN_ID         ) val id : Int?,
    @ColumnInfo(name = NAME_COLUMN_LAST_ACCESS) val lastAccess: Long = 0L

){

    companion object{
        const val TABLE_NAME = "LAST_ACCESS"
        const val NAME_COLUMN_ID = "ID"
        const val NAME_COLUMN_LAST_ACCESS = "LAST_ACCESS"
    }

    fun valueString() : String
            = """
            last access at: $lastAccess
        """
}

