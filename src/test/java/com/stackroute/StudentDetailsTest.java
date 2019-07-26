package com.stackroute;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

    public class StudentDetailsTest {


        @Before
        public void setUp() throws Exception {


        }

        @After
        public void tearDown() throws Exception {

        }

        @Test
        public void testStudent() {

            List<StudentDetails> students = new ArrayList<>();
            StudentDetails obj1 = new StudentDetails(1, "Afreen", 21);
            StudentDetails obj2 = new StudentDetails(2, "Sweety", 24);
            StudentDetails obj3 = new StudentDetails(3, "Reshma", 23);
            StudentDetails obj4 = new StudentDetails(4, "Afreen", 20);
            StudentDetails obj5 = new StudentDetails(5, "Ayesha", 34);
            StudentDetails obj6 = new StudentDetails(6, "Amaya", 22);
            students.add(obj1);
            students.add(obj2);
            students.add(obj3);
            students.add(obj4);
            students.add(obj5);
            students.add(obj6);

            //BEFORE SORTING
            Collections.sort(students,new StudentSorter());

            // After Sorting

            String expected="[Student{id=5, name='Ayesha', age=34}, Student{id=2, name='Sweety', age=24}, Student{id=3, name='Reshma', age=23}, Student{id=6, name='Amaya', age=22}, Student{id=1, name='Afreen', age=21}, Student{id=4, name='Afreen', age=20}]";
            assertEquals(expected, students.toString());


        }
    }
