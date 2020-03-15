package com.nepoapp.todo.core.repository

import com.nepoapp.todo.core.room.daos.LastAccessDao
import com.nepoapp.todo.core.room.entity.LastAccess

class LastAccessLocalRepository(val dao: LastAccessDao) {

    suspend fun allLastAccess(): List<LastAccess>
       = dao.getAll()

    suspend fun insertLastAccess(lastAccess: LastAccess): Boolean{
        dao.insert(lastAccess)
        return true
    }

    suspend fun searchFindByDate(id:Int) : LastAccess{
        return dao.findById(id)
    }

}