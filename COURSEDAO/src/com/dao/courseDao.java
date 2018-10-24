package com.dao;

import java.util.List;

import com.model.Course;

public interface courseDao
{
	
	
	String TABLEcourse="course",COLcid="cid",COLcname="cname",COLfees="fees";
	String COLcduration="cduration";

	
	Course getCourse(int cid);
	List<Course> getAllCourses();
	void addCourse(Course c) throws CourseExistsException;
	void updateCourse(Course c);
	void deleteCourse(Course c);
}
