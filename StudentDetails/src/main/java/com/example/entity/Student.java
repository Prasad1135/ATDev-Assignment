package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {
	
	@Id
	private int student_Roll_No;
	private String student_Name;
	private long student_Mob_No;
	private String student_Class;
	private String student_Address;
}
