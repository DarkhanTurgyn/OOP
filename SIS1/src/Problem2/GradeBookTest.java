package Problem2;

import java.util.ArrayList;
import java.util.Arrays;

import problem1.Student;

public class GradeBookTest {

	public static void main(String[] args) {
		String[] pre = {"CSCI1203"};
		Course c = new Course("CSCI2106 Object Oriented Programming and Design", "oop)", 3, pre);
		
		ArrayList<Student> students = new ArrayList<Student>(Arrays.asList(new Student("Bekazat","18bd79513"),
																			new Student("Darkhan T.","18bd845"),
																			new Student("James","18BD8456"),
																			new Student("Kate","18BD8456"),
																			new Student("Bob","18BD89496"),
																			new Student("Lil","18BD86956"),
																			new Student("Tom","18BD87656"),
																			new Student("Someone","18BD8456"),
																			new Student("Erke","15")));
		GradeBook gb = new GradeBook(c, students);
		gb.displayMessage();
		gb.displayGradeReport();
	}
	
}
