package com.gymfox.kuy6.aggregateoperation;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Part1 {
    public static Map<String, Double> getAverageGradeByDepartment(Stream<com.gymfox.kuy6.aggregateoperation.Student> students) {
        return students.collect(Collectors.groupingBy(Student::getDepartment, Collectors.averagingDouble
                (Student::getGrade)));
    }
}