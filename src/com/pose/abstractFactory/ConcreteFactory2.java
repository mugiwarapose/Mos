package com.pose.abstractFactory;

public class ConcreteFactory2 extends Factory2 {

	@Override
	ProductA2 getProdA2() {
		// TODO Auto-generated method stub
		return new ProductA2();
	}

	@Override
	ProductB2 getProdB2() {
		// TODO Auto-generated method stub
		return new ProductB2();
	}

}
