package com.course.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.course.entity.Course;
import com.course.service.CourseService;
@RestController
public class Coursecontroller {
	
	@Autowired
	CourseService courseService;
	
	@PostMapping(value = "/course" )
	public Course addCourse(@RequestBody Course course)
	{
		return courseService.addCourse(course);
		
	}
	@GetMapping(value = "/courseget")
	public List<Course> getAllCourse()
	{
		return courseService.getAllCourse();
		
	}
	@DeleteMapping(value ="/course/{cid}" )
	public String deleteCourse(@PathVariable int cid)
	{
		courseService.deleteCourseById(cid);
		return "Course is deleted from db";
		
	}
	@PutMapping(value = "/course")
	public Course updateCourse(@RequestBody Course course)
	{
		return courseService.updateCourse(course);	
	}
	@GetMapping(value = "/courseid/{cid}")
	public Course findCourseById(@PathVariable int cid)
	{
		return courseService.findCourseById(cid);
		
	}
	@GetMapping(value = "/coursename/{cname}")
	public Course findCourseByName(@PathVariable String cname)
	{
		return courseService.findCourseByName(cname);
		
	}

}
