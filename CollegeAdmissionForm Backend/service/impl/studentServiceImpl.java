package com.example.demo1.service.impl;
import com.example.demo1.entity.studentEntity;
import com.example.demo1.repository.studentRepository;
import com.example.demo1.service.studentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class studentServiceImpl implements studentService{

    private final studentRepository sr;
    public studentServiceImpl(studentRepository sr)
    {
        this.sr=sr;
    }
    @Override
    public List<studentEntity> findAllStudent() {
        return sr.findAll();
    }

    @Override
    public Optional<studentEntity> findById(Long id) {
        return sr.findById(id);
    }

    @Override
    public studentEntity saveStudent(studentEntity se) {
        return sr.save(se);
    }

    @Override
    public studentEntity updateStudent(studentEntity se) {
        return sr.save(se);
    }

    @Override
    public void deleteStudent(Long id) {
        sr.deleteById(id);
    }
}