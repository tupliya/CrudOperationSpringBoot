package com.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.entity.Teachers;

public interface TeachersRepository extends JpaRepository<Teachers, Integer>{
	public Teachers findTeachersBytid(int tid);
	public Teachers findTeachersBytname(String tname);

}
