package com.sw.el.attr;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Model {

	public static void getExchange(HttpServletRequest request, HttpServletResponse response) {
		int price = Integer.parseInt(request.getParameter("p"));
		int money = Integer.parseInt(request.getParameter("m"));

		int ex = money - price;

		String say = "잔돈 여기있습니다~~~";

		if (price == money) {
			say = "감사합니다.";
		} else if (price > money) {
			say = "돈 모자른데요?.. -_-";
		}

		request.setAttribute("price", price);
		request.setAttribute("money", money);
		request.setAttribute("ex", ex);
		request.setAttribute("say", say);
		request.setAttribute("say", say);

		Result r = new Result(price, money, ex, say);
		request.setAttribute("r", r);

	}

	public static void makeValue(HttpServletRequest request, HttpServletResponse response) {
		int test = Integer.parseInt(request.getParameter("test"));

		if (test < 0)
			test *= -1;

		request.setAttribute("posTest", test);
	}
}
