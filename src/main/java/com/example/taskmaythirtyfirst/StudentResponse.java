package com.example.taskmaythirtyfirst;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentResponse {
        private Integer id;
        private String name;
        private String grade;
        private String classroom;

}

