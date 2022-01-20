package com.example.springWebapp.controller;

import com.example.springWebapp.Entity.Students;
import com.example.springWebapp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {
    //injected the object of ProductRepository
    @Autowired
    private StudentRepository repository;
    //creating a method that will go in the database, read(findAll)
    //data and show them in the browser using JSON Format

    @GetMapping("/")
    //method that will fetch data from the database
    public String getEmployees(Model model) {
        //model helps display the data from html(it transports them)
        model.addAttribute("myStList", repository.findAll());
        Students student = new Students();
        model.addAttribute("student", student);

        return "index";
        //return repository.findAll();

    }

    //creating our action
    //we are going to use model to create the object of employee
    @PostMapping("/stadd")
    public String stAdd(Students student) {
        repository.save(student);
        return "redirect:/";

    }

    @GetMapping("/delete/{id}")
    public String deletest(@PathVariable("id") Integer id) {
        repository.deleteById(id);
        return "redirect:/";
    }
    @GetMapping("/update/{id}")
    public String updateEmp(@PathVariable("id") Integer id, Model model){
        Students student=repository.findById(id).get();
        model.addAttribute("student",student);
        return "edit_form";
    }

}


