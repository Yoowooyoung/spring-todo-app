package com.example.spring_todo_app.todorepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring_todo_app.entity.Todo;

public interface TodoRepositoryIfs extends JpaRepository<Todo, Long> {
}
