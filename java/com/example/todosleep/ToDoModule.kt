package com.example.todosleep

import android.content.Context
import androidx.room.Room
import com.example.todosleep.model.todo.ToDoDAO
import com.example.todosleep.model.todo.ToDoDatabase
import com.example.todosleep.repository.ToDoRepository
import com.example.todosleep.repository.ToDoRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ToDoModule {
    @Singleton
    @Provides
    fun provideToDoDatabase(
        @ApplicationContext context: Context
    ): ToDoDatabase {
        return Room.databaseBuilder(
            context,
            ToDoDatabase::class.java,
            "todo.db"
        ).build()
    }

    @Singleton
    @Provides
    fun provideToDoDAO(db: ToDoDatabase): ToDoDAO {
        return db.todoDAO()
    }
}

@Module
@InstallIn(SingletonComponent::class)
abstract class ToDoRepositoryModule{
    @Singleton
    @Binds
    abstract  fun bindToDoRepository(
        impl: ToDoRepositoryImpl
    ): ToDoRepository
}