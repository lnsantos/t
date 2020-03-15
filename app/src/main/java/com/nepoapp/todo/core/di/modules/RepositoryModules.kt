package com.nepoapp.todo.core.di.modules

import com.nepoapp.todo.core.repository.LastAccessLocalRepository
import com.nepoapp.todo.core.repository.ToDoLocalRepository
import org.koin.dsl.module

class RepositoryModules {

    val build = module {
        factory { ToDoLocalRepository(dao = get()) }
        factory { LastAccessLocalRepository(dao = get()) }
    }

    companion object{
        val start = RepositoryModules().build
    }

}