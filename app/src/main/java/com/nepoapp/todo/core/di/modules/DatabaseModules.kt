package com.nepoapp.todo.core.di.modules

import com.nepoapp.todo.core.di.providers.RoomProvides
import com.nepoapp.todo.core.room.TodoRoomDatabase
import kotlinx.coroutines.CoroutineScope
import org.koin.dsl.module

class DatabaseModules() : RoomProvides() {

    val build = module {

        factory { super.providerTodoDao(TodoRoomDatabase.getDatabaseTodo(get())) }
        factory { super.providerLastAccess(TodoRoomDatabase.getDatabaseTodo(get()))}

    }

    companion object{

        val start = DatabaseModules().build
    }

}