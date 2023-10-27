package com.example.demo1.controller;

import com.example.demo1.entity.studentEntity;
import com.example.demo1.service.studentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
@CrossOrigin("http://localhost:4200/")
public class studentController {

    private final studentService ss;

    public studentController(studentService ss) {
        this.ss = ss;
    }

    @GetMapping
    public List<studentEntity> findAllStudent()
    {
        return ss.findAllStudent();
    }

    @GetMapping("/{id}")
    public Optional<studentEntity> findstudentById(@PathVariable("id") Long id)
    {
        return ss.findById(id);
    }

    @PostMapping
    public studentEntity saveStudent(@RequestBody studentEntity se)
    {
        return ss.saveStudent(se);
    }
    @PutMapping
    public studentEntity updateStudent(@RequestBody studentEntity se)
    {
        return ss.updateStudent(se);
    }

    @DeleteMapping
    public void deleteStudent(@PathVariable("id") Long id)
    {
        ss.deleteStudent(id);
    }

}