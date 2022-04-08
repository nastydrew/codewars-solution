package com.gymfox.kuy6.some_fun_with_aggregate_operations.part_3;

import com.gymfox.kuy6.some_fun_with_aggregate_operations.Student;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static com.gymfox.kuy6.some_fun_with_aggregate_operations.part_3.AggregationKata.*;
import static org.junit.jupiter.api.Assertions.*;

public class AggregationKataTest {

    private Student[] students;

    @Before
    public void setUp() {

        //Generate a basic array of students:
        Student galina = new Student("Galina", 95, "Philology", Student.Gender.FEMALE);
        Student jack = new Student("Jack", 82, "Philology", Student.Gender.MALE);
        Student mike = new Student("Mike", 60, "Philology", Student.Gender.MALE);
        Student anton = new Student("Anton", 90, "CS", Student.Gender.MALE);
        Student jane = new Student("Jane", 65, "CS", Student.Gender.FEMALE);

        students = new Student[]{galina, anton, jack, mike, jane};

    }

    @Test
    public void basicTestGetStudentNamesByDepartment() throws Exception {

        Map<String, List<String>> actual = getStudentNamesByDepartment(Arrays.stream(students));
        List<String> list1 = new ArrayList<>(Arrays.asList("Galina", "Jack", "Mike"));
        List<String> list2 = new ArrayList<>(Arrays.asList("Anton", "Jane"));
        Map<String, List<String>> expected = new HashMap<>();
        expected.put("Philology", list1);
        expected.put("CS", list2);

        assertEquals(expected, actual);

    }

}