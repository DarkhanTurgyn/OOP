package Problem2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import problem1.Student;

public class GradeBook {
	private Course course;
	private ArrayList<Student> students;
	private ArrayList<Integer> grades = new ArrayList<Integer>();
	
	public GradeBook(Course course, ArrayList<Student> students) {
		this.course = course;
		this.students = students;
	}

	public void displayMessage() {
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to the grade book for " + course.getName() + "!");
		System.out.println("Please, input grades for students:\n");
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i));
			int grade = in.nextInt();
			grades.add(grade);
		}
		in.close();		
	}
		
	public void displayGradeReport() {
		int minPos = lowestGradeIndex();
		int maxPos = highestGradeIndex();
		System.out.println("Class average is " + determineClassAverage() + ".");
		System.out.println("Lowest grade is " + grades.get(minPos) + " " + students.get(minPos) + ".");
		System.out.println("Highest grade is " + grades.get(maxPos) + " " + students.get(maxPos) + ".");
		outputBarChart();
	}
	
	private double determineClassAverage() {
		double sum = 0;
		for (int grade: grades) sum += grade;
		return sum/grades.size();
	}
	
	private void outputBarChart() {
		String[] distr = new String[11];
		Arrays.fill(distr, "");
		for(int grade: grades) distr[grade/10] += '*';
		for (int i = 0; i < 10; i++) {
			System.out.println(i*10 + "-" + (i*10+9) + ": " + distr[i]);
		}
		System.out.println("100: " + distr[10]);
	}
	
	private int highestGradeIndex() {
		int maxPos = 0;
		for (int i = 0; i < grades.size(); i++) {
			if(grades.get(i)>grades.get(maxPos)) maxPos = i;
		}
		return maxPos;
	}
	
	private int lowestGradeIndex() {
		int minPos = 0;
		for (int i = 0; i < grades.size(); i++) {
			if(grades.get(i)<grades.get(minPos)) minPos = i;			
		}
		return minPos;
	}

	

	
	
	
}
