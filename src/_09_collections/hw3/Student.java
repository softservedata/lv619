package _09_collections.hw3;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public final class Student{
	////////////////////////////////////////////////////////////////////////////
	static class ByCourseComparator implements Comparator<Student> {
		@Override
		public int compare(Student o1, Student o2) {
			return o1.getCourse() - o2.getCourse();
		}
	}
	////////////////////////////////////////////////////////////////////////////
	static class ByNameComparator implements Comparator<Student> {
		@Override
		public int compare(Student o1, Student o2) {
			return o1.getName().compareToIgnoreCase(o2.getName());
		}
	}
	////////////////////////////////////////////////////////////////////////////
	private String name;
	private int course;
	////////////////////////////////////////////////////////////////////////////
	Student(String name, int course) {
		this.name = name;
		this.course = course;
	}
	////////////////////////////////////////////////////////////////////////////
	public String getName() {return name;}
	public int getCourse() {return course;}
	////////////////////////////////////////////////////////////////////////////
	public static void printStudents(List<Student> students) {
		for(Student student: students)
			System.out.println(student);
	}
	////////////////////////////////////////////////////////////////////////////
	public static void printStudents(List<Student> students, int course) {
		Student currentStudent;
		for(Iterator<Student> i = students.iterator(); i.hasNext();) {
			currentStudent = i.next();
			if(currentStudent.getCourse() == course)
				System.out.println(currentStudent);
		}
	}
	////////////////////////////////////////////////////////////////////////////
	@Override	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + course;
		return result;
	}
	////////////////////////////////////////////////////////////////////////////
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		Student other = (Student) obj;
		if (course != other.course || (name == null && other.name != null)) return false;
		return name.equals(other.name);
	}
	////////////////////////////////////////////////////////////////////////////
	@Override
	public String toString() {
		return "name: " + getName() + "\tcourse: " + getCourse();
	}
	////////////////////////////////////////////////////////////////////////////
}