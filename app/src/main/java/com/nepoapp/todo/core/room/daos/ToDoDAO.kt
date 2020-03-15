package com.nepoapp.todo.core.room.daos

import androidx.room.*
import com.nepoapp.todo.core.room.entity.ToDo
import com.nepoapp.todo.core.room.entity.ToDo.Companion.FINISHED_COLUMN_NAME
import com.nepoapp.todo.core.room.entity.ToDo.Companion.ID_COLUMN_NAME
import com.nepoapp.todo.core.room.entity.ToDo.Companion.NAME_COLUMN_NAME
import com.nepoapp.todo.core.room.entity.ToDo.Companion.TABLE_NAME
import com.nepoapp.todo.core.room.utils.lk
import com.nepoapp.todo.core.room.utils.s_all_f
import com.nepoapp.todo.core.room.utils.whr

@Dao
interface ToDoDAO {

    @Query("$s_all_f $TABLE_NAME $whr $FINISHED_COLUMN_NAME $lk :search")
    suspend fun getAll(search: Int) : List<ToDo>

    @Query("$s_all_f $TABLE_NAME $whr $NAME_COLUMN_NAME $lk :search")
    suspend fun findByName(search: String) : ToDo

    @Query("$s_all_f $TABLE_NAME $whr $ID_COLUMN_NAME $lk :search")
    suspend fun findById(search: Int) : ToDo

    @Insert(onConflict = OnConflictStrategy.IGNORE)
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
    /**
      TODO
       by: Lucas Santos
     Talvez eu precise remover o suspend e colocar um retorno,
     para sabe se foi finalizado ou não
     * */
}