package com.sw.sc;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.net.HttpCookie;

public class Model {

        /*
            param   - V에서 만든 값(html, jsp, get요청 만든 문자열, from -> input name)
                    - String, String[]
                    - req에 실려서 전송
                    - 값 읽을 때
                        - java: req.getParameter("이름")
                        - EL: ${param.이름}

            attr    - Java에서 주로 M에서 만든 값
                    - Object
                    - req에 실려서 전송
                    - 값 읽을 때
                        - java: req.getAttribute("이름")
                        - EL: ${이름}

            - 특성상 third에서 못씀

            session, cookie

        */

    public static void printSC(HttpServletRequest request) {
        /*

            session.attr
                 - 서버~~~클라이언트 연결상태에 담김.
                 - object 시간제한(기본 30분)
                 - 값 읽을때
                        - JAVA: req.getSession().getAttribute("이름")
                        - EL: ${이름} / ${sessionScope.이름} -> 이 방법 주로 사용하기

        */

        Object c = request.getSession().getAttribute("c");

        System.out.println("sesstion: " + c);

        /*
            cookie
                - 값 읽을때
                    - EL: ${cookie.이름.value}
                    - java: req.getCookies()
        */

        Cookie[] cookies = request.getCookies();

        for (Cookie cookie : cookies) {
            System.out.println(cookie.getName());

            if (cookie.getName().equals("d")) {
                System.out.println(cookie.getValue());
            }
        }
    }

    public static void make(HttpServletRequest request, HttpServletResponse response) {
        String a = request.getParameter("a");

        String bbb = "zzz";

        request.setAttribute("b", bbb);


        String ccc = "세션~~~!";

        HttpSession hs = request.getSession();

        hs.setAttribute("c", ccc);

        hs.setMaxInactiveInterval(10); // 10초


        /*

            서버와 클라이언트 연결상태(접속한거)
            연결만 사랑있으면 이사이트 어디에서든 사용 가능

            연결 끊어지면 못씀(접속 종료 / 브라우저 다 닫은거)
            세션 유지시간 (기본 30분)

            유지시간 이내에 '요청'등이 일어나지 않으면 죽음
            시간내에 '요청' 등 작업을 하면 갱신됨(유지시간 초기화)

         */

        /*
            cookie

            - 사용자 컴퓨터에 파일로 저장
            - 브라우저를 꺼도, 접속을 끊어도, 재부팅을 해도 살아있음.
            - 시간제한 걸 수 있음.

         */

        String ddd = "쿠키~~";

        Cookie coo = new Cookie("d", ddd);

        coo.setMaxAge(5 * 60); // 5분

        printSC(request);

        response.addCookie(coo);
    }
}
