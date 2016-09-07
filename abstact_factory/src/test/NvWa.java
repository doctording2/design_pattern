package test;

import factory.FemaleFactory;
import factory.Human;
import factory.HumanFactory;
import factory.MaleFactory;


public class NvWa {
	
	public static void main(String args[])
	{
		//第一条生产线， 男性生产线
		HumanFactory maleHumanFactory = new MaleFactory();
		//第二条生产线， 女性生产线
		HumanFactory femaleHumanFactory = new FemaleFactory();
		//生产线建立完毕， 开始生产人了:
		Human maleBlackHuman = maleHumanFactory.createBlackHuman();
		Human femaleBlackHuman = femaleHumanFactory.createBlackHuman();
		System.out.println("---生产一个黑色女性---");
		femaleBlackHuman.getColor();
		femaleBlackHuman.talk();
		femaleBlackHuman.getSex();
		
		System.out.println("\n---生产一个黑色男性---");
		maleBlackHuman.getColor();
		maleBlackHuman.talk();
		maleBlackHuman.getSex();
		
	}
	
}
