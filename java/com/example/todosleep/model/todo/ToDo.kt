package com.example.todosleep.model.todo

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ToDo(
    //_idを主キー(PrimaryKey)にしている。
    @PrimaryKey(autoGenerate = true)
    val _id: Int =0,
    val title: String,
    val detail: String,
    val created: Long,
    val modified: Long,
        )