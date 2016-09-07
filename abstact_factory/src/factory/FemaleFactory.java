package factory;

import factory.impl.FemaleBlackHuman;
import factory.impl.FemaleWhiteHuman;

public class FemaleFactory implements HumanFactory{

	
	public Human createBlackHuman() {
		return new FemaleBlackHuman();
	}

	public Human createWhiteHuman() {
		return new FemaleWhiteHuman();
	}

}
