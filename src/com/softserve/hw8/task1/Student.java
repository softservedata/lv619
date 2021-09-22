package com.softserve.hw8.task1;

public class Student extends Person{
    private int course;

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        setCourse(course);
    }

    @Override
    public String info() {
        return super.info() + String.format(", Course number: %d", getCourse());
    }

    @Override
    public String activity() {
        return "I study at university";
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
}
