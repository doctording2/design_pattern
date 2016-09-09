package com.test;

import com.adapter.Adapter;
import com.target.ConcreteTarget;
import com.target.Target;

public class Client {
	public static void main(String[] args) {
		// 原有的业务逻辑
		Target target = new ConcreteTarget();
		target.request();
		// 现在增加了适配器角色后的业务逻辑
		Target target2 = new Adapter();
		target2.request();
	}
}