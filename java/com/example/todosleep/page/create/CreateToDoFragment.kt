package com.example.todosleep.page.create

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.todosleep.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CreateToDoFragment: Fragment(R.layout.todo_fragment) {
    private val  vm: CreateToDoViewModel by viewModels()
}