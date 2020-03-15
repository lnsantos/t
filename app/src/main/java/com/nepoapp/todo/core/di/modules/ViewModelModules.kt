package com.nepoapp.todo.core.di.modules

import com.nepoapp.todo.source.ui.home.MainViewHomeViewModel
import com.nepoapp.todo.source.ui.splash.ViewModelSplash
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

class ViewModelModules {

    val build = module {
        viewModel { ViewModelSplash(get()) }
        viewModel { MainViewHomeViewModel(todo = get()) }
    }

    companion object{
        val start = ViewModelModules().build
    }

}