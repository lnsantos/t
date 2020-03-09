package com.nepoapp.todo.core.di

import android.app.Application
import com.nepoapp.todo.core.di.modules.ModelModules
import com.nepoapp.todo.core.di.modules.ViewModelModules
import com.nepoapp.todo.core.di.modules.ViewModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.core.module.Module

class CoreInjectKoin {
    companion object{
        fun startInject(application: Application){
            startKoin {
                androidContext(application)
                modules(
                    ViewModules.start,
                    ModelModules.start,
                    ViewModelModules.start
                )
            }
        }

    }

}