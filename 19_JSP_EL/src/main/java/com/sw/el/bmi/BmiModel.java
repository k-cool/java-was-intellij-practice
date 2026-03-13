package com.sw.el.bmi;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;

public class BmiModel {
    public static void calc(HttpServletRequest request) throws IOException {

        String saveRealPath = request.getServletContext().getRealPath("/imgs");

        File dir = new File(saveRealPath);

        System.out.println("test");

        if (!dir.exists()) {
            dir.mkdirs();
        }

        MultipartRequest mr = new MultipartRequest(request, saveRealPath, 30 * 1024 * 1024, "UTF-8",
                new DefaultFileRenamePolicy());

        String name = mr.getParameter("name");
        double height = Double.parseDouble(mr.getParameter("height"));
        double weight = Double.parseDouble(mr.getParameter("weight"));
        double bmi = weight / ((height / 100) * (height / 100));
        String status = "";

        System.out.println("한글 로그 테스트");
        System.out.println(name);

        if (bmi < 18.5) {
            status = "저체중";
        } else if (bmi < 22.5) {
            status = "정상";
        } else if (bmi < 24.9) {
            status = "비만전단계";
        } else {
            status = "비만";
        }

        String pic = mr.getFilesystemName("pic");

        DecimalFormat df = new DecimalFormat("###.#");

        BmiDTO bmiDto = new BmiDTO(name, df.format(height), df.format(weight), df.format(bmi), status, pic);

        request.setAttribute("bmiDto", bmiDto);
    }
}
