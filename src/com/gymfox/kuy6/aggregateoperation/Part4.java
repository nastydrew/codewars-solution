package com.gymfox.kuy6.aggregateoperation;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Part4 {
    public static Map<String, Map<Student.Gender, Long>> getTheNumberOfStudentsByGenderForEachDepartment(Stream<Student> students) {

        return students.collect(Collectors.groupingBy(Student::getDepartment, Collectors.groupingBy
                (Student::getGender, Collectors.counting())));

    }
}
