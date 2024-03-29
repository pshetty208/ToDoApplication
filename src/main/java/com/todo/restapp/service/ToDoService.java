package com.todo.restapp.service;

import com.todo.restapp.model.ToDoList;

import java.util.List;
import java.util.Set;

public interface ToDoService {
    String save(ToDoList obj);
    List<ToDoList> findAll();
    ToDoList findByName(String id);
    List<ToDoList> findByStatus(String status);
    String updateItem(ToDoList obj);
    String deleteItem(String id);

}
