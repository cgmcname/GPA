package GPA;

import javax.swing.JOptionPane;
import javax.swing.JFrame;


public class Main 
{

	public static void main(String[] args) 
	{
		
		char select;
		
		String name;
		String option;
		String courseName;
		String courseNumber;
		String semester = "";
		String courseHours;
		String grade;
		
		JOptionPane.showMessageDialog(null, "Hello, welcome to windowed GPA calculator","", 
		JOptionPane.PLAIN_MESSAGE);
		
		do { 
		name = JOptionPane.showInputDialog(null, "Please enter the student's name", 
		"Student name",JOptionPane.QUESTION_MESSAGE);
		}while(name == null);
		
		
		Student two = new Student(name);
		
		
		JOptionPane.showMessageDialog(null, "Which of the following options do you wish to execute?\nAdd Class: type A\nRemove Class: type B\nExit Class entry: type Q","", 
				JOptionPane.PLAIN_MESSAGE);
		
		option = JOptionPane.showInputDialog(null, "Input Selection", 
				"Options",JOptionPane.QUESTION_MESSAGE);
		
		System.out.println(option);
		
		
		
		select = Character.toUpperCase(option.charAt(0));
		
		while(select != 'Q')
		{
			if (select == 'A')
			{
				JOptionPane.showMessageDialog(null, "Input following Class values","", 
						JOptionPane.PLAIN_MESSAGE);
				courseName = JOptionPane.showInputDialog(null, "Input Selection", 
						"Class Name",JOptionPane.QUESTION_MESSAGE);
				courseNumber = JOptionPane.showInputDialog(null, "Input Selection", 
						"Class Number",JOptionPane.QUESTION_MESSAGE);
				semester = JOptionPane.showInputDialog(null, "Input Selection", 
						"Semster Class was Taken",JOptionPane.QUESTION_MESSAGE);
				courseHours = JOptionPane.showInputDialog(null, "Input Selection", 
						"Cedit Hours",JOptionPane.QUESTION_MESSAGE);
				grade = JOptionPane.showInputDialog(null, "Input Selection", 
						"Grade",JOptionPane.QUESTION_MESSAGE);
				
				two.setList(courseName, Integer.parseInt(courseNumber), semester, Integer.parseInt(courseHours), Character.toUpperCase(grade.charAt(0)));	
			}
		
			System.out.println("");
		
			System.out.println(two.getName());
			//System.out.println(two.getID());
		
			System.out.println("");
	
		
			//two.setList("Math", 9922, "Sping 2011", 3, 'd');
			//two.setList("Math", 9922, "Fall 2011", 3, 'A');
			//two.setList("Math", 9922, "Sping 2011", 3, 'D');
			//two.setList("Math", 9922, "Sping 2011", 4, 'd');
		
		
		
		
			System.out.println(two.calClasses());
			System.out.println(two.calSemesterClasses(semester));
			
			two.showClasses();
			
			JOptionPane.showMessageDialog(null, "Which of the following options do you wish to execute?\nAdd Class: type A\nRemove Class: type B\nExit System: type Q","", 
					JOptionPane.PLAIN_MESSAGE);
			
			option = JOptionPane.showInputDialog(null, "Input Selection", 
					"Options",JOptionPane.QUESTION_MESSAGE);
			select = Character.toUpperCase(option.charAt(0));
		}
			System.exit(0);
		
	}
	

}
