package com.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.Entities.Student;
import com.jpa.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService studentService;
	
	@GetMapping(value = "/students")
	public List<Student> findAllStudents()
	{
		return studentService.findAllStudent();
		
	}
	@GetMapping(value = "/students/{id}")
	public Student findStudentById(@PathVariable int id)
	{
		return studentService.findStudentById(id);
	}
	@PostMapping(value ="/students")
	public Student savestudent(@RequestBody Student student)
	{
		System.out.println(student.getSid()+student.getSname()+student.getSmarks());
		return studentService.addStudent(student);
	}
	@DeleteMapping(value = "/students/{id}")
	public String deleteStudent(@PathVariable int id)
	{
		studentService.deleteStudent(id);
		return "Student is deleted";
	}
	@PutMapping(value = "/students")
	public Student updateStudent(@RequestBody Student student)
	{
		studentService.updateStudent(student);
		return student;
	}

}
