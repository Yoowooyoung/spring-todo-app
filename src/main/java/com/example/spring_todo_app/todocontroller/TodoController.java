package com.example.spring_todo_app.todocontroller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.example.spring_todo_app.entity.Todo;
import com.example.spring_todo_app.todoservice.TodoService;

@RestController
@RequestMapping("/api")
public class TodoController {	

	private final TodoService todoService;

	public TodoController(TodoService todoService) {
		this.todoService = todoService;
	}
	
	@GetMapping("/todos")
	public List<Todo> GetTodos() {		// 전체 할 일 조회
		return todoService.getAllTodo();
	}
	
	@GetMapping("/todos/{id}")
	public Todo findTodo(@PathVariable Long id) {		// 특정 할 일 조회
		return todoService.GetTodo(id);
	}
	
	@PostMapping("/todos")
	public Todo createTodo(@RequestBody Todo reqTodo) {		// 할 일 추가
		return todoService.postTodo(reqTodo);
	}
	
	@PutMapping("/todos/{id}")
	public Todo editTodo(@PathVariable Long id, @RequestBody Todo reqEditTodo) {		// 할 일 수정
		return todoService.putTodo(id, reqEditTodo);
	}
	
	@DeleteMapping("/todos/{id}")
	public Todo removeTodo(@PathVariable Long id) {		// 할 일 삭제
		return todoService.deleteTodo(id);
	}
}

