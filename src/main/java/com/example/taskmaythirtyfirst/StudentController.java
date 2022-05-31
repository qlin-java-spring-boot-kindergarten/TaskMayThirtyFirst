package com.example.taskmaythirtyfirst;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/students")
    public List<StudentResponse> getStudentResponse() {
        List<StudentResponse> studentResponse = new ArrayList<>();

        StudentResponse studentResponseOne = new StudentResponse();
        studentResponseOne.setId(1);
        studentResponseOne.setName("aaaaa");
        studentResponseOne.setGrade("3");
        studentResponseOne.setClassroom("1");

        StudentResponse studentResponseTwo = new StudentResponse();
        studentResponseTwo.setId(2);
        studentResponseTwo.setName("bbbbb");
        studentResponseTwo.setGrade("1");
        studentResponseTwo.setClassroom("1");

        studentResponse.add(studentResponseOne);
        studentResponse.add(studentResponseTwo);

        return studentResponse;
    }
}
