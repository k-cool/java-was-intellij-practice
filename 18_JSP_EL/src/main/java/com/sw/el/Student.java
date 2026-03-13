package com.sw.el;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    String name;
    double mid;
    double fin;
    String grade;
    double avg;
}
