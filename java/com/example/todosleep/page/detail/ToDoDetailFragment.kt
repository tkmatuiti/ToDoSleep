package com.example.todosleep.page.detail

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.todosleep.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ToDoDetailFragment: Fragment(R.layout.todo_detail_fragment) {
    private  val vm: ToDoDetailViewModel by viewModels()
}