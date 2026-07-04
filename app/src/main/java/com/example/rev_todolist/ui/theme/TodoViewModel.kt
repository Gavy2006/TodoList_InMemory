package com.example.rev_todolist.ui.theme

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.rev_todolist.Todo

class TodoViewModel : ViewModel() {

    private var _todolist = MutableLiveData<List<Todo>>()
    val todolist : LiveData<List<Todo>> = _todolist

    init {
        getAllTodo()
    }
    fun getAllTodo() {
        _todolist.value = TodoManager.getAllTodo()

    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun addTodo(title : String){
        TodoManager.addTodo(title)
        getAllTodo()
    }

    fun deleteTodo(id : Int){
        TodoManager.deleteTodo(id)
        getAllTodo()
    }

    }



