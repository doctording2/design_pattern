package factory.impl;

import factory.Human;

public class WhiteHuman implements Human{

	@Override
	public void getColor() {
		System.out.println("white color");
	}

	@Override
	public void talk() {
		System.out.println("white talk");
	}

}
