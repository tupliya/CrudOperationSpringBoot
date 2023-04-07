package com.course.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.course.entity.Teachers;
import com.course.service.TeachersService;

@RestController
public class TeachersController {
	
	@Autowired
	TeachersService teachersService;
	@PostMapping(value = "/teachers")
	public Teachers addTeachers(@RequestBody Teachers teachers)
	{
		return teachersService.addTeachers(teachers);
		
	}
	@GetMapping(value = "/teachersget")
	public List<Teachers> getAllTeachers()
	{
		return teachersService.getAllTeachers();
		
	}
	@DeleteMapping(value = "/teachers/{tid}")
	public String deleteTeachers(@PathVariable int tid)
	{
		 teachersService.deleteTeachersById(tid);
		 return "teachers is deleted fromd bd";
		
	}
	@PutMapping(value = "/teachers")
	public Teachers updateTeachers(@RequestBody Teachers teachers)
	{
		return teachersService.updateTeachers(teachers);
		
	}
	@GetMapping(value = "/teachersid/{tid}")
	public Teachers findTeachersByIdCourse(@PathVariable int tid)
	{
		return teachersService.findTeachersById(tid);
		
	}
	@GetMapping(value = "/teachersname/{tname}")
	public Teachers findTeachersByName(@PathVariable String tname)
	{
		return teachersService.findTeachersByName(tname);
		
	}


}
