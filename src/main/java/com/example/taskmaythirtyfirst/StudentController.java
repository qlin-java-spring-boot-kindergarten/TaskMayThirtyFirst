package com.example.taskmaythirtyfirst;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/students")
    public String getStudentData() {
        return "Hello!";
    }


}
