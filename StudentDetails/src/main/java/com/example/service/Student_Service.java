package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entity.Student;

@Service
public interface Student_Service {
	public Student createStudent(Student student);

	public List<Student> FindAllStudent();

	public void deleteStudent(int id);

	public Student updateStudent(Student student);
}
