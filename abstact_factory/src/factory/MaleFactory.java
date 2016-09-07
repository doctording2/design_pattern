package factory;

import factory.impl.MaleBlackHuman;
import factory.impl.MaleWhiteHuman;

public class MaleFactory implements HumanFactory{

	
	public Human createBlackHuman() {
		return new MaleBlackHuman();
	}

	public Human createWhiteHuman() {
		return new MaleWhiteHuman();
	}

}