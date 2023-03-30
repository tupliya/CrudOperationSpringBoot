package com.jpa.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jpa.Entities.Student;

@Service
public interface StudentService {
	public Student addStudent(Student student);
	public Student findStudentById(int id);
	public List<Student> findAllStudent();
	public void deleteStudent(int id);
	public Student updateStudent(Student student);

}
