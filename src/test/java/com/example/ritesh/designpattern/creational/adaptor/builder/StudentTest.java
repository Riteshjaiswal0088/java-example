package com.example.ritesh.designpattern.creational.adaptor.builder;

import com.example.ritesh.designpattern.creational.builder.Student;
import org.junit.jupiter.api.Test;

class StudentTest {

    @Test
    void testBuilder(){
        Student student = Student.builder()
                .id(123)
                .name("Hemant")
                .build();
        System.out.println(student);

    }

}