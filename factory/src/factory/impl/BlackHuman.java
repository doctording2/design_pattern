package factory.impl;

import factory.Human;

public class BlackHuman implements Human{

	@Override
	public void getColor() {
		System.out.println("black color");
	}

	@Override
	public void talk() {
		System.out.println("black talk");
	}

}
