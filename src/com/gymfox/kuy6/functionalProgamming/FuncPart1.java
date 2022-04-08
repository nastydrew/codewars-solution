package com.gymfox.kuy6.aggregateoperation.functionalProgamming;

import org.junit.Test;

import java.util.function.Function;

import static junit.framework.TestCase.assertTrue;

public class FuncPart1 {
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

    public static Function<Student, Boolean> f = s -> s.getFullName().equals("John Smith") && s.studentNumber.equals
            ("js123");

    @Test
    public void testJohnSmith() throws Exception {
        Student jSmith = new Student("John", "Smith", "js123");
        assertTrue("John Smith with student number js123 did not return true", FuncPart1.f.apply(jSmith));
    }
}

