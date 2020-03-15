package com.nepoapp.todo.core.di.modules

import org.koin.dsl.module

class ViewModules {

    val build = module {

    }

    companion object {
        val start = ViewModules().build
    }
}