package com.pose.abstractFactory;

public class ConcreteFactory1 extends Factory1 {

	@Override
	ProductA1 getProdA1() {
		// TODO Auto-generated method stub
		return new ProductA1();
	}

	@Override
	ProductB1 getProdB1() {
		// TODO Auto-generated method stub
		return new ProductB1();
	}

}
