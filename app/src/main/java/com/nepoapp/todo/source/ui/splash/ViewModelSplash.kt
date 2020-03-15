package com.nepoapp.todo.source.ui.splash

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nepoapp.todo.core.repository.LastAccessLocalRepository
import com.nepoapp.todo.core.room.entity.LastAccess
import kotlinx.coroutines.launch
import java.util.*

class ViewModelSplash(
    private val repository: LastAccessLocalRepository
) : ViewModel() {

    init {
        startLastAccess()
    }

    fun startLastAccess() = viewModelScope.launch {
        val calendar = Calendar.getInstance()
        val lastAccessInMillis = calendar.timeInMillis
        val lastAccess = LastAccess(0,lastAccessInMillis)
        repository.insertLastAccess(lastAccess)
    }

    fun getLastAccess() : String{
        var c = "PRIMEIRO OFF"
        viewModelScope.launch {
            val all = repository.allLastAccess()
            c = all[0].valueString()
        }
        return c
    }

    val teste = "OI"

}