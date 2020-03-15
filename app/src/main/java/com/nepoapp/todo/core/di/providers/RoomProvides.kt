package com.nepoapp.todo.core.di.providers

import androidx.room.RoomDatabase
import com.nepoapp.todo.core.room.daos.LastAccessDao
import com.nepoapp.todo.core.room.daos.LastAccessDao_Impl
import com.nepoapp.todo.core.room.daos.ToDoDAO
import com.nepoapp.todo.core.room.daos.ToDoDAO_Impl

open class RoomProvides{

    open fun providerTodoDao(db: RoomDatabase): ToDoDAO = ToDoDAO_Impl(db)
    open fun providerLastAccess(db: RoomDatabase): LastAccessDao = LastAccessDao_Impl(db)
}