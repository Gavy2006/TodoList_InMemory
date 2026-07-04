package com.example.rev_todolist

import java.util.Date

data class Todo(
    var id : Int ,
    var title : String ,
    var createdAt : Date
)

fun getfakeTodo() : List<Todo>{

    return listOf(
        Todo(1,"Task 1" , Date()),
        Todo(2,"Task 2" , Date()),
        Todo(3,"Task 3" , Date()),
        Todo(4,"Task 4" , Date()),
    )
}
