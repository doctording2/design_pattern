package com.template;

public abstract class AbstractClass {
	// 基本方法
	protected abstract void doSomething();

	// 基本方法
	protected abstract void doAnything();

	// 模板方法
	public final void templateMethod() {
		/*
		 * 调用基本方法， 完成相关的逻辑
		 */
		System.out.println("模板方法 start");
		this.doAnything();
		this.doSomething();
		System.out.println("模板方法 end");
	}
}