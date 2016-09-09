package com.adapter;

import com.adaptee.Adaptee;
import com.target.Target;

public class Adapter extends Adaptee implements Target {
	public void request() {
		super.doSomething();
	}
}