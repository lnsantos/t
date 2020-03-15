package com.nepoapp.todo.core.di.modules

import com.nepoapp.todo.core.repository.LastAccessLocalRepository
import com.nepoapp.todo.source.model.ModelSplash
import org.koin.dsl.module

class ModelModules {

    val build = module {

    }

    companion object{
        val start = ModelModules().build
    }
}