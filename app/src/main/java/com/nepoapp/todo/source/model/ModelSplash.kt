package com.nepoapp.todo.source.model

import com.nepoapp.todo.core.repository.LastAccessLocalRepository
import com.nepoapp.todo.core.room.entity.LastAccess
import java.util.*

class ModelSplash(
    private val lastAccessLocalRepository: LastAccessLocalRepository) {

    suspend fun insertLastAccess(){
        val calendar = Calendar.getInstance()
        val lastAccessInMillis = calendar.timeInMillis
        val lastAccess = LastAccess(0,lastAccessInMillis)
        lastAccessLocalRepository.insertLastAccess(lastAccess)
    }

}