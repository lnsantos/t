package com.nepoapp.todo.core.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull


@Entity(
    tableName = ToDo.TABLE_NAME)
data class ToDo(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = ID_COLUMN_NAME        )     val id        : Int?,

    @NotNull
    @ColumnInfo(name = NAME_COLUMN_NAME      )     val name      : String?,
    @ColumnInfo(name = CREATED_AT_COLUMN_NAME)     val createdAt : Long?,
    @ColumnInfo(name = FINISHED_COLUMN_NAME  )     val isFinished: Int? = NOT_FINISHED

){
    companion object{
        const val TABLE_NAME = "TODO"
        const val ID_COLUMN_NAME = "ID_REFERENCE"
        const val NAME_COLUMN_NAME = "NAME_COLUMN"
        const val CREATED_AT_COLUMN_NAME = "CREATED_AT_COLUMN"
        const val FINISHED_COLUMN_NAME = "FINISHED_COLUMN"

        const val YES_FINISHED = 1
        const val NOT_FINISHED = 0
    }

    fun valueString() : String
        = """
            name todo : $name
            created at: $createdAt
            status  at: $isFinished
        """

}

