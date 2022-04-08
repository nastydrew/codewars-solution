package com.gymfox.kuy6.some_fun_with_aggregate_operations.part_3;

import com.gymfox.kuy6.some_fun_with_aggregate_operations.Student;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AggregationKata {
    public static Map<String, List<String>> getStudentNamesByDepartment(Stream<Student> students) {
        return students
                .collect(Collectors
                        .groupingBy(Student::getDepartment, Collectors.mapping(Student::getName, Collectors.toList())));
    }
}
