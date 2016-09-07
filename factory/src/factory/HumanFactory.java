package factory;

public class HumanFactory extends AbstactHumanFactory{

	@Override
	public <T extends Human> T createHuman(Class<T> c) {
		
		Human human = null;
		try {
			human = (T)Class.forName(c.getName()).newInstance();
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException e) {
//			e.printStackTrace();
			System.out.println("human create error");
		}
		return (T)human;
	}

}
