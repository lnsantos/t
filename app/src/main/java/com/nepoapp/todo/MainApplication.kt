package com.nepoapp.todo

import android.app.Application
import com.nepoapp.todo.core.di.CoreInjectKoin
import com.nepoapp.todo.core.di.modules.ModelModules
import com.nepoapp.todo.core.di.modules.ViewModelModules
import com.nepoapp.todo.core.di.modules.ViewModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        CoreInjectKoin.startInject(this@MainApplication)
    }

}