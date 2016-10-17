package com.pose.methodFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("YYYYMM");
		Long l = Long.parseLong(df.format(date));
		System.out.println(l);
	}
}
