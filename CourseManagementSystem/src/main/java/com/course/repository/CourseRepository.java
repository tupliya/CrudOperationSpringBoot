package com.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.entity.Course;

public interface CourseRepository extends JpaRepository<Course,Integer>{
	public Course findCourseBycid(int cid);
	public Course findCourseBycname(String cname);

}
