package com.gymfox.kuy6.some_fun_with_aggregate_operations.part_4;

import com.gymfox.kuy6.some_fun_with_aggregate_operations.Student;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;

public class AggregationKata {
    public static Map<String, Map<Student.Gender, Long>> getTheNumberOfStudentsByGenderForEachDepartment(Stream<Student> students) {
        return students.collect(Collectors.groupingBy(Student::getDepartment, Collectors.groupingBy(Student::getGender, counting())));
    }
}
