package com.web.team1.command;

import javax.servlet.http.HttpServletRequest;

public class Receiver {

	public static Command cmd = new Command();
	public static void init(HttpServletRequest request) {
		System.out.println("리시버진입");
		cmd = Commander.direct(request);
		System.out.println("리시버아웃");
	}
}
