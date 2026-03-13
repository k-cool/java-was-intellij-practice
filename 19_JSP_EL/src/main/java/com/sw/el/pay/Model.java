package com.sw.el.pay;

import javax.servlet.http.HttpServletRequest;

public class Model {

	public static void calc(HttpServletRequest request) {

		int earn = Integer.parseInt(request.getParameter("earn"));
		int spend = Integer.parseInt(request.getParameter("spend"));

		System.out.println(earn);
		System.out.println(spend);

		int remain = earn - spend;

		Result r = new Result(earn, spend, remain);

		request.setAttribute("r", r);

	}

}
