package com.example.spring_todo_app.todoservice;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.spring_todo_app.entity.Todo;
import com.example.spring_todo_app.todorepository.TodoRepositoryIfs;

@Service
public class TodoService {
	
	private final TodoRepositoryIfs todoRepository;
	
	public TodoService (TodoRepositoryIfs todoRepository) {
		this.todoRepository = todoRepository;
	}
	
	public List<Todo> getAllTodo() {		// 전체 할 일 조회
		return todoRepository.findAll();
	}
	
	public Todo GetTodo(Long id) {		// 특정 할 일 조회
		return todoRepository.findById(id).orElse(null);
	}
	
	public Todo postTodo(Todo todo) {		// 할 일 추가
		return todoRepository.save(todo);
	}
	
	public Todo putTodo(Long id, Todo putTodo) {		// 할 일 수정
		Todo todo = todoRepository.findById(id).orElse(null);
		if(todo != null) {
			todo.setContent(putTodo.getContent());
			todo.setCompleted(putTodo.getCompleted());
			todo.setCreatedAt(putTodo.getCreatedAt());
			return todoRepository.save(todo);
		}
		return null;
	}
	
	public Todo deleteTodo(Long id) {		// 할 일 삭제
		Todo todo = todoRepository.findById(id).orElse(null);
		if(todo != null) {
			todoRepository.delete(todo);
			return todo;
		}
		return null;
	}
}
