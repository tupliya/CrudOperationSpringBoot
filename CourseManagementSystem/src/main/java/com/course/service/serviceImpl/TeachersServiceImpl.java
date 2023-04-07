package com.course.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.course.entity.Teachers;
import com.course.repository.TeachersRepository;
import com.course.service.TeachersService;

@Repository
public class TeachersServiceImpl  implements TeachersService{
	
	@Autowired
	TeachersRepository teachersRepository;

	@Override
	public Teachers addTeachers(Teachers teachers) {
		// TODO Auto-generated method stub
		return teachersRepository.save(teachers);
	}

	@Override
	public List<Teachers> getAllTeachers() {
		// TODO Auto-generated method stub
		return teachersRepository.findAll();
	}

	@Override
	public void deleteTeachersById(int tid) {
		// TODO Auto-generated method stub
		teachersRepository.deleteById(tid);
		
	}

	@Override
	public Teachers updateTeachers(Teachers teachers) {
		// TODO Auto-generated method stub
		Teachers _teachers=teachersRepository.findTeachersBytid(teachers.getTid());
		_teachers.setTid(teachers.getTid());
		_teachers.setTname(teachers.getTname());
		teachersRepository.save(_teachers);
		return _teachers;
	}

	@Override
	public Teachers findTeachersById(int tid) {
		// TODO Auto-generated method stub
		return teachersRepository.findTeachersBytid(tid);
	}

	@Override
	public Teachers findTeachersByName(String tname) {
		// TODO Auto-generated method stub
		return teachersRepository.findTeachersBytname(tname);
	}
	

}
