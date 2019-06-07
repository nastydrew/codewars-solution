package com.gymfox.kuy6.aggregateoperation;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Part3 {
    public static Map<String, List<String>> getStudentNamesByDepartment(Stream<Student> students) {

        return students.collect(Collectors.groupingBy(Student::getDepartment, Collectors.mapping(Student::getName,
                Collectors.toList())));

    }
}
