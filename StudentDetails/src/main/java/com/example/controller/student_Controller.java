package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.entity.Student;
import com.example.service.Student_Service;

@RestController
public class student_Controller {
	@Autowired
	Student_Service student_Service;

	@PostMapping("/student")
	public Student createStudent(@RequestBody Student sutdent) {
		return student_Service.createStudent(sutdent);
	}

	@GetMapping("/student")
	public List<Student> FindAllStudent() {
		return student_Service.FindAllStudent();
	}

	@DeleteMapping("/student/{id}")
	public String deleteStudent(@PathVariable int id) {
		student_Service.deleteStudent(id);
		return "Student is deleted";
	}

	@PutMapping("/student")
	public Student updateStudent(@RequestBody Student student) {
		return student_Service.updateStudent(student);

	}
}
