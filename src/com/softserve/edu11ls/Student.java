package com.softserve.edu11ls;

import java.util.Comparator;

public class Student implements Comparable<Student> {

    public static class ByNameComparator implements Comparator<Student> {
        public int compare(Student st1, Student st2) {
            return st1.getName().compareTo(st2.getName());
            /*-
            return st1.getName().compareTo(st2.getName()) == 0
                    ? st1.getId() - st2.getId()
                    : st1.getName().compareTo(st2.getName());
            */
        }
    }

    public static class ByNameAndId implements Comparator<Student> {
        public int compare(Student st1, Student st2) {
            return st1.getName().compareTo(st2.getName()) == 0
                    ? st1.getId() - st2.getId()
                    : st1.getName().compareTo(st2.getName());
        }
    }
    public static class ByIdComparator implements Comparator<Student> {
        public int compare(Student st1, Student st2) {
            return st1.getId() - st2.getId();
        }
    }

    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        //System.out.println("Running equals");
        if (this == obj) {
            return true;
        }
        if ((obj == null) || (getClass() != obj.getClass())) {
            return false;
        }
        Student other = (Student) obj;
        if ((id != other.id) 
                || (name == null) && (other.name != null) 
                || (name != null) && (other.name == null)) {
            return false;
        }
        if ((name == null) && (other.name == null)) {
            return true;
        }
        return name.equals(other.name);
    }

    public int compareTo(Student obj) {
        //return name.compareTo(obj.name);
        //return id - obj.id;
        return getId() - obj.getId();
    }

    @Override
    public String toString() {
        return "\nStudent [name=" + name 
                + ", age=" + id 
                + "]";
    }

}
