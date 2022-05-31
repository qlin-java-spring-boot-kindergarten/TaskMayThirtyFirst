package com.example.taskmaythirtyfirst;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/students")
    public StudentResponse getStudentResponse() {
        List<StudentResponseData> studentResponseData = getStudentResponseData();
        StudentResponse studentResponse = new StudentResponse();
        studentResponse.setData(studentResponseData);

        return studentResponse;
    }

    private List<StudentResponseData> getStudentResponseData() {
        List<StudentResponseData> studentResponseData = new ArrayList<>();

        StudentResponseData studentResponseDataOne = new StudentResponseData();
        studentResponseDataOne.setId(1);
        studentResponseDataOne.setName("aaaaa");
        studentResponseDataOne.setGrade("3");
        studentResponseDataOne.setClassroom("1");

        StudentResponseData studentResponseDataTwo = new StudentResponseData();
        studentResponseDataTwo.setId(2);
        studentResponseDataTwo.setName("bbbbb");
        studentResponseDataTwo.setGrade("1");
        studentResponseDataTwo.setClassroom("1");

        studentResponseData.add(studentResponseDataOne);
        studentResponseData.add(studentResponseDataTwo);
        return studentResponseData;
    }
//
//    @GetMapping("/students")
//    public List<StudentResponse> getStudentResponse() {
//        List<StudentResponse> studentResponse = new ArrayList<>();
//
//        StudentResponse studentResponseOne = new StudentResponse();
//        studentResponseOne.setId(1);
//        studentResponseOne.setName("aaaaa");
//        studentResponseOne.setGrade("3");
//        studentResponseOne.setClassroom("1");
//
//        StudentResponse studentResponseTwo = new StudentResponse();
//        studentResponseTwo.setId(2);
//        studentResponseTwo.setName("bbbbb");
//        studentResponseTwo.setGrade("1");
//        studentResponseTwo.setClassroom("1");
//
//        studentResponse.add(studentResponseOne);
//        studentResponse.add(studentResponseTwo);
//
//        return studentResponse;
//    }
}
