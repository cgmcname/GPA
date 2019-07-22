package GPA;


import java.lang.*;

public class Classes 
{
   private String courseName;
   private int courseNumber;
   private int courseHours;
   private String semester;
   private char grade;
   private double gradePoint;
   
   Classes()
   {
	   courseName = "";
	   courseNumber = -1;
	   semester = "";
	   courseHours = 0;
	   grade = ' ';
	   gradePoint = -1.0;
	   
   }
   
   Classes(String cName, int cNumber, String sem, int cHours, char g)
   {
	   this();
	   courseName = cName;
	   courseNumber = cNumber;
	   semester = sem;
	   courseHours = cHours;
	   grade = Character.toUpperCase(g);
	   gradePoint = calGradePoint(grade);
	   
   }
   
   double calGradePoint(char g)
   {
	   if(g == 'A')
	   {
		   return 4.0;
	   }
	   else if (g == 'B')
	   {
		   return 3.0;
	   }
	   else if (g == 'C')
	   {
		   return 2.0;
	   }
	   else if (g == 'D')
	   {
		   return 1.0;
	   }
	   else 
	   {
		   return 0.0;
	   }
   }
   
   String getCourseName() 
	{
		return courseName;
	}
   
   void setName(String cName) 
   {
	   courseName = cName;
   }
   
   int getCourseNumber() 
	{
		return courseNumber;
	}
   
   void setCourseNumber(int cNumber) 
   {
	   courseNumber = cNumber;
   }
   
   String getCourseSemseter() 
	{
		return semester;
	}
   
   void setCourseSemseter(String sem) 
   {
	   semester = sem;
   }
   
   int getCourseHours() 
	{
		return courseHours;
	}
  
  void setCourseHours (int cHours) 
  {
	  courseHours = cHours;
  }
   
   char getGrade() 
  	{
  		return grade;
  	}
     
   void setGrade(char g) 
   	{
	   grade = Character.toUpperCase(g);
   	}
   
   Double getGradePoint() 
   {
	   return gradePoint;
   }
}
