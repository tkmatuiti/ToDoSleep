package com.example.todosleep.repository

interface ToDoRepository {
    suspend fun create(title: String,detail:String)

}