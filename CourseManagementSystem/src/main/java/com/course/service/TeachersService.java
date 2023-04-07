package com.course.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.course.entity.Teachers;
@Service
public interface TeachersService {
	public Teachers addTeachers(Teachers teachers);
	public List<Teachers> getAllTeachers();
	public void deleteTeachersById(int tid);
	public Teachers updateTeachers(Teachers teachers);
	public Teachers findTeachersById(int tid);
	public Teachers findTeachersByName(String tname);

}
