package com.springboot.toyproject.todolist.domain.todo.dao;

import com.springboot.toyproject.todolist.domain.todo.domain.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {    
}
