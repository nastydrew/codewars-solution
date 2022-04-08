package com.gymfox.kuy7.functional_programming.part_1;

import java.util.function.Function;

/*
link: http://www.codewars.com/kata/java-functional-programming-part-1-the-beginning/java
 */

public class FunctionalProgramming {
    public static Function<Student, Boolean> f = student -> (student.equals("John Smith") && student.equals("js123"));

}

class Student {
    private final String firstName;
    private final String lastName;
    public final String studentNumber;

    public Student(String firstName, String lastName, String studentNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentNumber = studentNumber;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
    public String getCommaName() {
        return lastName + ", " + firstName;
    }
}