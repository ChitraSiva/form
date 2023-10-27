package com.example.demo1.service;
import com.example.demo1.entity.studentEntity;
import java.util.List;
import java.util.Optional;

public interface studentService {
    List<studentEntity> findAllStudent();
    Optional<studentEntity> findById(Long id);
    studentEntity saveStudent(studentEntity se);
    studentEntity updateStudent(studentEntity se);
    void deleteStudent(Long id);

}

