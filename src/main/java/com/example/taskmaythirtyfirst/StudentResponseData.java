package com.example.taskmaythirtyfirst;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentResponseData {
        private Integer id;
        private String name;
        private String grade;
        private String classroom;

}

