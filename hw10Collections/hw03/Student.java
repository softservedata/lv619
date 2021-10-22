package hw10Collections.hw03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student implements Comparable<Student> {
	
	
	public static class NameAndCourseComparator implements Comparator<Student> {
		public int compare(Student st1, Student st2) {
			if(st1.getCourse() - st2.getCourse() == 0) {
				return st1.getName().compareTo(st2.getName());
			}
			return st1.getCourse() - st2.getCourse();
		}
	}
	
	
	
	private String name;
	private int course;
	
	public Student() {}	
	
	public Student(String name, int course) {
		this.course = course;
		this.name = name;
	}
	
	public  int getCourse() {
		return this.course;
	}
	
	public String getName() {
		return this.name;
	}
	@Override
	public String toString() {
		return "Students name: " + this.getName() + ", course: " + this.getCourse();
	}
	
	public static void printStudents(List<Student> students, int course) {
		/*- work uncorrectly, but why?
		Iterator<Student> iterator = students.iterator();
		while(iterator.hasNext()) {
			if (iterator.next().getCourse() == (course-1)) {
				System.out.println(iterator
						.next().toString());
			}
		}
		*/
		///*-
		for (Student stud : students) {
			if( stud.getCourse() == course) {
				System.out.println(stud.toString());
			}
		}
		//*/
	}
	
	public int compareTo(Student st) {
		if (this.getName().toLowerCase().compareTo(st.getName().toLowerCase()) == 0) {
			return (this.getCourse() - st.getCourse());
		}
		return (this.getName().toLowerCase().compareTo(st.getName().toLowerCase()));
	}
	
	
	public static void main (String[] args) {
		
		List<Student> stud = new ArrayList<>();
		stud.add(new Student("Roman", 5));
		stud.add(new Student("Ivan", 3));
		stud.add(new Student("Petro", 4));
		stud.add(new Student("Pavlo", 1));
		stud.add(new Student("Taras", 2));
		
		
		for (int i = 0; i < stud.size(); i++) {
			System.out.println(stud.get(i));
		}
		
		Collections.sort(stud);
		System.out.println("Sorted by name:");
		for (int i = 0; i < stud.size(); i++) {
			System.out.println("\t" + stud.get(i));
		}
		
		Collections.sort(stud, new NameAndCourseComparator());
		System.out.println("Sorted by course:");
		for (int i = 0; i < stud.size(); i++) {
			System.out.println("\t" + stud.get(i));
		}
		
		Student.printStudents(stud, 3);
	}

}
