package com.jpa.service.Impl;

import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.jpa.Entities.Student;
import com.jpa.repository.StudentRepository;
import com.jpa.service.StudentService;

@Repository
public class StudentServiceImpl implements StudentService {

	@Autowired
    StudentRepository studentRepository;
	
	@Override
	public Student addStudent(Student student) {
		studentRepository.save(student);
		return student;
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
		
	}

	@Override
	public Student updateStudent(Student student) {
		Student _student=studentRepository.findById(student.getSid()).get();
		_student.setSmarks(student.getSmarks());
		_student.setSname(student.getSname());
		studentRepository.save(_student);
		return _student;
	}

	@Override
	public List<Student> findAllStudent() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public Student findStudentById(int id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id).get();
	}

	

}
