package com.nepoapp.todo.core.di

import android.app.Application
import com.nepoapp.todo.core.di.modules.*
import kotlinx.coroutines.coroutineScope
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
                    ViewModelModules.start,
                    DatabaseModules.start,
                    RepositoryModules.start
                )
            }
        }

    }

}