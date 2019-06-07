package com.gymfox.kuy7.function;

import org.junit.jupiter.api.Test;

import java.util.function.Function;

import static junit.framework.TestCase.assertTrue;

public class Solution {
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

    public static Function<Student, Boolean> f = s -> "John Smith".equals(s.getFullName())
            && "js123".equals(s.studentNumber);

    @Test
    public void testJohnSmith() throws Exception {
        Student jSmith = new Student("John", "Smith", "js123");
        assertTrue("John Smith with student number js123 did not return true", Solution.f.apply(jSmith));
    }
}

