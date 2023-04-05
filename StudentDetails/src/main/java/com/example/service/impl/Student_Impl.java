package com.example.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.entity.Student;
import com.example.repository.Student_Repository;
import com.example.service.Student_Service;

@Repository

public class Student_Impl implements Student_Service {
	@Autowired
	Student_Repository student_Repository;

	@Override
	public Student createStudent(Student student) {
		return student_Repository.save(student);
	}

	@Override
	public List<Student> FindAllStudent() {

		return student_Repository.findAll();
	}

	@Override
	public void deleteStudent(int id) {

		student_Repository.deleteById(id);
	}

	@Override
	public Student updateStudent(Student student) {
		Student _student = student_Repository.findById(student.getStudent_Roll_No()).get();
		_student.setStudent_Name(student.getStudent_Name());
		_student.setStudent_Mob_No(student.getStudent_Mob_No());
		_student.setStudent_Class(student.getStudent_Class());
		_student.setStudent_Address(student.getStudent_Address());
		return student_Repository.save(_student);
	}

}
