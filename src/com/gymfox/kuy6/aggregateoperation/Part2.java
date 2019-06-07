package com.gymfox.kuy6.aggregateoperation;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Part2 {
    public static Map<String, Long> getNumberOfStudentsByDepartment(Stream<Student> students) {
        return students.collect(Collectors.groupingBy(Student::getDepartment, Collectors.counting()));
    }
}
