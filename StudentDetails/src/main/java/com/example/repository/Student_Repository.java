package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Student;

public interface Student_Repository extends JpaRepository<Student, Integer> {

}
