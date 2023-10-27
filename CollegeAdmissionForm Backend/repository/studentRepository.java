package com.example.demo1.repository;

import com.example.demo1.entity.studentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface studentRepository extends JpaRepository<studentEntity, Long> {
}

