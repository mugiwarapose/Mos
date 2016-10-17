package com.pose.methodFactory;

public class Client {
	private static Creator creator1,creator2;
	private static  Product prod1,prod2;
	
	public static void main(String[] args) {
		creator1 = new ConcreteCreator1();
		creator2 = new ConcreteCreator2();
		
		prod1 = creator1.factory();
		System.out.println("---------------");
		prod2 = creator2.factory();
	}
}
