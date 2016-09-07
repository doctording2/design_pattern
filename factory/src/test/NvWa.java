package test;
import factory.AbstactHumanFactory;
import factory.Human;
import factory.HumanFactory;
import factory.impl.BlackHuman;
import factory.impl.WhiteHuman;


public class NvWa {
	
	public static void main(String args[])
	{
		AbstactHumanFactory factory = new HumanFactory();
		
		//女娲第一次造人，火候不足，于是白人产生了
		System.out.println("--造出的第一批人是白色人种--");
		Human whiteHuman = factory.createHuman(WhiteHuman.class);
		whiteHuman.getColor();
		whiteHuman.talk();
		
		//女娲第二次造人，火候过足，于是黑人产生了
		System.out.println("\n--造出的第二批人是黑色人种--");
		Human blackHuman = factory.createHuman(BlackHuman.class);
		blackHuman.getColor();
		blackHuman.talk();
	}
	
}
