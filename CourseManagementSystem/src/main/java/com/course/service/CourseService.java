package com.course.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.course.entity.Course;

@Service
public interface CourseService {
	public Course addCourse(Course course);
	public List<Course> getAllCourse();
	public void deleteCourseById(int cid);
	public Course updateCourse(Course course);
	public Course findCourseById(int cid);
	public Course findCourseByName(String cname);
	

}
