package com.sw.el.bmi;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BmiDTO {
    private String name;
    private String height;
    private String weight;
    private String bmi;
    private String status;
    private String pic;
}
