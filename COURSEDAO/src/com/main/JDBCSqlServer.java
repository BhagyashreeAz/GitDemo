package com.main;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import com.dao.CourseDaoimpl;
import com.dao.CourseExistsException;
import com.dao.courseDao;
import com.model.Course;


public class JDBCSqlServer {

	public static void main(String args[])
	{
				

			System.out.println("***************Course************");
			
			courseDao courseDao1=new CourseDaoimpl();
			Course course=courseDao1.getCourse(101);
			System.out.println(course);
		
			/*System.out.println("***************ADD A COURSE***************");
			Course cour=new Course(106,45,"C#",4000);
			try {
				courseDao1.addCourse(cour);
			} catch (CourseExistsException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("***************UPDATE A COURSE***************");
		    Course toUpdateCourse=courseDao1.getCourse(106);
			toUpdateCourse.setCduration(40);
			
			courseDao1.updateCourse(toUpdateCourse);
			
			Course updatedCourse=courseDao1.getCourse(6);
			System.out.println(updatedCourse);
			
			
			System.out.println("***************DELETE A COURSE***************");
			Course toDelCourse=courseDao1.getCourse(105);
			courseDao1.deleteCourse(toDelCourse);
			Course deletedCourse=courseDao1.getCourse(105);
			System.out.println(deletedCourse);*/
			
			System.out.println("***************DISPLAY COURSE LIST***************");
			List<Course> allCourses=courseDao1.getAllCourses();
			for(Course cs:allCourses)
				System.out.println(cs);
			
			
			
			
	}
	
}
