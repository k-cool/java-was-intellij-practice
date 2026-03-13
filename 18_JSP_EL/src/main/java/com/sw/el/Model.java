package com.sw.el;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

public class Model {
    public static void calc(HttpServletRequest request) {
        String name = request.getParameter("name");
        double mid = Double.parseDouble(request.getParameter("mid"));
        double fin = Double.parseDouble(request.getParameter("fin"));

        double avg = (mid + fin) / 2;

        String grade = "F";

        if (avg > 90)
            grade = "A";
        else if (avg > 80)
            grade = "B";
        else if (avg > 70)
            grade = "C";
        else grade = "D";

        Student std = new Student(name, mid, fin, grade, avg);

        request.setAttribute("std", std);

        ///////////////////////////////////////

        request.setAttribute("a", "ksw");
        request.setAttribute("b", 12);

        int[] iArr = {1, 2, 3};
        request.setAttribute("iArr", iArr);

        /*
             int[] arr2 = new int[2];
             - 해당 타입의 배열을 초기화함.
         */
        Student[] sArr = new Student[2];

        sArr[0] = std;
        sArr[1] = new Student("sw", 100, 90, "A", 95);

        request.setAttribute("sArr", sArr);

        ArrayList<Student> stds = new ArrayList<>();
        stds.add(std);
        stds.add(sArr[0]);
        stds.add(sArr[1]);

        request.setAttribute("stds", stds);

    }
}
