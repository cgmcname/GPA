package GPA;

import java.io.*; 
import java.util.*; 
import java.util.ArrayList;
import java.util.List;
import java.lang.*;

public class Student 
{
	private String name;
	private int id = 0;
	private double gradeAvg;
	private double hourTotal;
	
	static private int members = 0;
	
	//private Classes test;
	List<Classes> courseLoad = new ArrayList<>();
	
	Student()
	{
		
		name = "";
		id = ++members;
		//setList();
		
		
	
	}
	
	
	Student(String n)
	{
		this();
		name = n;
		
	}
	
	String getName() 
	{
		return name;
	}
	
	void setName (String n)
	{
		name = n;
	}
	
	int getID()
	{
		return id;
	}
	
	void setID(int i)
	{
		id = i;
	}
	
	void setList(String n, int cNumber, String sem, int cHours, char g) 
	{
		courseLoad.add(new Classes(n, cNumber, sem, cHours, Character.toUpperCase(g)));
		
		
	}
	//double getClassGradePoint()
	//{
	//	return test.getGradePoint();
	//}

	void showClasses()
	{
		courseLoad.forEach(Classes -> {
            System.out.println("Name : " + Classes.getCourseName() + ", Semester : " + Classes.getCourseSemseter());
        });
	}
	
	void howManyClasses() 
	{
		System.out.println(courseLoad.size());
	}
	
	double calClasses()
	{
		gradeAvg = 0;
		hourTotal = 0;
		
		
		courseLoad.forEach(Classes -> {
			gradeAvg += Classes.getGradePoint() * Classes.getCourseHours();
			hourTotal += Classes.getCourseHours();
        });
		
		
		gradeAvg = gradeAvg/hourTotal;
		
		
		return gradeAvg;
	}
	
	double calDClasses()
	{
		gradeAvg = 0;
		hourTotal = 0;
		
		courseLoad.forEach(Classes -> {
			if (Classes.getGrade() == 'D') 
			{
			//gradeAvg += Classes.getGradePoint() * Classes.getCourseHours();
			hourTotal += Classes.getCourseHours();
			}
        });
		
		
		//gradeAvg = gradeAvg/hourTotal;
		
		
		return hourTotal;
	}
	
	double calSemesterClasses(String sem)
	{
		gradeAvg = 0;
		hourTotal = 0;
		
		
		
		courseLoad.forEach(Classes -> {
			if (Classes.getCourseSemseter() == sem) 
			{
			gradeAvg += Classes.getGradePoint() * Classes.getCourseHours();
			hourTotal += Classes.getCourseHours();
			//System.out.println( "Semester : " + sem);
			}
        });
		
		
		gradeAvg = gradeAvg/hourTotal;
		
		
		return gradeAvg;
	}
	
	
	
}
