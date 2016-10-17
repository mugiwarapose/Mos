package com.pose.abstractFactory;

public class Client {
	public static void main(String[] args) {
		Factory1 faca = new ConcreteFactory1();
		IProductA pa1 =faca.getProdA1();
		IProductB pb1 = faca.getProdB1();
		pa1.method();
		pb1.method();
		
		System.out.println("--------------------");
		Factory2 facb = new ConcreteFactory2();
		IProductA pa2 = facb.getProdA2();
		IProductB pb2 = facb.getProdB2();
		pa2.method();
		pb2.method();
	}
}
