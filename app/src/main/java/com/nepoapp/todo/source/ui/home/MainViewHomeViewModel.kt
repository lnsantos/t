package com.nepoapp.todo.source.ui.home

import androidx.lifecycle.ViewModel
import com.nepoapp.todo.core.repository.ToDoLocalRepository

class MainViewHomeViewModel(
    todo: ToDoLocalRepository
) : ViewModel(){

    val teste = "inject"

}