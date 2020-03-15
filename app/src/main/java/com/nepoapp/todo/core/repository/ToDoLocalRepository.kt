package com.nepoapp.todo.core.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.nepoapp.todo.core.room.daos.ToDoDAO
import com.nepoapp.todo.core.room.entity.ToDo

class ToDoLocalRepository(val dao: ToDoDAO) {

    suspend fun allTodo(type:Int):LiveData<List<ToDo>>{
        val data : MutableLiveData<List<ToDo>>? = null
        data?.postValue(dao.getAll(type))
        return data as LiveData<List<ToDo>>
    }

    suspend fun insertTodo(todo:ToDo): Boolean{
        dao.insertAll(todo)
        return true
    }

    suspend fun searchFindByName(name:String) : ToDo{
        return dao.findByName(name)
    }

    suspend fun searchFindById(id: Int) : ToDo{
        return dao.findById(id)
    }

    suspend fun updateTodo(todo:ToDo){
        dao.update(todo)
    }

    suspend fun deleteTodo(todo: ToDo){
        dao.delete(todo)
    }

}