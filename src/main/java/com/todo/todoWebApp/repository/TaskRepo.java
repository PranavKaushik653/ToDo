package com.todo.todoWebApp.repository;

import com.todo.todoWebApp.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepo extends JpaRepository<Task,Long> {

}
