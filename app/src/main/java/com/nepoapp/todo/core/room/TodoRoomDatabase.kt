package com.nepoapp.todo.core.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.nepoapp.todo.core.room.daos.LastAccessDao
import com.nepoapp.todo.core.room.daos.ToDoDAO
import com.nepoapp.todo.core.room.entity.LastAccess
import com.nepoapp.todo.core.room.entity.ToDo
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.koin.ext.scope
import java.util.*
import kotlin.coroutines.coroutineContext


@Database(entities =[
    ToDo::class,
    LastAccess::class
],
 version = 1,
 exportSchema = false)
abstract class TodoRoomDatabase : RoomDatabase() {

    abstract fun getToDoDAO(): ToDoDAO
    abstract fun getLastAccessDao(): LastAccessDao

    companion object {

        /**
        Gravações nesse campo são imediatamente
        tornadas visíveis para outros encadeamentos
         **/

        @Volatile
        private var INSTANCE: TodoRoomDatabase? = null

        fun getDatabaseTodo(
            context: Context)
                : TodoRoomDatabase {
            return INSTANCE ?: synchronized(this) {
                INSTANCE = Room.databaseBuilder(
                    context.applicationContext,
                    TodoRoomDatabase::class.java,
                    "last-create.db"
                )
                    .allowMainThreadQueries()
                    .build()

                INSTANCE!!
            }
        }
    }


}