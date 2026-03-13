package com.sw.el.age;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Model {

    public static void calcAge(HttpServletRequest request) {
        int birth = Integer.parseInt(request.getParameter("birth"));

        // 올해 년도 구하는 방법 1
//        Date date = new Date();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
//        String year = sdf.format(date);

        // 올해 년도 구하는 방법 2
        int year = LocalDate.now().getYear();

        int age = year - birth + 1;

        Bean b = new Bean(age, birth);

        request.setAttribute("bean", b);

    }
}
