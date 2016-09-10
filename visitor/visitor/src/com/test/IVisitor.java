package com.test;

public interface IVisitor {
	// 首先， 定义我可以访问普通员工
	public void visit(CommonEmployee commonEmployee);

	// 其次， 定义我还可以访问部门经理
	public void visit(Manager manager);
}

/*
我只要再产生一个IVisitor的实现类就可以产生一个新
的报表格式， 而其他的类都不用修改， 如果你用Spring开发， 那就更好了， 在Spring的配置
文件中使用的是接口注入， 我只要把配置文件中的 ref修改一下就行了， 其他的都不用修改
了！ 这就是访问者模式的优势所在。
*/