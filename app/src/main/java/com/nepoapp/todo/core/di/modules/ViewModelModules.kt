package com.nepoapp.todo.core.di.modules

import com.nepoapp.todo.source.view.splash.ViewModelSplash
import org.koin.dsl.module

class ViewModelModules {
    companion object {
        val start = module {
            factory {
                ViewModelSplash()
            }
        }
    }

}