package com.cmd;

public class Client {
	
	public static void main(String args[]){
		//定义我们的接头人
		Invoker xiaoSan = new Invoker(); //接头人就是小三
		//定义接收者
		Receiver receiver = new ReceiverPageGroup();
		
		//客户要求增加一项需求
		System.out.println("------------客户要求删除一个页面---------------");
		Command command = new DeleteCommand(receiver);
		//接头人接收到命令
		xiaoSan.setCommand(command);
		//接头人执行命令
		xiaoSan.action();
		
		
		//客户要求增加一项需求
		System.out.println("------------客户要求删除代码---------------");
		receiver = new ReveiverCodeGroup();
		command = new DeleteCommand(receiver);
		//接头人接收到命令
		xiaoSan.setCommand(command);
		//接头人执行命令
		xiaoSan.action();
		
		//客户要求增加一项需求
		System.out.println("------------客户要求增加需求---------------");
		receiver = new ReveiverRequirementGroup();
		command = new AddCommand(receiver);
		//接头人接收到命令
		xiaoSan.setCommand(command);
		//接头人执行命令
		xiaoSan.action();
	}
	
}
