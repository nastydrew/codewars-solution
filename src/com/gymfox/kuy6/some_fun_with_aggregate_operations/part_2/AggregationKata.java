package com.gymfox.kuy6.some_fun_with_aggregate_operations.part_2;

import com.gymfox.kuy6.some_fun_with_aggregate_operations.Student;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AggregationKata {
    public static Map<String, Long> getNumberOfStudentsByDepartment(Stream<Student> students) {
        return students.collect(Collectors.groupingBy(Student::getDepartment, Collectors.counting()));
    }
}
