package edu.poly.lab01;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import lombok.Data;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    String name;
    Boolean gender = false;
    Double marks = 0.0;

}
