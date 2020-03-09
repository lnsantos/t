package com.nepoapp.todo.core.room.daos

import androidx.room.*
import com.nepoapp.todo.core.room.entity.ToDo
import com.nepoapp.todo.core.room.entity.ToDo.Companion.FINISHED_COLUMN_NAME
import com.nepoapp.todo.core.room.entity.ToDo.Companion.NAME_COLUMN_NAME
import com.nepoapp.todo.core.room.entity.ToDo.Companion.TABLE_NAME
import com.nepoapp.todo.core.room.lk
import com.nepoapp.todo.core.room.s_all_f
import com.nepoapp.todo.core.room.whr

@Dao
interface ToDoDAO {

    @Query("$s_all_f $TABLE_NAME $whr $FINISHED_COLUMN_NAME $lk :search")
    suspend fun getAll(search: Int) : List<ToDo>

    @Query("$s_all_f $TABLE_NAME $whr $NAME_COLUMN_NAME $lk :search")
    suspend fun findByName(search: String) : ToDo

    @Insert
    suspend fun insertAll(vararg toDo : ToDo)

    @Update
    suspend fun update(vararg toDo : ToDo)

    @Delete
    suspend fun delete(toDo : ToDo)

    /* @Transaction
    suspend fun updateSearch(loggedInUser: User) {
        deleteUser(loggedInUser)
        insertUser(loggedInUser)
    } */

}