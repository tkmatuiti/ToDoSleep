package com.example.todosleep.model.todo

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [ToDo::class],version = 1,exportSchema = false)//引数には、ファイルにどのテーブル（エンティティ）を含めるかentitiesで指定する。
abstract class ToDoDatabase: RoomDatabase() {
    abstract  fun todoDAO(): ToDoDAO
}