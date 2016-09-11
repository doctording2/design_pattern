package com.test;

import java.util.HashMap;

public class SubExpression extends SymbolExpression {
	public SubExpression(Expression _left, Expression _right) {
		super(_left, _right);
	}

	// 把左右两个表达式运算的结果加起来
	public int interpreter(HashMap<String, Integer> var) {
		return super.left.interpreter(var) - super.right.interpreter(var);
	}
}