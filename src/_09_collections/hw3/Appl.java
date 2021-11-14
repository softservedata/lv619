package _09_collections.hw3;
import java.util.List;
import java.util.LinkedList;

import static __myLib.Rand.randInt;
import static __myLib.Rand.randLettersStringTitleCase;

public class Appl {
	////////////////////////////////////////////////////////////////////////////	
	//	Write class Student that provides information about the name of the student and his course.
	//	Class Student should consist of
	//	a)properties for access to these fields
	//	b)constructor with parameters
	//	c)method printStudents (List students, Integer course),
	//	which receives a list of students and the course number and
	//	prints to the console the names of the students from the list,
	//	which are taught in this course (use an iterator)
	//	d)methods to compare students by name and by course
	//	e)In the main() method 
	//	 - declare List students and add to the list five different students
	//	 - display the list of students ordered by name
	//	 - display the list of students ordered by course.
	////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		List<Student> students = new LinkedList<>();
		while(students.size() != 5) {
			Student student = new Student(randLettersStringTitleCase(), randInt(1, 5));
			if(!students.contains(student))
			students.add(student);
		}
		System.out.println("\t\t\t\torigin:");
		Student.printStudents(students);
		System.out.println("\t\t\t\tordered by name:");
		students.sort(new Student.ByNameComparator());
		Student.printStudents(students);
		System.out.println("\t\t\t\tordered by course:");
		students.sort(new Student.ByCourseComparator());
		Student.printStudents(students);
	}
	////////////////////////////////////////////////////////////////////////////
}