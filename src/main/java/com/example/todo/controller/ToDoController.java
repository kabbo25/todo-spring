package com.example.todo.controller;

import com.example.todo.model.ToDo;
import com.example.todo.repository.ToDoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ToDoController {

    private final ToDoRepository toDoRepository;

    public ToDoController(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }


    @GetMapping("/")
    public String listToDos(Model model) {
        List<ToDo> toDos = toDoRepository.findAll();
        model.addAttribute("toDos", toDos);
        model.addAttribute("toDo", new ToDo());
        return "todo-list";
    }

    @PostMapping("/add")
    public String addToDo(ToDo toDo) {
        toDoRepository.save(toDo);
        return "redirect:/";
    }

    // Implement other CRUD methods as needed
}
